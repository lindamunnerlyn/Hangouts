// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.views.AudioAttachmentView;

public final class ega
    implements egf
{

    final aoa a;
    final String b;
    final String c;
    final AudioAttachmentView d;

    public ega(AudioAttachmentView audioattachmentview, aoa aoa, String s, String s1)
    {
        d = audioattachmentview;
        a = aoa;
        b = s;
        c = s1;
        super();
    }

    public void a()
    {
        if (a == null || b == null)
        {
            eev.f("Babel", "account or photoid are null in fetchAudioUrl");
        }
        aoq.a(a, null, b, c);
    }
}
