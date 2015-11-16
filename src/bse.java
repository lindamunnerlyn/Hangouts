// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.hangouts.hangout.FocusedParticipantView;
import com.google.android.apps.hangouts.hangout.ParticipantTrayView;

public final class bse extends brk
{

    private final brn k = new brn(this);
    private boolean l;

    public bse(bqf bqf, gjr gjr, ParticipantTrayView participanttrayview, FocusedParticipantView focusedparticipantview)
    {
        boolean flag = true;
        super(bqf, gjr, participanttrayview, focusedparticipantview);
        a(getResources().getString(l.eQ));
        if (getResources().getConfiguration().orientation != 1)
        {
            flag = false;
        }
        l = flag;
    }

    public void a(bot bot1)
    {
        super.a(bot1);
        c.a(k);
        bot1 = bnd.l();
        byte byte0;
        if (bot1 != null && bot1.h())
        {
            byte0 = 3;
        } else
        {
            byte0 = 1;
        }
        c(byte0);
    }

    protected void a(gju gju)
    {
        ebw.e("Babel_calls", "SelfParticipantView: Creating renderer");
        c.a(gju);
    }

    protected int b(int i)
    {
        boolean flag = l;
        ebw.a("Babel_calls", (new StringBuilder(54)).append("SelfParticipantView.getWidthForHeight isPortrait=").append(flag).toString());
        gki gki1 = new gki(16, 10);
        if (l)
        {
            gki1 = new gki(gki1.b, gki1.a);
        }
        int j = (int)(((float)gki1.a / (float)gki1.b) * (float)i);
        ebw.a("Babel_calls", (new StringBuilder(65)).append("SelfParticipantView.getWidthForHeight w=").append(j).append(" h=").append(i).toString());
        return j;
    }

    public void b()
    {
        c.b(k);
        super.b();
    }

    protected void c(int i)
    {
        super.c(i);
        if (j == null && i == 1)
        {
            String s = d.a().x();
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
        flag1 = l;
        ebw.a("Babel_calls", (new StringBuilder(79)).append("SelfParticipantView.onConfigurationChanged isPortrait=").append(flag1).append(" newIsPortrait=").append(flag).toString());
        l = flag;
        super.onConfigurationChanged(configuration);
    }
}
