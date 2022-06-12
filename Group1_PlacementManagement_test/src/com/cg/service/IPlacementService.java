package com.cg.service;

import com.cg.entities.Placement;


public interface IPlacementService 
{
	public Placement addPlacement(Placement placement);
	public Placement updatePlacement(Placement placement);
	public Placement searchPlacementById(int id);
	public Placement cancelPlacement(Placement placement);
	// Added for college service
	public Placement schedulePlacement(Placement placement);
}
