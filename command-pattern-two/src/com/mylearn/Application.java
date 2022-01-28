package com.mylearn;

public class Application {
    private final Executor executor;
    private final Editor editor;

    public Application(Executor executor, Editor editor) {
        this.executor = executor;
        this.editor = editor;
    }

    void run() {
        //here should be code =)
        editor.selectAll();
        editor.saveToClipboard(editor.getSelection());
        editor.replaceSelection(editor.getClipboard());
    }
}
