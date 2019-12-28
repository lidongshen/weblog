// 基于准备好的dom，初始化echarts实例
var myChart = echarts.init(document.getElementById('hourpv'));

// 指定图表的配置项和数据
myChart.setOption({
    title: {
        text: '每小时pv量',
        textStyle:{
            color:'rgba(255,255,255)'
        },
        left:20,
        top:10
    },
    tooltip: {},
    legend: {
        data:['pv']
    },
    xAxis: [{
        type: 'category',
        axisLabel:  {
            textStyle: {
                color: "rgba(255,255,255)"
            },
        },
        axisLine: {
            lineStyle: {
                color: 'rgba(255,255,255)'
            }

        },
        data: []
    }],
    yAxis:[{
        type: 'value',
        axisLine: {
            lineStyle: {
                color: 'rgba(255,255,255)'
            }
        },
        axisLabel:  {
            textStyle: {
                color: "rgba(255,255,255)",
            },
        },
        splitLine: {
            lineStyle: {
                color: 'rgba(255,255,255)'
            }
        }
    }],
    series: [{
        name: 'pv量',
        type: 'bar',
        // 高亮样式。
        itemStyle: {
            normal: {
                color: new echarts.graphic.LinearGradient(
                    0, 0, 0, 1,
                    [
                        {offset: 0, color: '#83bff6'},
                        {offset: 0.5, color: '#188df0'},
                        {offset: 1, color: '#188df0'}
                    ]
                )
            },
            emphasis: {
                color: new echarts.graphic.LinearGradient(
                    0, 0, 0, 1,
                    [
                        {offset: 0, color: '#2378f7'},
                        {offset: 0.7, color: '#2378f7'},
                        {offset: 1, color: '#83bff6'}
                    ]
                )
            }
        },
        data: []
    }]
});

// 使用刚指定的配置项和数据显示图表。
$.ajax({
    url:"getHourAll",
    type:"GET",
    success:function (msg) {
        var jsonarr=eval("("+msg+")");
        var data=[];
        var xdata=[];
        for(var i in jsonarr){
            xdata.push(jsonarr[i].hour)
            data.push(jsonarr[i].countpv)
        }

        myChart.setOption({
            xAxis: {
                data: xdata
            },
            series: [{
                // 根据名字对应到相应的系列
                name: 'pv量',
                data: data
            }]
        });
    }

})

