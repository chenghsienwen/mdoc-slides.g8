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

### Troubleshooting

jekyll not installed

if run jekyll -v show following error
```
wen@wen-Lenovo-ideapad-330-15IKB:~/vpon/mdoc-slides.g8/profile2023/docs$ jekyll -v
Ignoring byebug-11.1.3 because its extensions are not built. Try: gem pristine byebug --version 11.1.3
Ignoring debase-0.2.4.1 because its extensions are not built. Try: gem pristine debase --version 0.2.4.1
Ignoring executable-hooks-1.5.0 because its extensions are not built. Try: gem pristine executable-hooks --version 1.5.0
Ignoring gem-wrappers-1.4.0 because its extensions are not built. Try: gem pristine gem-wrappers --version 1.4.0
Ignoring json-2.6.0 because its extensions are not built. Try: gem pristine json --version 2.6.0
Ignoring nio4r-2.5.8 because its extensions are not built. Try: gem pristine nio4r --version 2.5.8
Ignoring nokogiri-1.10.9 because its extensions are not built. Try: gem pristine nokogiri --version 1.10.9
Ignoring racc-1.6.0 because its extensions are not built. Try: gem pristine racc --version 1.6.0
Ignoring racc-1.5.2 because its extensions are not built. Try: gem pristine racc --version 1.5.2
Ignoring ruby-debug-ide-0.7.3 because its extensions are not built. Try: gem pristine ruby-debug-ide --version 0.7.3
Ignoring websocket-driver-0.7.5 because its extensions are not built. Try: gem pristine websocket-driver --version 0.7.5
Traceback (most recent call last):
        2: from /usr/bin/jekyll:4:in `<main>'
        1: from /home/wen/.rvm/rubies/ruby-2.6.0/lib/ruby/site_ruby/2.6.0/rubygems/core_ext/kernel_require.rb:92:in `require'
/home/wen/.rvm/rubies/ruby-2.6.0/lib/ruby/site_ruby/2.6.0/rubygems/core_ext/kernel_require.rb:92:in `require': cannot load such file -- jekyll (LoadError)
```

this means jekyll try to use ruby 2.6.0 but current ruby version not 2.6.0 and miss some essential libs

so need to change ruby version:
```
wen@wen-Lenovo-ideapad-330-15IKB:~/vpon/mdoc-slides.g8/profile2023/docs$ rvm use ruby 2.6.0
Warning! PATH is not properly set up, /home/wen/.rvm/gems/ruby-2.5.1/bin is not at first place.
         Usually this is caused by shell initialization files. Search for PATH=... entries.
         You can also re-add RVM to your profile by running: rvm get stable --auto-dotfiles
         To fix it temporarily in this shell session run: rvm use ruby-2.5.1
         To ignore this error add rvm_silence_path_mismatch_check_flag=1 to your ~/.rvmrc file.
Using /home/wen/.rvm/gems/ruby-2.6.0
```

then check ruby version and jekyll is works as expected
```
wen@wen-Lenovo-ideapad-330-15IKB:~/vpon/mdoc-slides.g8/profile2023/docs$ ruby -v
ruby 2.6.0p0 (2018-12-25 revision 66547) [x86_64-linux]
wen@wen-Lenovo-ideapad-330-15IKB:~/vpon/mdoc-slides.g8/profile2023/docs$ jekyll -v
jekyll 4.1.1
```

This project was generated using [Giter8][g8] with template [mdoc-slides.g8][mdoc-slides.g8]


[g8]: http://www.foundweekends.org/giter8/
[mdoc-slides.g8]: https://github.com/chenghsienwen/mdoc-slides.g8
[mdoc]: https://scalameta.org/mdoc
[jekyll]: https://jekyllrb.com/docs/installation/