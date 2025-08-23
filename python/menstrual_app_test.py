import unittest;
import menstrual_app;


class TestCalculateSafePeriods(unittest.TestCase):
	def test_if_function_exist(self):
		menstrual_app.calculate_safe_periods


	def test_function_is_working(self):
		menstrual_app.calculate_safe_periods(28);


class TestCalculateOvulationDay(unittest.TestCase):
	def test_if_function_exist(self):
		menstrual_app.calculate_ovulation_day(28);

	def test_function_is_working(self):
		expected = 14;
		result = menstrual_app.calculate_ovulation_day(28);
		self.assertEqual(expected, result);

class TestCalculateNextPeriodDay(unittest.TestCase):
	def test_if_function_exist(self):
		menstrual_app.calculate_next_eriod_day(28, 5);

	def test_function_is_working(self):
		expected = 29;
		result = menstrual_app.calculate_next_eriod_day(28, 1);
		self.assertEqual(expected, result);
