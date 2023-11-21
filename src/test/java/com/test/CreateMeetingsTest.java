package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class CreateMeetingsTest extends BaseClass {
	// All mandatory fieldSubject Task Conference with repetition Daily
	@Test(dataProvider = "getData1", priority = 0)
	public void subjectTaskConferenceWithRepetitionDaily(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.leftSideMeetingsTab();
			createMeetings.createMeetingTab();
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"), input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.EndTime(input.get("eventEndTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			Thread.sleep(2000);
			createMeetings.scrollDown3();
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
			viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
			viewMeetings.CollectionofEvents(input.get("EventName"));
			createMeetings.scrollUp();
			Thread.sleep(2000);
			viewMeetings.assertMeetingName(input.get("meetingNameAssert"));
			createMeetings.leftSideMeetingsTab();
			createMeetings.monthViewTab();
			createMeetings.CalendarEventsSelectionMonths(input.get("EventName"));
			createMeetings.scrollUp();
			Thread.sleep(2000);
			viewMeetings.assertMeetingName(input.get("meetingNameAssert"));

			
		} finally {
		createMeetings.leftSideMeetingsTab();
		

		}
	}

	// Subject Task conference with repetition Weekly
	@Test(dataProvider = "getData2", priority = 1)
	public void subjectTaskConferenceWithRepetitionWeekly(HashMap<String, String> input) throws InterruptedException {
		try {
			
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"), input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.EndTime(input.get("eventEndTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task conference with repetition Bi-Weekly
	@Test(dataProvider = "getData3", priority = 2)
	public void subjectTaskConferenceWithRepetitionBiWeekly(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"), input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.EndTime(input.get("eventEndTime"));

			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task conference with repetition Monthly
	@Test(dataProvider = "getData4", priority = 3)
	public void subjectTaskConferenceWithRepetitionMonthly(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"), input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.EndTime(input.get("eventEndTime"));

			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task conference with repetition Yearly
	@Test(dataProvider = "getData5", priority = 4)
	public void subjectTaskConferenceWithRepetitionYearly(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.EndTime(input.get("eventEndTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task Conference with repetition Daily
	@Test(dataProvider = "getData6", priority = 5)
	public void subjectTaskHolidaysWithRepetitionDaily(HashMap<String, String> input) throws InterruptedException {
		try {

			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task conference with repetition Weekly
	@Test(dataProvider = "getData7", priority = 6)
	public void subjectTaskHolidaysWithRepetitionWeekly(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task conference with repetition Bi-Weekly
	@Test(dataProvider = "getData8", priority = 7)
	public void subjectTaskHolidaysWithRepetitionBiWeekly(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task conference with repetition Monthly
	@Test(dataProvider = "getData9", priority = 8)
	public void subjectTaskHolidaysWithRepetitionMonthly(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task conference with repetition Yearly
	@Test(dataProvider = "getData10", priority = 9)
	public void subjectTaskHolidaysWithRepetitionYearly(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task Conference with repetition Daily
	@Test(dataProvider = "getData11", priority = 10)
	public void subjectTaskResearchWithRepetitionDaily(HashMap<String, String> input) throws InterruptedException {
		try {

			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task conference with repetition Weekly
	@Test(dataProvider = "getData12", priority = 11)
	public void subjectTaskResearchWithRepetitionWeekly(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task conference with repetition Bi-Weekly
	@Test(dataProvider = "getData13", priority = 12)
	public void subjectTaskResearchWithRepetitionBiWeekly(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task conference with repetition Monthly
	@Test(dataProvider = "getData14", priority = 13)
	public void subjectTaskResearchWithRepetitionMonthly(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task conference with repetition Yearly
	@Test(dataProvider = "getData15", priority = 14)
	public void subjectTaskResearchWithRepetitionYearly(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task Conference with repetition Daily
	@Test(dataProvider = "getData16", priority = 15)
	public void subjectTaskTrainingWithRepetitionDaily(HashMap<String, String> input) throws InterruptedException {
		try {

			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task conference with repetition Weekly
	@Test(dataProvider = "getData17", priority = 16)
	public void subjectTaskTrainingWithRepetitionWeekly(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task conference with repetition Bi-Weekly
	@Test(dataProvider = "getData18", priority = 17)
	public void subjectTaskTrainingWithRepetitionBiWeekly(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task conference with repetition Monthly
	@Test(dataProvider = "getData19", priority = 18)
	public void subjectTaskTrainingWithRepetitionMonthly(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task conference with repetition Yearly
	@Test(dataProvider = "getData20", priority = 19)
	public void subjectTaskTrainingWithRepetitionYearly(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task Conference with repetition Daily
	@Test(dataProvider = "getData21", priority = 20)
	public void subjectTaskVacationWithRepetitionDaily(HashMap<String, String> input) throws InterruptedException {
		try {

			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task conference with repetition Weekly
	@Test(dataProvider = "getData22", priority = 21)
	public void subjectTaskVacationWithRepetitionWeekly(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task conference with repetition Bi-Weekly
	@Test(dataProvider = "getData23", priority = 22)
	public void subjectTaskVacationWithRepetitionBiWeekly(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task conference with repetition Monthly
	@Test(dataProvider = "getData24", priority = 23)
	public void subjectTaskVacationWithRepetitionMonthly(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}

	// Subject Task conference with repetition Yearly
	@Test(dataProvider = "getData25", priority = 24)
	public void subjectTaskVacationWithRepetitionYearly(HashMap<String, String> input) throws InterruptedException {
		try {
			createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
					input.get("monthSelect"),  input.get("yearSelect"));
			createMeetings.startTime(input.get("eventStartTime"));
			createMeetings.repetitionClick(input.get("eventRepetition"));
			createMeetings.saveButtonClick();
			createMeetings.viewChangesBtnClick();
		} finally {
			createMeetings.createMeetingTab();

		}
	}
		
		//Subject Without add to timesheet with repetition
		@Test(dataProvider = "getData26", priority = 25)
		public void subjectTaskConferenceWithoutAddToTimesheet(HashMap<String, String> input) throws InterruptedException {
			try {
				
				createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
						input.get("monthSelect"),  input.get("yearSelect"));
				createMeetings.unSelectAddtoTimesheet();
				createMeetings.startTime(input.get("eventStartTime"));
				createMeetings.repetitionClick(input.get("eventRepetition"));
				createMeetings.saveButtonClick();
				createMeetings.viewChangesBtnClick();
			} finally {
				createMeetings.createMeetingTab();
	}
		}
			// All mandatory fieldSubject Task Conference and all day with repetition Daily
			@Test(dataProvider = "getData27", priority = 26)
			public void subjectTaskConferenceandAllDayWithRepetitionDaily(HashMap<String, String> input) throws InterruptedException {
				try {
					createMeetings.leftSideMeetingsTab();
					createMeetings.createMeetingTab();
					createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
							input.get("monthSelect"), input.get("yearSelect"));
					createMeetings.repetitionClick(input.get("eventRepetition"));
					createMeetings.allDayEvent();
					createMeetings.saveButtonClick();
					createMeetings.viewChangesBtnClick();
				} finally {
					createMeetings.createMeetingTab();

				}
			}

			// All mandatory fieldSubject Task Conference and all day with repetition weekly
			@Test(dataProvider = "getData28", priority = 27)
			public void subjectTaskConferenceandAllDayEventWithRepetitionWeekly(HashMap<String, String> input) throws InterruptedException {
				try {
					
					createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
							input.get("monthSelect"), input.get("yearSelect"));
					createMeetings.repetitionClick(input.get("eventRepetition"));
					createMeetings.allDayEvent();
					createMeetings.saveButtonClick();
					createMeetings.viewChangesBtnClick();
				} finally {
					createMeetings.createMeetingTab();

				}
			}

			// All mandatory fieldSubject Task Conference and all day with repetition Bi-weekly
			@Test(dataProvider = "getData29", priority = 28)
			public void subjectTaskConferenceAllDayWithRepetitionBiWeekly(HashMap<String, String> input) throws InterruptedException {
				try {
					createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
							input.get("monthSelect"), input.get("yearSelect"));
					createMeetings.repetitionClick(input.get("eventRepetition"));
					createMeetings.allDayEvent();
					createMeetings.saveButtonClick();
					createMeetings.viewChangesBtnClick();
				} finally {
					createMeetings.createMeetingTab();

				}
			}

			// All mandatory fieldSubject Task Conference and all day with repetition Monthly
			@Test(dataProvider = "getData30", priority = 29)
			public void subjectTaskConferenceAllDayWithRepetitionMonthly(HashMap<String, String> input) throws InterruptedException {
				try {
					createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
							input.get("monthSelect"), input.get("yearSelect"));
					createMeetings.repetitionClick(input.get("eventRepetition"));
					createMeetings.allDayEvent();
					createMeetings.saveButtonClick();
					createMeetings.viewChangesBtnClick();
				} finally {
					createMeetings.createMeetingTab();

				}
			}

			// All mandatory fieldSubject Task Conference and all day with repetition yearly
			@Test(dataProvider = "getData31", priority = 30)
			public void subjectTaskConferenceAllDayWithRepetitionYearly(HashMap<String, String> input) throws InterruptedException {
				try {
					createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
							input.get("monthSelect"),  input.get("yearSelect"));
					createMeetings.repetitionClick(input.get("eventRepetition"));
					createMeetings.allDayEvent();
					createMeetings.saveButtonClick();
					createMeetings.viewChangesBtnClick();
				} finally {
					createMeetings.createMeetingTab();

				}
			}
				
			// All mandatory fieldSubject Task Holidays and all day with repetition Daily
				@Test(dataProvider = "getData32", priority = 31)
				public void subjectTaskHolidaysandAllDayWithRepetitionDaily(HashMap<String, String> input) throws InterruptedException {
					try {
						createMeetings.leftSideMeetingsTab();
						createMeetings.createMeetingTab();
						createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
								input.get("monthSelect"), input.get("yearSelect"));
						createMeetings.repetitionClick(input.get("eventRepetition"));
						createMeetings.allDayEvent();
						createMeetings.saveButtonClick();
						createMeetings.viewChangesBtnClick();
					} finally {
						createMeetings.leftSideMeetingsTab();

					}
				}

				// All mandatory fieldSubject Task Holidays and all day with repetition weekly
				@Test(dataProvider = "getData33", priority = 32)
				public void subjectTaskHolidaysandAllDayEventWithRepetitionWeekly(HashMap<String, String> input) throws InterruptedException {
					try {
						
						createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
								input.get("monthSelect"), input.get("yearSelect"));
						createMeetings.repetitionClick(input.get("eventRepetition"));
						createMeetings.allDayEvent();
						createMeetings.saveButtonClick();
						createMeetings.viewChangesBtnClick();
					} finally {
						createMeetings.createMeetingTab();

					}
				}

				// All mandatory fieldSubject Task Holidays and all day with repetition Bi-weekly
				@Test(dataProvider = "getData34", priority = 33)
				public void subjectTaskHolidaysAllDayWithRepetitionBiWeekly(HashMap<String, String> input) throws InterruptedException {
					try {
						createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
								input.get("monthSelect"), input.get("yearSelect"));
						createMeetings.repetitionClick(input.get("eventRepetition"));
						createMeetings.allDayEvent();
						createMeetings.saveButtonClick();
						createMeetings.viewChangesBtnClick();
					} finally {
						createMeetings.createMeetingTab();

					}
				}

				// All mandatory fieldSubject Task Holidays and all day with repetition monthly
				@Test(dataProvider = "getData35", priority = 34)
				public void subjectTaskHolidaysAllDayWithRepetitionMonthly(HashMap<String, String> input) throws InterruptedException {
					try {
						createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
								input.get("monthSelect"), input.get("yearSelect"));
						createMeetings.repetitionClick(input.get("eventRepetition"));
						createMeetings.allDayEvent();
						createMeetings.saveButtonClick();
						createMeetings.viewChangesBtnClick();
					} finally {
						createMeetings.createMeetingTab();

					}
				}

				// All mandatory fieldSubject Task Holidays and all day with repetition Yearly
				@Test(dataProvider = "getData36", priority = 35)
				public void subjectTaskHolidaysAllDayWithRepetitionYearly(HashMap<String, String> input) throws InterruptedException {
					try {
						createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
								input.get("monthSelect"),  input.get("yearSelect"));
						createMeetings.repetitionClick(input.get("eventRepetition"));
						createMeetings.allDayEvent();
						createMeetings.saveButtonClick();
						createMeetings.viewChangesBtnClick();
					} finally {
						createMeetings.createMeetingTab();
					}
					}
					
					// All mandatory fieldSubject Task Research and all day with repetition Daily
					@Test(dataProvider = "getData37", priority = 36)
					public void subjectTaskResearchandAllDayWithRepetitionDaily(HashMap<String, String> input) throws InterruptedException {
						try {
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"), input.get("yearSelect"));
							createMeetings.repetitionClick(input.get("eventRepetition"));
							createMeetings.allDayEvent();
							createMeetings.saveButtonClick();
							createMeetings.viewChangesBtnClick();
						} finally {
							createMeetings.createMeetingTab();

						}
					}

					// All mandatory fieldSubject Task Research and all day with repetition weekly
					@Test(dataProvider = "getData38", priority = 37)
					public void subjectTaskResearchandAllDayEventWithRepetitionWeekly(HashMap<String, String> input) throws InterruptedException {
						try {
							
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"), input.get("yearSelect"));
							createMeetings.repetitionClick(input.get("eventRepetition"));
							createMeetings.allDayEvent();
							createMeetings.saveButtonClick();
							createMeetings.viewChangesBtnClick();
						} finally {
							createMeetings.createMeetingTab();

						}
					}

					// All mandatory fieldSubject Task Research and all day with repetition Bi-weekly
					@Test(dataProvider = "getData39", priority = 38)
					public void subjectTaskResearchAllDayWithRepetitionBiWeekly(HashMap<String, String> input) throws InterruptedException {
						try {
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"), input.get("yearSelect"));
							createMeetings.repetitionClick(input.get("eventRepetition"));
							createMeetings.allDayEvent();
							createMeetings.saveButtonClick();
							createMeetings.viewChangesBtnClick();
						} finally {
							createMeetings.createMeetingTab();

						}
					}

					// All mandatory fieldSubject Task Research and all day with repetition monthly
					@Test(dataProvider = "getData40", priority = 39)
					public void subjectTaskResearchAllDayWithRepetitionMonthly(HashMap<String, String> input) throws InterruptedException,IOException {
						try {
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"), input.get("yearSelect"));
							createMeetings.repetitionClick(input.get("eventRepetition"));
							createMeetings.allDayEvent();
							createMeetings.saveButtonClick();
							createMeetings.viewChangesBtnClick();
						} finally {
							createMeetings.createMeetingTab();

						}
					}

					// All mandatory fieldSubject Task Research and all day with repetition Yearly
					@Test(dataProvider = "getData41", priority = 40)
					public void subjectTaskResearchAllDayWithRepetitionYearly(HashMap<String, String> input) throws InterruptedException {
						try {
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.repetitionClick(input.get("eventRepetition"));
							createMeetings.allDayEvent();
							createMeetings.saveButtonClick();
							createMeetings.viewChangesBtnClick();
						
						} finally {
							createMeetings.createMeetingTab();

						}
			}	
					
					// All Mandatory fields Meeting Link
					@Test(dataProvider = "getData42", priority = 41)
					public void mandatoryfieldsWithMeetingLink(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.scrollDown2();
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.scrollDown3();
							createMeetings.saveButtonClick();
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingName(input.get("meetingNameAssert"));
							//viewMeetings.assertMonthandTime(input.get("monthAndTime"));
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							
							}finally {
							createMeetings.leftSideMeetingsTab();
						}
					}
			
					// All Mandatory fields  subject task holidays with Dial In Number
					@Test(dataProvider = "getData43", priority = 42)
					public void mandatoryfieldsWithDialInNumber(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							createMeetings.scrollDown2();
							createMeetings.DailINNumber(input.get("mobileNumber"));
							createMeetings.scrollDown3();
							createMeetings.saveButtonClick();
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingName(input.get("meetingNameAssert"));
							//viewMeetings.assertMonthandTime(input.get("monthAndTime"));
							viewMeetings.phoneNumber(input.get("mobileNumber"));
							
							}finally {
							createMeetings.leftSideMeetingsTab();
						}
					}
					
					//All mandatory fields with Location
					@Test(dataProvider = "getData44", priority = 43)
					public void mandatoryfieldsWithLocation(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							createMeetings.scrollDown2();
							createMeetings.MeetingLocation(input.get("Location"));
							createMeetings.scrollDown3();
							createMeetings.saveButtonClick();
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingName(input.get("meetingNameAssert"));
							//viewMeetings.assertMonthandTime(input.get("monthAndTime"));
						
							
							}finally {
							createMeetings.leftSideMeetingsTab();
						}
					}
	// All mandatory fields with meeting agenda
					@Test(dataProvider = "getData45", priority = 44)
					public void mandatoryfieldsWithMeetingAgenda(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							createMeetings.scrollDown2();
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							createMeetings.saveButtonClick();
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingName(input.get("meetingNameAssert"));
							//viewMeetings.assertMonthandTime(input.get("monthAndTime"));
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));
						
							
							}finally {
							createMeetings.leftSideMeetingsTab();
						}
					}
					
					//All Mandatory fields with Add Team Member
					@Test(dataProvider = "getData46", priority = 45)
					public void mandatoryfieldsWithTeamMember(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.AddTeamMember(input.get("teamMember2"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							Thread.sleep(2000);
							viewMeetings.assertMeetingName(input.get("meetingNameAssert"));
							//viewMeetings.assertMonthandTime(input.get("monthAndTime"));
							viewMeetings.assertTeamMember(input.get("teamMember1"));
						
							
							}finally {
							createMeetings.leftSideMeetingsTab();
						}
					}
					
					//All Mandatory fields with Entity Client
					
					@Test(dataProvider = "getData47", priority = 46)
					public void mandatoryfieldsWithEntityClient(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.SelectEntity(input.get("selectEntity"), input.get("entityClient1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							Thread.sleep(2000);
							viewMeetings.assertMeetingName(input.get("meetingNameAssert"));
							//viewMeetings.assertMonthandTime(input.get("monthAndTime"));
							viewMeetings.assertEntityandIndividual(input.get("selectEntity"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));
						
							
							}finally {
							createMeetings.leftSideMeetingsTab();
						}
					}
					
					//All mandatory fields with Add Individuals
					@Test(dataProvider = "getData48", priority = 47)
					public void mandatoryfieldsWithAddIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.scrollDown3();
							createMeetings.AddIndividul(input.get("IndividualMember1"));
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							Thread.sleep(2000);
							viewMeetings.assertMeetingName(input.get("meetingNameAssert"));
							//viewMeetings.assertMonthandTime(input.get("monthAndTime"));
							viewMeetings.assertEntityandIndividual(input.get("IndividualAssert"));		
							
							}finally {
							createMeetings.leftSideMeetingsTab();
						}
					}	
					
					//All mandatory fields with All days and Notification
					
					@Test(dataProvider = "getData49", priority = 48)
					public void mandatoryfieldsWithAlldayAndNotify(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.allDayEvent();
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.InnerScrollAllDay();
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();

							

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					//Mandatory field with All day and meeting link
					
					@Test(dataProvider = "getData50", priority = 49)
					public void mandatoryfieldsWithAlldayMeetingLink(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.allDayEvent();
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.InnerScrollAllDay();
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));


						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					//All day with Dial-In-Number
					
					@Test(dataProvider = "getData51", priority = 50)
					public void mandatoryfieldsWithAlldayDialInNumber(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.allDayEvent();
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.InnerScrollAllDay();
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.phoneNumber(input.get("dialNumber"));


						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					//All day with Location
					
					@Test(dataProvider = "getData52", priority = 51)
					public void mandatoryfieldsWithAlldayLocation(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.allDayEvent();
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.InnerScrollAllDay();
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
						

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					//All day with Meeting Agenda
					
					@Test(dataProvider = "getData53", priority = 52)
					public void mandatoryfieldsWithAlldayMeetingAgenda(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.allDayEvent();
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.InnerScrollAllDay();
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));
						

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					//All day with Add Team Member
					@Test(dataProvider = "getData54", priority = 53)
					public void mandatoryfieldsWithAlldayWithTeamMember(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							Thread.sleep(2000);
							createMeetings.allDayEvent();
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.AddTeamMember(input.get("teamMember2"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.InnerScrollAllDay();
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertTeamMember(input.get("teamMember1"));
						

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					//All day with Add Entity
					@Test(dataProvider = "getData55", priority = 54)
					public void mandatoryfieldsWithAlldayWithAddEntity(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							Thread.sleep(2000);
							createMeetings.allDayEvent();
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.InnerScrollAllDay();
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));						

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					//All day with Add Individual
					@Test(dataProvider = "getData56", priority = 55)
					public void mandatoryfieldsWithAlldayWithAddIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							Thread.sleep(2000);
							createMeetings.allDayEvent();
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddIndividul(input.get("individualMember1"));
							createMeetings.AddIndividul(input.get("individualMember2"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.InnerScrollAllDay();
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertEntityandIndividual(input.get("individualMember1"));
							viewMeetings.assertEntityandIndividual(input.get("individualMember2"));						

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					// Meeting Link with Dial -In-Number
					@Test(dataProvider = "getData57", priority = 56)
					public void mandatoryfieldsWithMeetingLinkandDialNum(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.phoneNumber(input.get("dialNumber"));				

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					// Meeting Link with Location
					@Test(dataProvider = "getData58", priority = 57)
					public void mandatoryfieldsWithMeetingLinkWithLocation(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
										

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					
					//Meeting Link with agenda
					
					@Test(dataProvider = "getData59", priority = 58)
					public void mandatoryfieldsWithMeetingLinkWithAgenda(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));
										

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					//Meeting Link with Team Member
					
					@Test(dataProvider = "getData60", priority = 59)
					public void mandatoryfieldsWithMeetingLinkWithTM(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.scrollDown3();
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.AddTeamMember(input.get("teamMember2"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.assertTeamMember(input.get("teamMember1"));
							viewMeetings.assertTeamMember(input.get("teamMember2"));

										

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					//Meeting Link with Add Entity
					
					@Test(dataProvider = "getData61", priority = 60)
					public void mandatoryfieldsWithMeetingLinkWithEntity(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.scrollDown3();
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));

										

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					//Meeting Link with Add Individual
					
					@Test(dataProvider = "getData62", priority = 61)
					public void mandatoryfieldsWithMeetingLinkWithIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddIndividul(input.get("individualMember1"));
							createMeetings.AddIndividul(input.get("individualMember2"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.assertEntityandIndividual(input.get("individualMember1"));
							viewMeetings.assertEntityandIndividual(input.get("individualMember2"));

										

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
				// Dial In Number with Location
					@Test(dataProvider = "getData63", priority = 62)
					public void mandatoryfieldsWithDialNumandLocation(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.phoneNumber(input.get("dialNumber"));

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					// Dial In Number with agenda
					
					@Test(dataProvider = "getData64", priority = 63)
					public void mandatoryfieldsWithDialNumandAgenda(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.phoneNumber(input.get("dialNumber"));
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					// Dial In Number with Add Team Member
					
					@Test(dataProvider = "getData65", priority = 64)
					public void mandatoryfieldsWithDialNumandAddTeamMember(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.DailINNumber(input.get("dialNumber"));
							Thread.sleep(2000);
							createMeetings.scrollDown3();
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.AddTeamMember(input.get("teamMember2"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							Thread.sleep(2000);
							viewMeetings.phoneNumber(input.get("dialNumber"));
							viewMeetings.assertTeamMember(input.get("teamMember1"));
							viewMeetings.assertTeamMember(input.get("teamMember2"));

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					//Dial -In -Number with Add Entity
					@Test(dataProvider = "getData66", priority = 65)
					public void mandatoryfieldsWithDialNumandAddEntity(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.DailINNumber(input.get("dialNumber"));
							Thread.sleep(3000);
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.SelectEntity(input.get("firmName1"), input.get("entityClient1"));
							createMeetings.SelectEntity(input.get("firmName2"), input.get("entityClient2"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							Thread.sleep(2000);
							viewMeetings.phoneNumber(input.get("dialNumber"));
							viewMeetings.assertEntityandIndividual(input.get("firmName1"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}			
					
					//Dial -In -Number with Add Individual
					
					@Test(dataProvider = "getData67", priority = 66)
					public void mandatoryfieldsWithDialNumandAddIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.DailINNumber(input.get("dialNumber"));
							Thread.sleep(3000);
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddIndividul(input.get("individualMember1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							Thread.sleep(2000);
							viewMeetings.phoneNumber(input.get("dialNumber"));
							viewMeetings.assertEntityandIndividual(input.get("individualMember1"));
							

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					
					// Location with Meeting Agenda
					@Test(dataProvider = "getData68", priority = 67)
					public void mandatoryfieldsWithLocationWithMeetAgenda(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							Thread.sleep(2000);
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));
						
							

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					// Location with Add Team Member
					@Test(dataProvider = "getData69", priority = 68)
					public void mandatoryfieldsWithLocationWithTeamMember(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							Thread.sleep(2000);
							viewMeetings.assertTeamMember(input.get("teamMember1"));
						
							

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					// Location with Add Entity
					
					@Test(dataProvider = "getData70", priority = 69)
					public void mandatoryfieldsWithLocationWithAddEntity(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							Thread.sleep(2000);
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));

						
							

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					// Location with Add Individual
					
					@Test(dataProvider = "getData71", priority = 70)
					public void mandatoryfieldsWithLocationWithAddIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddIndividul(input.get("individualMember1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							Thread.sleep(2000);
							viewMeetings.assertEntityandIndividual(input.get("individualMember1"));

						
							

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					//Meeting Agenda with Team Member
					
					@Test(dataProvider = "getData72", priority = 71)
					public void mandatoryfieldsWithMeetAgendaWithTeamMember(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							Thread.sleep(2000);
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));
							viewMeetings.assertTeamMember(input.get("teamMember1"));

						
							

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					//Meeting Agenda with Add Entity
					
					@Test(dataProvider = "getData73", priority = 72)
					public void mandatoryfieldsWithMeetAgendaWithEntity(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							Thread.sleep(2000);
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					//Meeting Agenda with Add Individual

					@Test(dataProvider = "getData74", priority = 73)
					public void mandatoryfieldsWithMeetAgendaWithIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddIndividul(input.get("individualMember"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							Thread.sleep(2000);
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));
							viewMeetings.assertEntityandIndividual(input.get("individualMember"));
							

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					// Add Team Member and Entity
					
					@Test(dataProvider = "getData75", priority = 74)
					public void mandatoryfieldsWithTeamMemberandEntity(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							Thread.sleep(2000);
							viewMeetings.assertTeamMember(input.get("teamMember1"));
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));


						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					//Add TM and Individual
					@Test(dataProvider = "getData76", priority = 75)
					public void mandatoryfieldsWithTeamMemberandIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.AddIndividul(input.get("individualMember1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							Thread.sleep(2000);
							viewMeetings.assertTeamMember(input.get("teamMember1"));
							viewMeetings.assertEntityandIndividual(input.get("assertIndividualMember1"));
						


						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					//Entity and Individual
					
					@Test(dataProvider = "getData77", priority = 76)
					public void mandatoryfieldsWithEntityandIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);						
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));
							createMeetings.AddIndividul(input.get("individualMember1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							Thread.sleep(2000);
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));
							viewMeetings.assertEntityandIndividual(input.get("individualMember1"));
						


						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					// Meeting Link, Dial Number and Location
					
					@Test(dataProvider = "getData78", priority = 77)
					public void mandatoryfieldsWithMeetingLinkandDialNumWithLocation(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.phoneNumber(input.get("dialNumber"));				

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
// Meeting Link, Dial Number and Location
					
					@Test(dataProvider = "getData79", priority = 78)
					public void mandatoryfieldsWithMeetingLinkandDialNumWithAgenda(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.phoneNumber(input.get("dialNumber"));		
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					// Meeting Link, Dial Number and Add Team Members
					
					@Test(dataProvider = "getData80", priority = 79)
					public void mandatoryfieldsWithMeetingLinkandDialNumWithTeamMember(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.scrollDown3();
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.phoneNumber(input.get("dialNumber"));		
							viewMeetings.assertTeamMember(input.get("teamMember1"));

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					// Meeting Link, Dial Number and Add Entity
					@Test(dataProvider = "getData81", priority = 80)
					public void mandatoryfieldsWithMeetingLinkandDialNumWithEntity(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));
							createMeetings.scrollDown3();
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.phoneNumber(input.get("dialNumber"));		
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));


						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					// Meeting Link, Dial Number and Add Individual
					@Test(dataProvider = "getData82", priority = 81)
					public void mandatoryfieldsWithMeetingLinkandDialNumWithIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddIndividul(input.get("individualMember1"));
							createMeetings.scrollDown3();
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.phoneNumber(input.get("dialNumber"));		
							viewMeetings.assertEntityandIndividual(input.get("individualMember1"));
							


						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					// Meeting Link,Location and Agenda
					
					@Test(dataProvider = "getData83", priority = 82)
					public void mandatoryfieldsWithMeetingLinkWithLocationandAgenda(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));
										

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					// Meeting Link,Location and Add Team Member
					

					@Test(dataProvider = "getData84", priority = 83)
					public void mandatoryfieldsWithMeetingLinkWithLocationandTeamMember(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.assertTeamMember(input.get("teamMember1"));
										

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					// Meeting Link,Location and Add Entity
					
					@Test(dataProvider = "getData85", priority = 84)
					public void mandatoryfieldsWithMeetingLinkWithLocationandEntity(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));
			

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
								// Meeting Link,Location and Add Individual
					
					@Test(dataProvider = "getData86", priority = 85)
					public void mandatoryfieldsWithMeetingLinkWithLocationandIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddIndividul(input.get("individualMember1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.assertEntityandIndividual(input.get("individualMember1"));
							
			

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					// MeetingLink with Agenda and Team Members
					
					@Test(dataProvider = "getData87", priority = 86)
					public void mandatoryfieldsWithMeetingLinkWithAgendaandTeamMembers(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));
							viewMeetings.assertTeamMember(input.get("teamMember1"));
							
			

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					// MeetingLink with Agenda and Entity
					
					@Test(dataProvider = "getData88", priority = 85)
					public void mandatoryfieldsWithMeetingLinkWithAgendaandEntity(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));

			

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					// MeetingLink with Agenda and Individual
					
					@Test(dataProvider = "getData89", priority = 88)
					public void mandatoryfieldsWithMeetingLinkWithAgendaandIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddIndividul(input.get("individualMember1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));
							viewMeetings.assertEntityandIndividual(input.get("individualMember1"));
							
			

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
	// MeetingLink with Team Member and Entity
					
					@Test(dataProvider = "getData90", priority = 89)
					public void mandatoryfieldsWithMeetingLinkWithTeamMemberandEntity(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.assertTeamMember(input.get("teamMember1"));
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));							
			

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					// MeetingLink with Team Member and Individual

					@Test(dataProvider = "getData91", priority = 90)
					public void mandatoryfieldsWithMeetingLinkWithTeamMemberandIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.AddIndividul(input.get("individualMember1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.assertTeamMember(input.get("teamMember1"));
							viewMeetings.assertEntityandIndividual(input.get("individualMember1"));					
			

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
	// MeetingLink with Entity and Individual
					
					@Test(dataProvider = "getData92", priority = 91)
					public void mandatoryfieldsWithMeetingLinkWithEntityandIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));
							createMeetings.AddIndividul(input.get("individualMember1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));		
							viewMeetings.assertEntityandIndividual(input.get("individualMember1"));
			

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					// Dial In Number with Location and Agenda
					@Test(dataProvider = "getData93", priority = 92)
					public void mandatoryfieldsWithDialNumandLocationandAgenda(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.phoneNumber(input.get("dialNumber"));				
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					// Dial In Number with Location and Add Team Members
					@Test(dataProvider = "getData94", priority = 93)
					public void mandatoryfieldsWithDialNumandLocationandTeamMembers(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.scrollDown3();
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.phoneNumber(input.get("dialNumber"));				
							viewMeetings.assertTeamMember(input.get("teamMember1"));

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					// Dial In Number with Location and Add Team Members
					@Test(dataProvider = "getData95", priority = 94)
					public void mandatoryfieldsWithDialNumandLocationandEntity(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));
							createMeetings.scrollDown3();
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.phoneNumber(input.get("dialNumber"));				
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));


						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					// Dial In Number with Location and Add Team Members
					@Test(dataProvider = "getData96", priority = 95)
					public void mandatoryfieldsWithDialNumandLocationandIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddIndividul(input.get("individualMember1"));
							createMeetings.scrollDown3();
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.phoneNumber(input.get("dialNumber"));				
							viewMeetings.assertEntityandIndividual(input.get("individualMember1"));


						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					//Agenda and Team Member and Add Entity
					@Test(dataProvider = "getData97", priority = 96)
					public void mandatoryfieldsWithAgendaTeamMemberandEntity(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));
							createMeetings.scrollDown3();
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));			
							viewMeetings.assertTeamMember(input.get("teamMember1"));
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					//Agenda and Team Member and Add Individual
					@Test(dataProvider = "getData98", priority = 97)
					public void mandatoryfieldsWithAgendaTeamMemberandIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.AddIndividul(input.get("individualMember1"));
							createMeetings.scrollDown3();
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));			
							viewMeetings.assertTeamMember(input.get("teamMember1"));
							viewMeetings.assertEntityandIndividual(input.get("individualMember1"));

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					//Agenda and Entity with Individual
					@Test(dataProvider = "getData99", priority = 98)
					public void mandatoryfieldsWithAgendaEntityandIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));
							createMeetings.AddIndividul(input.get("individualMember1"));
							createMeetings.scrollDown3();
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));	
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));
							viewMeetings.assertEntityandIndividual(input.get("individualMember1"));

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					//Add Team Member, Entity, Individual
					
					@Test(dataProvider = "getData100", priority = 99)
					public void mandatoryfieldsWithTeamMemberEntityandIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));		
							Thread.sleep(2000);
							createMeetings.AddIndividul(input.get("individualMember1"));
							Thread.sleep(2000);

							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertTeamMember(input.get("teamMember1"));	
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));
							viewMeetings.assertEntityandIndividual(input.get("individualMember1"));

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
// Meeting Link, Dial Number and Location with Agenda
					
					@Test(dataProvider = "getData101", priority = 100)
					public void mandatoryfieldsWithMeetingLinkandDialNumWithLocationAgenda(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.phoneNumber(input.get("dialNumber"));	
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
// Meeting Link, Dial Number and Location with Team Member
					
					@Test(dataProvider = "getData102", priority = 101)
					public void mandatoryfieldsWithMeetingLinkandDialNumWithLocationTeamMember(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							Thread.sleep(2000);
							createMeetings.scrollDown3();
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.phoneNumber(input.get("dialNumber"));	
							viewMeetings.assertTeamMember(input.get("teamMember1"));

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
// Meeting Link, Dial Number and Location with Entity
					
					@Test(dataProvider = "getData103", priority = 102)
					public void mandatoryfieldsWithMeetingLinkandDialNumWithLocationandEntity(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							Thread.sleep(2000);
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));		
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.phoneNumber(input.get("dialNumber"));	
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
// Meeting Link, Dial Number and Location with Individual
					
					@Test(dataProvider = "getData104", priority = 103)
					public void mandatoryfieldsWithMeetingLinkandDialNumWithLocationandIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							Thread.sleep(2000);
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddIndividul(input.get("individualMember1"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.phoneNumber(input.get("dialNumber"));	
							viewMeetings.assertEntityandIndividual(input.get("individualMember1"));
							

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}
					
					
					// Meet Link, Dial In Number, Location, Agenda with Team Member
					@Test(dataProvider = "getData105", priority = 104)
					public void mandatoryfieldsWithMeetingLinkandDialNumWithLocationAgendaandTeamMember(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.scrollDown3();
							Thread.sleep(1000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.phoneNumber(input.get("dialNumber"));	
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));
							viewMeetings.assertTeamMember(input.get("teamMember1"));
						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					// Meet Link, Dial In Number, Location, Agenda with Entity
					@Test(dataProvider = "getData106", priority = 105)
					public void mandatoryfieldsWithMeetingLinkandDialNumWithLocationAgendaandEntity(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));		
							createMeetings.scrollDown3();
							Thread.sleep(1000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.phoneNumber(input.get("dialNumber"));	
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					// Meet Link, Dial In Number, Location, Agenda with Individual
					@Test(dataProvider = "getData107", priority = 106)
					public void mandatoryfieldsWithMeetingLinkandDialNumWithLocationAgendaandIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddIndividul(input.get("individualMember1"));
							createMeetings.scrollDown3();
							Thread.sleep(1000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.phoneNumber(input.get("dialNumber"));	
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));
							viewMeetings.assertEntityandIndividual(input.get("individualMember1"));					

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					// Dial In Number with Location and Agenda
					@Test(dataProvider = "getData108", priority = 107)
					public void mandatoryfieldsWithDialNumandLocationandAgendaTeamMemberandEntity(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							Thread.sleep(2000);
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));		
							Thread.sleep(2000);
							createMeetings.scrollDown3();
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.phoneNumber(input.get("dialNumber"));				
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));
							viewMeetings.assertTeamMember(input.get("teamMember1"));
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					// Dial In Number with Location and Agenda, TeamMember and Individual
					@Test(dataProvider = "getData109", priority = 108)
					public void mandatoryfieldsWithDialNumandLocationandAgendaTeamMemberandIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							Thread.sleep(2000);
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.AddIndividul(input.get("individualMember1"));
							Thread.sleep(2000);
							createMeetings.scrollDown3();
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.phoneNumber(input.get("dialNumber"));				
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));
							viewMeetings.assertTeamMember(input.get("teamMember1"));
							viewMeetings.assertEntityandIndividual(input.get("individualMember1"));

						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					// Meet Link, Dial In Number, Location, Agenda with Team Member and Entity
					@Test(dataProvider = "getData110", priority = 109)
					public void mandatoryfieldsWithMeetingLinkandDialNumWithLocationAgendaandTeamMemberEntity(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));	
							Thread.sleep(1000);
							createMeetings.scrollDown3();
							Thread.sleep(1000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.phoneNumber(input.get("dialNumber"));	
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));
							viewMeetings.assertTeamMember(input.get("teamMember1"));
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));
						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					// Meet Link, Dial In Number, Location, Agenda with Team Member and Entity
					@Test(dataProvider = "getData111", priority = 110)
					public void mandatoryfieldsWithMeetingLinkandDialNumWithLocationAgendaandTeamMemberIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.AddIndividul(input.get("individualMember1"));
							Thread.sleep(1000);
							createMeetings.scrollDown3();
							Thread.sleep(1000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.phoneNumber(input.get("dialNumber"));	
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));
							viewMeetings.assertTeamMember(input.get("teamMember1"));
							viewMeetings.assertEntityandIndividual(input.get("individualMember1"));
							
						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	
					
					// Meet Link, Dial In Number, Location, Agenda with Team Member and Entity
					@Test(dataProvider = "getData112", priority = 111)
					public void mandatoryfieldsWithMeetingLinkandDialNumWithLocationAgendaandTeamMemberEntityandIndividual(HashMap<String, String> input) throws InterruptedException {
						try {	
							createMeetings.leftSideMeetingsTab();
							createMeetings.createMeetingTab();
							createMeetings.subjectOrTaskButtonClick(input.get("subjectOrTask"), input.get("meetingDate"),
									input.get("monthSelect"),  input.get("yearSelect"));
							createMeetings.startTime(input.get("eventStartTime"));
							createMeetings.EndTime(input.get("eventEndTime"));
							Thread.sleep(2000);
							createMeetings.scrollDown2();
							Thread.sleep(2000);
							createMeetings.MeetingLink(input.get("meetLink"));
							createMeetings.DailINNumber(input.get("dialNumber"));
							createMeetings.MeetingLocation(input.get("meetLocation"));
							createMeetings.MeetingAgenda(input.get("meetAgenda"));
							createMeetings.scrollDown3();
							Thread.sleep(2000);
							createMeetings.AddTeamMember(input.get("teamMember1"));
							createMeetings.SelectEntity(input.get("firmName"), input.get("entityClient1"));	
							createMeetings.AddIndividul(input.get("individualMember1"));
							Thread.sleep(1000);
							createMeetings.scrollDown3();
							Thread.sleep(1000);
							createMeetings.saveButtonClick();
							Thread.sleep(2000);
							createMeetings.viewChangesBtnClick();
							viewMeetings.RightArrow_LeftArrow_Date(input.get("meetingDate"));
							viewMeetings.CollectionofEvents(input.get("EventName"));
							createMeetings.scrollUp();
							viewMeetings.assertMeetingLink(input.get("meetLink"));
							viewMeetings.phoneNumber(input.get("dialNumber"));	
							viewMeetings.assertMeetingAgenda(input.get("meetAgenda"));
							viewMeetings.assertTeamMember(input.get("teamMember1"));
							viewMeetings.assertEntityandIndividual(input.get("firmName"));
							viewMeetings.assertEntityandIndividual(input.get("entityClient1"));
							viewMeetings.assertEntityandIndividual(input.get("individualMember1"));
							
						}finally {
							createMeetings.leftSideMeetingsTab();

						}
					}	





					

					




					
					

					




					
					



						




	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(0) } };

	}

	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(1) } };

	}

	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(2) } };

	}

	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(3) } };

	}

	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(4) } };

	}

	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(5) } };

	}

	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(6) } };

	}

	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(7) } };

	}

	@DataProvider
	public Object[][] getData9() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(8) } };

	}

	@DataProvider
	public Object[][] getData10() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(9) } };

	}

	@DataProvider
	public Object[][] getData11() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(10) } };

	}

	@DataProvider
	public Object[][] getData12() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(11) } };

	}

	@DataProvider
	public Object[][] getData13() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(12) } };

	}

	@DataProvider
	public Object[][] getData14() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(13) } };

	}

	@DataProvider
	public Object[][] getData15() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(14) } };

	}

	@DataProvider
	public Object[][] getData16() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(15) } };

	}

	@DataProvider
	public Object[][] getData17() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(16) } };

	}

	@DataProvider
	public Object[][] getData18() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(17) } };

	}

	@DataProvider
	public Object[][] getData19() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(18) } };

	}

	@DataProvider
	public Object[][] getData20() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(19) } };

	}

	@DataProvider
	public Object[][] getData21() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(20) } };

	}

	@DataProvider
	public Object[][] getData22() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(21) } };

	}

	@DataProvider
	public Object[][] getData23() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(22) } };

	}

	@DataProvider
	public Object[][] getData24() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(23) } };

	}

	@DataProvider
	public Object[][] getData25() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(24) } };

	}
	@DataProvider
	public Object[][] getData26() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(25) } };

	}
	
	@DataProvider
	public Object[][] getData27() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(26) } };

	}
	@DataProvider
	public Object[][] getData28() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(27) } };

	}
	@DataProvider
	public Object[][] getData29() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(28) } };

	}
	@DataProvider
	public Object[][] getData30() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(29) } };

	}
	@DataProvider
	public Object[][] getData31() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(30) } };

	}
	@DataProvider
	public Object[][] getData32() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(31) } };

	}
	@DataProvider
	public Object[][] getData33() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(32) } };

	}
	@DataProvider
	public Object[][] getData34() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(33) } };

	}
	@DataProvider
	public Object[][] getData35() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(34) } };

	}
	@DataProvider
	public Object[][] getData36() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(35) } };

	}
	@DataProvider
	public Object[][] getData37() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(36) } };

	}
	@DataProvider
	public Object[][] getData38() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(36) } };

	}
	@DataProvider
	public Object[][] getData39() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(38) } };

	}
	@DataProvider
	public Object[][] getData40() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(39) } };

	}
	@DataProvider
	public Object[][] getData41() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(40) } };

	}
	@DataProvider
	public Object[][] getData42() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(41) } };

	}
	
	@DataProvider
	public Object[][] getData43() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(42) } };

	}
	@DataProvider
	public Object[][] getData44() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(43) } };

	}
	@DataProvider
	public Object[][] getData45() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(44) } };

	}
	
	@DataProvider
	public Object[][] getData46() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(45) } };

	}
	@DataProvider
	public Object[][] getData47() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(46) } };

	}
	
	@DataProvider
	public Object[][] getData48() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(47) } };

	}

	@DataProvider
	public Object[][] getData49() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(48) } };

	}
	
	@DataProvider
	public Object[][] getData50() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(49) } };

	}
	
	@DataProvider
	public Object[][] getData51() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(50) } };

	}
	
	@DataProvider
	public Object[][] getData52() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(51) } };

	}
	@DataProvider
	public Object[][] getData53() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(52) } };

	}
	
	@DataProvider
	public Object[][] getData54() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(53) } };

	}
	@DataProvider
	public Object[][] getData55() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(54) } };

	}
	@DataProvider
	public Object[][] getData56() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(55) } };

	}
	@DataProvider
	public Object[][] getData57() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(56) } };

	}
	@DataProvider
	public Object[][] getData58() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(57) } };

	}
	
	@DataProvider
	public Object[][] getData59() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(58) } };

	}
	
	@DataProvider
	public Object[][] getData60() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(59) } };

	}
	@DataProvider
	public Object[][] getData61() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(60) } };

	}
	
	@DataProvider
	public Object[][] getData62() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(61) } };

	}
	
	@DataProvider
	public Object[][] getData63() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(62) } };
	}
	
	@DataProvider
	public Object[][] getData64() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(63) } };
	}
	
	@DataProvider
	public Object[][] getData65() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(64) } };
	}
	
	@DataProvider
	public Object[][] getData66() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(65) } };
	}
	
	@DataProvider
	public Object[][] getData67() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(66) } };
	}
	
	@DataProvider
	public Object[][] getData68() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(67) } };
	}
	
	@DataProvider
	public Object[][] getData69() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(68) } };
	}
	@DataProvider
	public Object[][] getData70() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(69) } };
	}
	
	@DataProvider
	public Object[][] getData71() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(70) } };
	}
	
	@DataProvider
	public Object[][] getData72() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(71) } };
	}
	@DataProvider
	public Object[][] getData73() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(72) } };
	}
	@DataProvider
	public Object[][] getData74() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(73) } };
	}
	
	@DataProvider
	public Object[][] getData75() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(74) } };
	}
	@DataProvider
	public Object[][] getData76() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(75) } };
	}
	@DataProvider
	public Object[][] getData77() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(76) } };
	}
	@DataProvider
	public Object[][] getData78() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(77) } };
	}
	
	@DataProvider
	public Object[][] getData79() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(78) } };
	}
	
	@DataProvider
	public Object[][] getData80() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(79) } };
	}
	
	@DataProvider
	public Object[][] getData81() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(80) } };
	}
	
	@DataProvider
	public Object[][] getData82() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(81) } };
	}
	
	@DataProvider
	public Object[][] getData83() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(82) } };
	}
	
	@DataProvider
	public Object[][] getData84() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(83) } };
	}
	@DataProvider
	public Object[][] getData85() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(84) } };
	}
	
	@DataProvider
	public Object[][] getData86() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(85) } };
	}
	@DataProvider
	public Object[][] getData87() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(86) } };
	}
	
	@DataProvider
	public Object[][] getData88() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(87) } };
	}
	
	@DataProvider
	public Object[][] getData89() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(88) } };
	}
	@DataProvider
	public Object[][] getData90() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(89) } };
	}
	
	@DataProvider
	public Object[][] getData91() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(90) } };
	}
	
	@DataProvider
	public Object[][] getData92() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(91) } };
	}
	@DataProvider
	public Object[][] getData93() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(92) } };
	}
	@DataProvider
	public Object[][] getData94() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(93) } };
	}
	
	@DataProvider
	public Object[][] getData95() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(94) } };
	}
	@DataProvider
	public Object[][] getData96() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(95) } };
	}
	
	@DataProvider
	public Object[][] getData97() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(96) } };
	}
	@DataProvider
	public Object[][] getData98() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(97) } };
	}
	
	@DataProvider
	public Object[][] getData99() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(98) } };
	}
	
	@DataProvider
	public Object[][] getData100() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(99) } };
	}
	
	@DataProvider
	public Object[][] getData101() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(100) } };
	}
	
	@DataProvider
	public Object[][] getData102() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(101) } };
	}
	
	@DataProvider
	public Object[][] getData103() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(102) } };
	}
	
	@DataProvider
	public Object[][] getData104() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(103) } };
	}
	
	@DataProvider
	public Object[][] getData105() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(104) } };
	}
	
	@DataProvider
	public Object[][] getData106() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(105) } };
	}
	
	@DataProvider
	public Object[][] getData107() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(106) } };
	}
	
	@DataProvider
	public Object[][] getData108() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(107) } };
	}
	
	@DataProvider
	public Object[][] getData109() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(108) } };
	}
	
	@DataProvider
	public Object[][] getData110() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(109) } };
	}
	
	@DataProvider
	public Object[][] getData111() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(110) } };
	}
	@DataProvider
	public Object[][] getData112() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\DELL\\eclipse-workspace\\Lauditor2\\src\\test\\java\\file\\data\\Meetings\\createMeetings.json");

		return new Object[][] { { data.get(111) } };
	}
}
