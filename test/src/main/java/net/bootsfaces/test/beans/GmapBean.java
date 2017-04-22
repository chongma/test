package net.bootsfaces.test.beans;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

@Named
@ViewScoped
public class GmapBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private MapModel mapModel;
	private LatLng latLng;
	
	private String googleMapsKey;

	public void onload() {
		setGoogleMapsKey("thekey");
		loadMap();
	}

	private void loadMap() {
		setMapModel(new DefaultMapModel());
		setLatLng(new LatLng(Double.parseDouble("36.014681"), Double.parseDouble("-5.604337")));
		getMapModel().addOverlay(new Marker(getLatLng(), "Tarifa"));
	}

	public MapModel getMapModel() {
		return mapModel;
	}

	public void setMapModel(MapModel mapModel) {
		this.mapModel = mapModel;
	}

	public LatLng getLatLng() {
		return latLng;
	}

	public void setLatLng(LatLng latLng) {
		this.latLng = latLng;
	}

	public String getGoogleMapsKey() {
		return googleMapsKey;
	}

	public void setGoogleMapsKey(String googleMapsKey) {
		this.googleMapsKey = googleMapsKey;
	}
}
