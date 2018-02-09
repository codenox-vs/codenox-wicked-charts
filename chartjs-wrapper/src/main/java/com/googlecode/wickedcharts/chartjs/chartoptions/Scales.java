package com.googlecode.wickedcharts.chartjs.chartoptions;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Scales {
	private List<AxesScale> xAxes;
	
	@JsonProperty("yAxes")
	private List<AxesScale> yAxes;
}
