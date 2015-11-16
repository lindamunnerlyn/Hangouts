// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.Decoder;

public final class gcq
    implements Runnable
{

    final int a;
    final Decoder b;

    public gcq(Decoder decoder, int i)
    {
        b = decoder;
        a = i;
        super();
    }

    public void run()
    {
        Decoder.i(b).a();
    }
}
