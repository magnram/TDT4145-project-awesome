CREATE TABLE IF NOT EXISTS Workout (
	WorkoutID INTEGER NOT NULL,
	Datetime DATETIME,
	Duration TIME,
	Shape INTEGER,
	Performance INTEGER,
	Notes TEXT,
	PRIMARY KEY (WorkoutID)
);

CREATE TABLE IF NOT EXISTS ExerciseGroup (
	GroupID INTEGER NOT NULL,
	Name TEXT,
	PRIMARY KEY (GroupID)
);

CREATE TABLE IF NOT EXISTS Exercise (
	ExerciseID INTEGER NOT NULL,
	Name TEXT,
	PRIMARY KEY (ExerciseID)
); 

CREATE TABLE IF NOT EXISTS ExerciseInGroup (
	ExerciseID INTEGER NOT NULL,
	GroupID INTEGER NOT NULL,
	PRIMARY KEY (ExerciseID, GroupID),
	FOREIGN KEY (ExerciseID) REFERENCES Exercise(ExerciseID),
	FOREIGN KEY (GroupID) REFERENCES ExerciseGroup(GroupID)
);

CREATE TABLE IF NOT EXISTS ExerciseInWorkout (
	ExerciseID INTEGER NOT NULL,
	WorkoutID INTEGER NOT NULL,
	Kilos INTEGER,
	Sets INTEGER,
	PRIMARY KEY (ExerciseID, WorkoutID),
	FOREIGN KEY (ExerciseID) REFERENCES Exercise(ExerciseID),
	FOREIGN KEY (WorkoutID) REFERENCES Workout(WorkoutID)
);

CREATE TABLE IF NOT EXISTS FreeExercise (
	ExerciseID INTEGER NOT NULL,
	Description TEXT,
	PRIMARY KEY (ExerciseID),
	FOREIGN KEY (ExerciseID) REFERENCES Exercise(ExerciseID) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS Equipment (
	EquipmentID INTEGER NOT NULL,
	Name TEXT,
	Description TEXT,
	PRIMARY KEY(EquipmentID)
);

CREATE TABLE IF NOT EXISTS EquipmentExercise (
	ExerciseID INTEGER NOT NULL,
	EquipmentID INTEGER NOT NULL,
	PRIMARY KEY (ExerciseID),
	FOREIGN KEY (ExerciseID) REFERENCES Exercise(ExerciseID) ON DELETE CASCADE,
	FOREIGN KEY (EquipmentID) REFERENCES Equipment(EquipmentID) ON DELETE CASCADE
);