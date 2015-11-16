// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaPlayer;

final class eeq
    implements android.media.MediaPlayer.OnCompletionListener
{

    eeq()
    {
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        mediaplayer.release();
    }
}
