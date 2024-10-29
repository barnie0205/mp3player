module bn.mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires jid3lib;

    exports bn.mp3player.main to javafx.graphics;
    opens bn.mp3player.controller to javafx.fxml;
    opens bn.mp3player.mp3 to javafx.base;
}