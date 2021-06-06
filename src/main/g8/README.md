# $title$

Code in `core` module is accessible in your slides

Raw slides are in `slides/mdoc/index.html`

### How to compile slides

* run `sbt docs/mdoc` to compile slides using [mdoc][mdoc]. 
* compiled slide at `docs/index.html`.
* You need to run at http protocol, ex:[jekyll][jekyll]

```
cd docs
jekyll server
```
### How to publish slides with github

When you are ready push the repository to github (including the compiled slides in `docs`).
Then go to project settings -> GitHub Pages and select `master branch /docs folder` for the source of github pages.



This project was generated using [Giter8][g8] with template [mdoc-slides.g8][mdoc-slides.g8]


[g8]: http://www.foundweekends.org/giter8/
[mdoc-slides.g8]: https://github.com/chenghsienwen/mdoc-slides.g8
[mdoc]: https://scalameta.org/mdoc
[jekyll]: https://jekyllrb.com/docs/installation/