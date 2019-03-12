package sample;


public class Controller {
	String v45 = "'[A-Åa-å]{1,45}'";
	String v255 = "'[A-Åa-å]{1,255}'";
	String n = "'[0-9]{1,10}'";
	String datetime = "[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}";
	String time = "[0-9]{2}:[0-9]{2}:[0-9]{2}";
	
	
	private void makeWorkout(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);

	}

	private void makeEquipmentExercise(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);

	}

	private void makeFreeExercise(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);

	}

	private void makeGroup(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);

	}

	private void makeEquipment(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);

	}
	
	private void changeWorkout(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);

	}

	private void changeEquipmentExercise(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);

	}

	private void changeFreeExercise(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);

	}

	private void changeGroup(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);

	}

	private void changeEquipment(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);

	}
	
	private void readAllWorkouts() {
		// TODO Auto-generated method stub
		System.out.println("All workouts");

	}

	private void readAllExercises() {
		// TODO Auto-generated method stub
		System.out.println("All exercises");

	}

	private void readAllGroups() {
		// TODO Auto-generated method stub
		System.out.println("All groups");

	}

	private void readAllEquipments() {
		// TODO Auto-generated method stub
		System.out.println("All equipments");

	}
	
	public void validateString(String s) {
		switch(s.split(" ")[0]) {
		case "make":
			checkMake(s);
			break;
		case "change":
			checkChange(s);
			break;
		case "delete":
			checkDelete(s);
			break;
		case "read":
			checkRead(s);
			break;
		default:
			System.out.printf("Please use one of the following commands: \nchange\ndelete\nread\n------\n");
		}
	}

	public void checkMake(String s) {
		String equipmentRegex = "make equipment[(]"+v45+","+v255+"[)]";
		String groupRegex = "make group[(]"+v45+"[)]";
		String freeExerciseRegex = "make free-exercise[(]"+v45+","+v255+"[)][("+v45+")]*";
		String equipmentExerciseRegex = "make equipment-exercise[(]"+v45+","+n+","+n+"[)][("+v45+")]*";
		String workoutRegex = "make workout[(]"+datetime+","+time+","+n+"[)][("+v45+","+n+")]*";
		
		String errorM = "Invalid '"+s.split("[(]")[0]+"' command, heres how to format it:\n\n";
		switch(s.split("[(]")[0]) {
			case "make equipment":
				if (s.matches(equipmentRegex)) {
					makeEquipment(s);
				} else {
					System.out.printf(errorM+equipmentRegex+"\n------\n");
				}
				break;
			case "make group":
				if (s.matches(groupRegex)) {
					makeGroup(s);
				} else {
					System.out.printf(errorM+groupRegex+"\n------\n");
				}
				break;
			case "make free-exercise":
				if (s.matches(freeExerciseRegex)) {
					makeFreeExercise(s);
				} else {
					System.out.printf(errorM+freeExerciseRegex+"\n------\n");
				}
				break;
			case "make equipment-exercise":
				if (s.matches(equipmentExerciseRegex)) {
					makeEquipmentExercise(s);
				} else {
					System.out.printf(errorM+equipmentExerciseRegex+"\n------\n");
				}
				break;
			case "make workout":
				if (s.matches(workoutRegex)) {
					makeWorkout(s);
				} else {
					System.out.printf(errorM+workoutRegex+"\n------\n");
				}
				break;
			default:
				System.out.printf("Please make one of the following objects: \nequipment\ngroup\nfree-exercise\nequipment-exercise\nworkout\n------\n");
		}
	}

	private void checkChange(String s) {
		String equipmentRegex = "change equipment[(]"+v45+","+v255+"[)][(]"+v45+","+v255+"[)]";
		String groupRegex = "change group[(]"+v45+"[)][(]"+v45+"[)]";
		String freeExerciseRegex = "change free-exercise[(]"+v45+","+v255+"[)][(]"+v45+","+v255+"[)][("+v45+")]*";
		String equipmentExerciseRegex = "change equipment-exercise[(]"+v45+","+n+","+n+"[)][(]"+v45+","+n+","+n+"[)][("+v45+")]*";
		String workoutRegex = "change workout[(]"+datetime+","+time+","+n+"[)][("+v45+","+n+")]*";
		String errorM = "Invalid '"+s.split("[(]")[0]+"' command, heres how to format it:\n\n";
		switch(s.split("[(]")[0]) {
			case "change equipment":
				if (s.matches(equipmentRegex)) {
					changeEquipment(s);
				} else {
					System.out.printf(errorM+equipmentRegex+"\n------\n");
				}
				break;
			case "change group":
				if (s.matches(groupRegex)) {
					changeGroup(s);
				} else {
					System.out.printf(errorM+groupRegex+"\n------\n");
				}
				break;
			case "change free-exercise":
				if (s.matches(freeExerciseRegex)) {
					changeFreeExercise(s);
				} else {
					System.out.printf(errorM+freeExerciseRegex+"\n------\n");
				}
				break;
			case "change equipment-exercise":
				if (s.matches(equipmentExerciseRegex)) {
					changeEquipmentExercise(s);
				} else {
					System.out.printf(errorM+equipmentExerciseRegex+"\n------\n");
				}
				break;
			case "change workout":
				if (s.matches(workoutRegex)) {
					changeWorkout(s);
				} else {
					System.out.printf(errorM+workoutRegex+"\n------\n");
				}
				break;
			default:
				System.out.printf("Please make one of the following objects: \nequipment\ngroup\nfree-exercise\nequipment-exercise\nworkout\n------\n");
		}
	}
	
	private void checkDelete(String s) {
		String equipmentRegex = "delete equipment[(]"+v45+"[)]";
		String groupRegex = "delete group[(]"+v45+"[)]";
		String freeExerciseRegex = "delete free-exercise[(]"+v45+"[)]";
		String equipmentExerciseRegex = "delete equipment-exercise[(]"+v45+"[)]";
		String workoutRegex = "delete workout[(]"+datetime+"[)]";
		String errorM = "Invalid '"+s.split("[(]")[0]+"' command, heres how to format it:\n\n";
		switch(s.split("[(]")[0]) {
		case "delete equipment":
			if (s.matches(equipmentRegex)) {
				changeEquipment(s);
			} else {
				System.out.printf(errorM+equipmentRegex+"\n------\n");
			}
			break;
		case "delete group":
			if (s.matches(groupRegex)) {
				changeGroup(s);
			} else {
				System.out.printf(errorM+groupRegex+"\n------\n");
			}
			break;
		case "delete free-exercise":
			if (s.matches(freeExerciseRegex)) {
				changeFreeExercise(s);
			} else {
				System.out.printf(errorM+freeExerciseRegex+"\n------\n");
			}
			break;
		case "delete equipment-exercise":
			if (s.matches(equipmentExerciseRegex)) {
				changeEquipmentExercise(s);
			} else {
				System.out.printf(errorM+equipmentExerciseRegex+"\n------\n");
			}
			break;
		case "delete workout":
			if (s.matches(workoutRegex)) {
				changeWorkout(s);
			} else {
				System.out.printf(errorM+workoutRegex+"\n------\n");
			}
			break;
		default:
			System.out.printf("Please delete one of the following objects: \nequipment\ngroup\nfree-exercise\nequipment-exercise\nworkout\n------\n");
	}
	}
	
	private void checkRead(String s) {
		// TODO Auto-generated method stub
		switch(s.split(" ")[1]) {
			case "equipment":
				readAllEquipments();
				break;
			case "group":
				readAllGroups();
				break;
			case "exercise":
				readAllExercises();

				break;
			case "workout":
				readAllWorkouts();
				break;
			default:
				System.out.printf("Please read one of the following objects: \nequipment\ngroup\nfree-exercise\nequipment-exercise\nworkout\n------\n");
		}
	}

	public static void main(String[] args) {
		Controller c = new Controller();
		c.validateString("delete equipment('Heisann')");
	}
	
	/*	
	Lese fra databasen:
	read equipment
	read equipment('Trolley')
	read group
	read group('Legs')
	read exercise
	read exercise('Push-ups')
	read workout('2019-03-26')

	Lag nye rader i databasen:
	make equipment('Tralle','Trall den rundt')
	make group('Beinøvelse')
	make free-exercise('Pushups','En pushup er en vanlig...')('Legs')('Arms')
	make equipment-exercise('Beinpress','22','3')('Tralle')
	make workout('2019-03-26 09:50:00','02:00:00',5)('Pushups',4)('Situps',2)

	Endre rader i databasen:
	change equipment('Tralle','Trall den rundt')('Trolley','Trolley it around')
	change group('Legs')
	change free-exercise('Push-ups','A pushup is a normal...')('Legs')
	change equipment-exercise('Leg-press','12','3')('Tralle')
	change workout('2019-03-26 09:52:00','02:00:00',5)('Pushups',3)

	Slette rader i databasen:
	delete equipment('Trolley','Trolley it around')
	delete group('Legs')
	delete free-exercise('Push-ups')
	delete equipment-exercise('Leg-press')
	delete workout('2019-03-26 09:52:00','02:00:00',5)
	*/
}
