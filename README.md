# Exceptions workshop

1. Задачи расположены в пакете `src/main/java/`
2. Каждая задача лежит в пакете `task_{номер}`. Ее условие описано в файле `task.md`
3. Решение реализовываем именно внутри этого пакета. Если нужны дополнительные пакеты, то создаем их там же.
4. Если вы можете покрыть свои решения unit-тестами, то всегда здорово это делать. Но не переживайте, если пока ничего
   не знаете о них - мы принимаем решения и без них прямо сейчас.
5. Для задач также будут доступны подсказки по каждой задаче. Они будут лежать внутри пакета `task_{номер}` в
   пакете `clues`. К каждой задаче будут доступны 3 подсказки от более абстрактной к более конкретной.
6. Клонируйте репозиторий к себе на ПК(Инструкция ниже).
7. Создайте свою ветку, где будете реализовывать решение задач.
8. Решите задачу, сделайте пуш с решением в удаленный репозиторий.
9. Чтобы отправить задачу на проверку, достаточно просто создать pull request в master ветку(Инструкция ниже).
   **Очень важно! Для каждой задачи создается отдельный Pull Request!**

# Как клонировать репозиторий

Клонирование репозитория Git позволяет получить локальную копию удаленного репозитория. Для клонирования репозитория вам нужно выполнить следующие шаги:
1. Откройте терминал и перейдите в папку, где вы хотите сохранить локальную копию репозитория;
2. Выберите удаленный репозиторий, который вы хотите клонировать. Например, если вы хотите клонировать репозиторий с GitHub, найдите его на GitHub и скопируйте его URL;
3. Выполните команду клонирования, указав URL удалённого репозитория git clone <URL удаленного репозитория>.
   Например, если вы хотите клонировать репозиторий с GitHub, вы можете выполнить команду git clone <https://github.com/username/repository.git> , где "username/repository" — имя пользователя, а также имя репозитория на GitHub;
5. Git создаст локальную копию удаленного репозитория в текущем каталоге. Локальную копию вы можете изменять и синхронизировать с удалённым репозиторием по мере необходимости.

# Как создать Pull Request
Идём в удаленный репозиторий на GitHub. Так как мы только что сделали push с решением задачи в свою ветку, то сразу же видим сообщение с предложением создать Pull Request.
Жмём на зеленую кнопку.
![Image1](https://github.com/FAANG-School/exceptions_workshop/blob/master/images/image1.png)
Если не видите эту жёлтую всплывашку, то просто перейдите во вкладку Pull requests сверху, и нажмите зеленую кнопку там.
Pull request — запрос на слияние вашей ветки с изменениями с другой веткой.
В нем видно отличия master ветки от ветки, которую вы хотетите смерджить(в нашем случае с решением задачи). 
Соответственно мы сможем проверить реализованное решение.
Открывается страничка, где нужно написать комментарий(напишите решение какой задачи находится в данном PR).
Ещё раз проверить, что всё ок с теми изменениями, которые мы вносим.
Затем смело жмём Create pull request
![Image2](https://github.com/FAANG-School/exceptions_workshop/blob/master/images/image2.png)
После этого мы увидим ваш pull request и сможем проверить решение.
