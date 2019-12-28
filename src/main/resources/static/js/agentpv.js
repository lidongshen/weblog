// 基于准备好的dom，初始化echarts实例
var myChart2 = echarts.init(document.getElementById('agentpv'));
agent={
    title: {
        text: '浏览器使用量',
        left: 'center',
        top: 20,
        textStyle: {
            color: 'rgba(255,255,255)'
        }
    },
    tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    visualMap: {
        show: false,
        min: 80,
        max: 600,
        inRange: {
            colorLightness: [0, 1]
        }
    },
    series : [
        {
            name:'pv量',
            type:'pie',
            radius : '55%',
            center: ['50%', '50%'],
            data:[].sort(function (a, b) { return a.value - b.value; }),
            roseType: 'radius',
            label: {
                normal: {
                    textStyle: {
                        color: 'rgba(255, 255, 255)'
                    }
                }
            },
            labelLine: {
                normal: {
                    lineStyle: {
                        color: 'rgba(255, 255, 255)'
                    },
                    smooth: 0.2,
                    length: 10,
                    length2: 20
                }
            },
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
            }
        }
    ]
    };
// 指定图表的配置项和数据
myChart2.setOption(agent);


// 使用刚指定的配置项和数据显示图表。

$.ajax({
    url:"getagentall",
    type:"GET",
    success:function (msg) {
        console.log(msg)
        var jsonarr=eval("("+msg+")");
        var data=[]
        for(var i in jsonarr){
            var jsondata={};
            jsondata.value=jsonarr[i].countpv
            jsondata.name=jsonarr[i].agent
            data.push(jsondata);

        }
        myChart2.setOption({
            series: [{
                // 根据名字对应到相应的系列
                name: 'pv量',
                data: data
            }]
        });
    }

})


