# WellBuddy App
Group : M. The landing page with navigation to three sections.
- Mental Health
- Sleep
- Healthy Habits

## WellBuddy - Mental Health Section
The Mental Health component of the WellBuddy wellbeing application. Developer: Shane Smyth
## Current Structure
- MoodEntry: Base class for mood records.
- StressMoodEntry: Extends MoodEntry.
- MoodManager: Contains an ArrayList for storing mood entries.
- GUI_MoodManager: Mental Health menu linking to each screen.
- GUI_RecordMood, GUI_MoodHistory, GUI_EntryDetails, GUI_ManageEntries, GUI_ConfirmDelete
- GUI_Statistics: Java Swing screens with navigation.
## Planned Features
- Record mood, stress rating and optional notes.
- View, search and delete entries.
- Display mood and stress statistics.
- Save and load mood entries.

## WellBuddy - Sleep
The Sleep monitoring component of the WellBuddy wellbeing application. Developer: Stephen Murphy
## Current Structure
- SleepEntry: Base class for storing sleep records.
- NightSleep: Extends SleepEntry to record nightly sleep and wake ups.
- NapEntry: Extends SleepEntry to record naps.
- SleepManager: manages an ArrayList of sleep entries.
## Planned Features
- Record nightly sleep and naps, including duration and quality.
- Track night time wake ups and nap times.
- View and search previous sleep records.
- Delete unwanted or incorrect entries.
- Calculate average nightly sleep duration.
- Save and load sleep records.
- Provide java swing interface with navigation between screens
  
## WellBuddy - Healthy Habits
The Healthy Habits component of the WellBuddy wellbeing application. Developer: Blesson Robert
## Current Structure
- Habit: Class skeleton for habit records.
- HealthyHabit: Class skeleton for healthy habits.
- DailyRoutine: Class skeleton for daily routines.
- HabitGoal: Class skeleton for habit goals.
- HabitManager: Class skeleton for managing habits.
- HabitGUI: Java Swing interface with Dashboard, My Habits, Daily Routine, My Goals and Progress pages.
- HabitApp: Standalone entry point for the Healthy Habits interface.
## Planned Features
- Manage existing and healthy habits.
- Plan daily routines around an existing schedule.
- Set achievable habit goals.
- Track achievements and habit completion.
