# GitHubApi

### Использованные API и доступные запросы:

- [OpenWeatherApi](https://openweathermap.org/api)
  - `/weather` - данные о погоде на текущий момент времени 
  - `/forecast` - прогноз погоды на 5 дней, с данными за каждые 3 часа
  - `/historical` - исторические данные о погоде
  - `/forecast/daily` - прогноз погоды на 16 дней, с данными за каждый день 
 
Запросы `/historical` и `/forecast/daily` не работают из-за ограничений имеющегося API-ключа, но всё равно решил их не убирать.

- [Open GitHub API](https://docs.github.com/en/rest?apiVersion=2022-11-28)
