// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.views.AudioAttachmentView;

public final class ecy
    implements edd
{

    final ani a;
    final String b;
    final String c;
    final AudioAttachmentView d;

    public ecy(AudioAttachmentView audioattachmentview, ani ani, String s, String s1)
    {
        d = audioattachmentview;
        a = ani;
        b = s;
        c = s1;
        super();
    }

    public void a()
    {
        if (a == null || b == null)
        {
            ebw.f("Babel", "account or photoid are null in fetchAudioUrl");
        }
        any.a(a, null, b, c);
    }
}
