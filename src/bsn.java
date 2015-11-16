// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.hangouts.hangout.FocusedParticipantView;
import com.google.android.apps.hangouts.hangout.ParticipantTrayView;

public final class bsn extends brt
{

    private final brw l = new brw(this);
    private boolean m;

    public bsn(bqo bqo, gmt gmt, ParticipantTrayView participanttrayview, FocusedParticipantView focusedparticipantview)
    {
        boolean flag = true;
        super(bqo, gmt, participanttrayview, focusedparticipantview);
        a(getResources().getString(l.ez));
        if (getResources().getConfiguration().orientation != 1)
        {
            flag = false;
        }
        m = flag;
    }

    public void a(bpc bpc1)
    {
        super.a(bpc1);
        c.a(l);
        bpc1 = bnk.k();
        byte byte0;
        if (bpc1 != null && bpc1.h())
        {
            byte0 = 3;
        } else
        {
            byte0 = 1;
        }
        c(byte0);
    }

    protected void a(gmw gmw)
    {
        eev.e("Babel_calls", "SelfParticipantView: Creating renderer");
        c.a(gmw);
    }

    protected int b(int i)
    {
        boolean flag = m;
        eev.a("Babel_calls", (new StringBuilder(54)).append("SelfParticipantView.getWidthForHeight isPortrait=").append(flag).toString());
        gnk gnk1 = new gnk(16, 10);
        if (m)
        {
            gnk1 = new gnk(gnk1.b, gnk1.a);
        }
        int j = (int)(((float)gnk1.a / (float)gnk1.b) * (float)i);
        eev.a("Babel_calls", (new StringBuilder(65)).append("SelfParticipantView.getWidthForHeight w=").append(j).append(" h=").append(i).toString());
        return j;
    }

    public void b()
    {
        c.b(l);
        super.b();
    }

    protected void c(int i)
    {
        super.c(i);
        if (k == null && i == 1)
        {
            String s = d.a().v();
            if (!TextUtils.isEmpty(s))
            {
                c(s);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        boolean flag = true;
        boolean flag1;
        if (configuration.orientation != 1)
        {
            flag = false;
        }
        flag1 = m;
        eev.a("Babel_calls", (new StringBuilder(79)).append("SelfParticipantView.onConfigurationChanged isPortrait=").append(flag1).append(" newIsPortrait=").append(flag).toString());
        m = flag;
        super.onConfigurationChanged(configuration);
    }
}
