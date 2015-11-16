// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaPlayer;
import java.io.IOException;

final class dxg
    implements Runnable
{

    final dxf a;

    dxg(dxf dxf1)
    {
        a = dxf1;
        super();
    }

    public void run()
    {
        dxf dxf1 = a;
        eev.e("Babel_telephony", "TeleConnectingSoundPlayer.startAfterDelay");
        dxf1.b = new MediaPlayer();
        dxf1.b.setLooping(true);
        dxf1.b.setOnPreparedListener(dxf1);
        dxf1.b.setOnErrorListener(dxf1);
        dxf1.b.setAudioStreamType(0);
        try
        {
            dxf1.b.setDataSource(dxf1.a, eep.c(g.ph));
        }
        catch (IOException ioexception)
        {
            eev.e("Babel_telephony", "TeleConnectingSoundPlayer.startAfterDelay, failed to set data source", ioexception);
            dxf1.b();
            return;
        }
        try
        {
            dxf1.b.prepareAsync();
            dxf1.c = true;
            return;
        }
        catch (Exception exception)
        {
            eev.e("Babel_telephony", "TeleConnectingSoundPlayer.startAfterDelay, failed to prepare", exception);
        }
        dxf1.b();
    }
}
