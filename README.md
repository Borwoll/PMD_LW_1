<h1 align="center">
  <br>
  <br>
  Laboratory work №1
  <br>
</h1>

<h4 align="center">The first laboratory work on the discipline programming of mobile devices.</h4>

<p align="center">
  <a href="#how-to-use">How To Use</a> •
  <a href="#tasks">Additional tasks for work</a> •
  <a href="#screenshots_task">Screenshots of the task</a> •
  <a href="#screenshots">Screenshots of the application</a> •
  <a href="#license">License</a>
</p>

## How To Use

To clone and run this application, you'll need [Git](https://git-scm.com) installed on your computer. From your command line:

```bash
# Clone this repository
$ git clone https://github.com/Borwoll/PMD_LW_1.git
```

After executing the command, open the project in android studio. After the gradle build is complete, you will be able to launch the application.

## Additional tasks for work
1. Записать последовательность вызовов методов для следующего сценария: запустить MainActiivty и после этого повернуть устройство, чтобы поменялась ориентация экрана.
Когда приложение запускается впервые, вызываются методы жизненного цикла onCreate(), onStart() и onResume() для MainActivity.
При изменении ориентации устройства происходит уничтожение и пересоздание Activity. Сначала вызываются методы жизненного цикла onPause() и onStop(), а затем вызывается метод onDestroy(). Это происходит, потому что при изменении ориентации устройства происходит пересоздание всех элементов пользовательского интерфейса.
Затем вызываются методы жизненного цикла onCreate(), onStart() и onResume() для новой версии MainActivity. При этом, состояние Activity сохраняется перед уничтожением и восстанавливается после создания новой версии Activity.
Таким образом, приложение переживает полный цикл жизни Activity при изменении ориентации устройства, с вызовом методов жизненного цикла, которые позволяют приложению сохранить и восстановить состояние после уничтожения и пересоздания Activity.

2. Записать последовательность вызовов методов для следующего сценария: запустить MainActiivty и перейти к DetailActivity.
Когда запускается приложение, сначала вызываются методы жизненного цикла MainActivity - onCreate(), onStart() и onResume(). Затем пользователь переходит на DetailActivity, и вызываются соответствующие методы жизненного цикла.
Метод go_to_detail_activity() вызывается из MainActivity и не относится к методам жизненного цикла, поэтому он не включен в последовательность вызовов методов жизненного цикла.
При переходе на DetailActivity, MainActivity становится невидимым для пользователя, и поэтому вызываются методы жизненного цикла onPause() и onStop(). Затем, при старте DetailActivity вызываются методы жизненного цикла onStart() и onResume().
При возврате на MainActivity, вызываются методы жизненного цикла onStart() и onResume(), т.к. MainActivity становится снова видимым для пользователя. Вызывается метод onStop() после перехода на DetailActivity, т.к. MainActivity становится невидимым для пользователя.
Таким образом, последовательность вызовов методов жизненного цикла зависит от состояния Activity и событий, которые происходят в приложении. Знание жизненного цикла Activity помогает разработчикам понимать, как и когда обрабатывать различные события, связанные с пользовательским вводом, изменением состояния устройства и другими факторами, влияющими на работу приложения.

## Screenshots of the task
<p align="center">
  <img src="https://i.imgur.com/ieIJfHT.png">
</p>

## Screenshots of the application
<p align="center">
  <img src="https://i.imgur.com/t6F25rU.png">
  <img src="https://i.imgur.com/glbkCsN.png">
</p>

## License

MIT

---

> GitHub [@borwoll](https://github.com/borwoll)