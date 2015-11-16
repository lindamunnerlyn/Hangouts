// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.views.ParticipantsGalleryView;

public final class egb
{

    private int a;
    private boolean b;
    private final ParticipantsGalleryView c;

    public egb(ParticipantsGalleryView participantsgalleryview, int i)
    {
        a = 0;
        b = false;
        c = participantsgalleryview;
        a = i;
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            b = true;
        }
        int i = a - 1;
        a = i;
        if (i == 0)
        {
            flag = b;
            ParticipantsGalleryView.a(c);
            Handler handler = ParticipantsGalleryView.c(c);
            long l;
            if (flag)
            {
                l = ParticipantsGalleryView.b(c);
            } else
            {
                l = 0L;
            }
            handler.sendEmptyMessageDelayed(0, l);
        }
    }
}
