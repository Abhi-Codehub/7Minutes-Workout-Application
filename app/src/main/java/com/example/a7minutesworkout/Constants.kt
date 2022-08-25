package com.example.a7minutesworkout

object Constants {
    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(
            1,
            "Jumping Jacks",
            R.drawable.jumpingjacks,
            false,
            false
        )
        exerciseList.add(jumpingJacks)

        val wallSit = ExerciseModel(
            2,
            "Wall Sit",
            R.drawable.wallsitnew,
            false,
            false
        )
        exerciseList.add(wallSit)

        val pushUp = ExerciseModel(
            3,
            "Push Up",
            R.drawable.pushupnew,
            false,
            false
        )
        exerciseList.add(pushUp)

        val abdominalCrunch = ExerciseModel(
            4,
            "Abdominal Crunch",
            R.drawable.abdonimalcrushnew,
            false,
            false
        )
        exerciseList.add(abdominalCrunch)

        val stepUpOnChair = ExerciseModel(
            5,
            "Step-Up-Onto Chair",
            R.drawable.situpchairnew,
            false,
            false
        )
        exerciseList.add(stepUpOnChair)

        val squat = ExerciseModel(
            6,
            "Squat",
            R.drawable.squatnew,
            false,
            false
        )
        exerciseList.add(squat)

        val tricepDipOnChair = ExerciseModel(
            7,
            "Tricep Dip On Chair",
            R.drawable.tricepdpisnew,
            false,
            false
        )
        exerciseList.add(tricepDipOnChair)

        val plank = ExerciseModel(
            8,
            "Plank",
            R.drawable.planknew,
            false,
            false
        )
        exerciseList.add(plank)

        val highKneesRunningInPlace = ExerciseModel(
            9,
            "High Knees Running in Place",
            R.drawable.highkneenew,
            false,
            false
        )
        exerciseList.add(highKneesRunningInPlace)

        val lunges = ExerciseModel(
            10,
            "Lunges",
            R.drawable.lungesnew,
            false,
            false
        )
        exerciseList.add(lunges)

        val pushUpRotation = ExerciseModel(
            11,
            "Push Up and Rotation",
            R.drawable.pushuprotationnew,
            false,
            false
        )
        exerciseList.add(pushUpRotation)

        val sidePlank = ExerciseModel(
            12,
            "Side Plank",
            R.drawable.sideplanknew,
            false,
            false
        )
        exerciseList.add(sidePlank)

        return exerciseList
    }
}