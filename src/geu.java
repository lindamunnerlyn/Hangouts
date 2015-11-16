// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.RemoteRenderer;

public final class geu
    implements Runnable
{

    final RemoteRenderer a;

    public geu(RemoteRenderer remoterenderer)
    {
        a = remoterenderer;
        super();
    }

    public void run()
    {
        RemoteRenderer.a(a).a();
    }
}
