package cn.sowell.copframe.dto.ajax;

public abstract class ResponseJSON {
	public abstract String getJson();
	
	@Override
	public String toString() {
		return getJson();
	}
}
