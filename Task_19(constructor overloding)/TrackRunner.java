class TrackRunner{
	public static void main(String[] args){
		
		Track track = new Track();
		System.out.println("The track type:" +track.type);
		System.out.println("The track surfaceMaterial:" +track.surfaceMaterial);
		System.out.println("The track lengthMeters:" +track.lengthMeters);
		System.out.println("The track lanes:" +track.lanes);
		System.out.println("The track have floodLights:" +track.floodLights);
		
		
		Track track1 = new Track("School Track");
		System.out.println("The track type:" +track1.type);
		
		
		Track track2 =new Track("Mud",200.0);
		System.out.println("The track surfaceMaterial:" +track2.surfaceMaterial);
		System.out.println("The track lengthMeters:" +track2.lengthMeters);
		
		
		Track track3 = new Track(6);
		System.out.println("The track lanes:" +track3.lanes);
		
		
		Track track4 = new Track(false);
		System.out.println("The track have floodLights:" +track4.floodLights);
		
		
		Track track5 = new Track(300.0,8,true);
		System.out.println("The track lengthMeters:" +track5.lengthMeters);
		System.out.println("The track lanes:" +track5.lanes);
		System.out.println("The track floodLights:" +track5.floodLights);
		
	}

}