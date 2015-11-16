// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.AudioManager;

final class cnd extends coj
{

    final AudioManager a;
    final cna b;

    cnd(cna cna, String s, AudioManager audiomanager)
    {
        b = cna;
        a = audiomanager;
        super(s);
    }

    public void a()
    {
        a.setMicrophoneMute(true);
    }
}
