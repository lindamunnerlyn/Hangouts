// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.views.OverlayedAvatarView;
import com.google.android.apps.hangouts.views.ParticipantsGalleryView;

public final class ega
    implements Runnable
{

    final OverlayedAvatarView a;
    final ceu b;
    final egb c;
    final int d;
    final int e;
    final ParticipantsGalleryView f;

    public ega(ParticipantsGalleryView participantsgalleryview, OverlayedAvatarView overlayedavatarview, ceu ceu1, egb egb1, int i, int j)
    {
        f = participantsgalleryview;
        a = overlayedavatarview;
        b = ceu1;
        c = egb1;
        d = i;
        e = j;
        super();
    }

    public void run()
    {
        int i = a.c();
        a.f(0);
        if (i != 0)
        {
            a.e(i);
            ParticipantsGalleryView.a(f, a, ParticipantsGalleryView.a(f, i), i, b.e, b.h);
        } else
        {
            synchronized (ParticipantsGalleryView.f(f))
            {
                ParticipantsGalleryView.f(f).remove(b.b);
            }
            ParticipantsGalleryView.g(f);
        }
        ParticipantsGalleryView.a(f, b);
        c.a(true);
        if (ParticipantsGalleryView.f())
        {
            ParticipantsGalleryView participantsgalleryview = f;
            OverlayedAvatarView overlayedavatarview = a;
            int j = d;
            int k = e;
            ParticipantsGalleryView.a(participantsgalleryview, overlayedavatarview, (new StringBuilder(57)).append("Move (end) ").append(j).append(" -> ").append(k).append("(actual ").append(i).append(")").toString());
        }
        return;
        exception;
        eay1;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
