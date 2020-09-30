package com.cg.junitmoodtest;

import static org.junit.Assert.*;

import org.junit.*;

public class MoodAnalyserTest {
	@Test
	public void givenMessage_whenNullMood_ShouldThrowException() {
		try {
			MoodAnalyser moodAnalyser = new MoodAnalyser(null);
			String mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenMessage_whenNoMood_ShouldThrowException() {
		try {
			MoodAnalyser moodAnalyser = new MoodAnalyser("");
			String mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}
}
