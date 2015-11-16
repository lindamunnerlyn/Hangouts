// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.hangouts.views.VoiceRatesAndBalanceView;
import java.util.Locale;

public final class ejw extends dhy
{

    final VoiceRatesAndBalanceView a;

    public ejw(VoiceRatesAndBalanceView voiceratesandbalanceview)
    {
        a = voiceratesandbalanceview;
        super();
    }

    public void a(int i, aoa aoa, did did1)
    {
        Object obj1 = a.e;
        obj1;
        JVM INSTR monitorenter ;
        Object obj = did1.c();
        if (a.f == null || i != g.a((Integer)a.f.first, 0)) goto _L2; else goto _L1
_L1:
        did1 = (String)a.f.second;
        if (!(obj instanceof cyi)) goto _L4; else goto _L3
_L3:
        VoiceRatesAndBalanceView voiceratesandbalanceview;
        String s;
        boolean flag;
        obj = (cyi)obj;
        voiceratesandbalanceview = a;
        flag = ((cyi) (obj)).n();
        s = ((cyi) (obj)).m();
        did1 = eey.a(did1);
        if (did1 != null) goto _L6; else goto _L5
_L5:
        did1 = Locale.getDefault();
_L11:
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        did1 = voiceratesandbalanceview.getResources().getString(l.bk, new Object[] {
            did1.getDisplayCountry()
        });
        voiceratesandbalanceview.b.setText(did1);
        stringbuilder.append(did1);
        if (!flag) goto _L8; else goto _L7
_L7:
        i = voiceratesandbalanceview.getResources().getColor(g.dg);
        did1 = voiceratesandbalanceview.getResources().getString(l.bl);
        obj = did1;
_L12:
        voiceratesandbalanceview.c.setTextColor(i);
        voiceratesandbalanceview.c.setText(((CharSequence) (obj)));
        stringbuilder.append(did1);
        if (!voiceratesandbalanceview.a(aoa, stringbuilder)) goto _L10; else goto _L9
_L9:
        voiceratesandbalanceview.a.setContentDescription(voiceratesandbalanceview.getResources().getString(l.dg, new Object[] {
            stringbuilder.toString()
        }));
_L13:
        voiceratesandbalanceview.setVisibility(0);
_L4:
        a.a();
_L15:
        obj1;
        JVM INSTR monitorexit ;
        return;
_L6:
        did1 = new Locale(Locale.getDefault().getLanguage(), did1);
          goto _L11
        aoa;
        obj1;
        JVM INSTR monitorexit ;
        throw aoa;
_L8:
        i = voiceratesandbalanceview.getResources().getColor(g.df);
        obj = voiceratesandbalanceview.getResources().getString(l.bq, new Object[] {
            s
        });
        did1 = voiceratesandbalanceview.getResources().getString(l.br, new Object[] {
            s
        });
          goto _L12
_L10:
        voiceratesandbalanceview.a.setContentDescription(stringbuilder.toString());
          goto _L13
_L2:
        if (i != a.g) goto _L15; else goto _L14
_L14:
        a.a(aoa, null);
        a.b();
        a.d = false;
          goto _L15
    }

    public void a(int i, aoa aoa, dmf dmf, dcx dcx)
    {
        aoa = ((aoa) (a.e));
        aoa;
        JVM INSTR monitorenter ;
        if (a.f == null || i != g.a((Integer)a.f.first, 0)) goto _L2; else goto _L1
_L1:
        a.a();
_L4:
        eev.g("Babel_calls", String.format("Voice request failed", new Object[] {
            dcx
        }));
        return;
_L2:
        if (i == a.g)
        {
            a.b();
        }
        if (true) goto _L4; else goto _L3
_L3:
        dmf;
        aoa;
        JVM INSTR monitorexit ;
        throw dmf;
    }
}
