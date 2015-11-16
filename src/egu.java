// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Pair;
import com.google.android.apps.hangouts.views.VoiceRatesAndBalanceView;

public final class egu extends dgp
{

    final VoiceRatesAndBalanceView a;

    public egu(VoiceRatesAndBalanceView voiceratesandbalanceview)
    {
        a = voiceratesandbalanceview;
        super();
    }

    public void a(int i, ani ani, dgu dgu1)
    {
        Object obj = VoiceRatesAndBalanceView.a(a);
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = dgu1.c();
        if (VoiceRatesAndBalanceView.b(a) == null || i != g.a((Integer)VoiceRatesAndBalanceView.b(a).first, 0)) goto _L2; else goto _L1
_L1:
        dgu1 = (String)VoiceRatesAndBalanceView.b(a).second;
        if (obj1 instanceof cwe)
        {
            obj1 = (cwe)obj1;
            VoiceRatesAndBalanceView.a(a, dgu1, ((cwe) (obj1)).n(), ((cwe) (obj1)).m(), ani);
        }
        VoiceRatesAndBalanceView.c(a);
_L4:
        return;
_L2:
        if (i == VoiceRatesAndBalanceView.d(a))
        {
            VoiceRatesAndBalanceView.a(a, ani);
            VoiceRatesAndBalanceView.e(a);
            VoiceRatesAndBalanceView.f(a);
        }
        if (true) goto _L4; else goto _L3
_L3:
        ani;
        obj;
        JVM INSTR monitorexit ;
        throw ani;
    }

    public void a(int i, ani ani, dko dko, dbo dbo)
    {
        ani = ((ani) (VoiceRatesAndBalanceView.a(a)));
        ani;
        JVM INSTR monitorenter ;
        if (VoiceRatesAndBalanceView.b(a) == null || i != g.a((Integer)VoiceRatesAndBalanceView.b(a).first, 0)) goto _L2; else goto _L1
_L1:
        VoiceRatesAndBalanceView.c(a);
_L4:
        ebw.g("Babel_calls", String.format("Voice request failed", new Object[] {
            dbo
        }));
        return;
_L2:
        if (i == VoiceRatesAndBalanceView.d(a))
        {
            VoiceRatesAndBalanceView.e(a);
        }
        if (true) goto _L4; else goto _L3
_L3:
        dko;
        ani;
        JVM INSTR monitorexit ;
        throw dko;
    }
}
