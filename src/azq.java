// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;

final class azq
    implements aqb
{

    private final android.support.rastermill.FrameSequenceDrawable.OnFinishedListener a;
    private final ani b;
    private final ImageView c;
    private apw d;

    public azq(android.support.rastermill.FrameSequenceDrawable.OnFinishedListener onfinishedlistener, ani ani, ImageView imageview)
    {
        a = onfinishedlistener;
        b = ani;
        c = imageview;
    }

    public void a()
    {
        if (d != null)
        {
            d.b();
        }
    }

    public void a(apw apw1)
    {
        d = apw1;
    }

    public void a(ebh ebh1, eab eab1, boolean flag, apw apw1, boolean flag1)
    {
        if (ebh1 != null)
        {
            ebw.g("Babel", "Unexpected refCountedBitmap returned on a STICKER_REQUEST");
            ebh1.b();
        }
        if (apw1 == d) goto _L2; else goto _L1
_L1:
        return;
_L2:
        d = null;
        if (!flag || eab1 == null) goto _L1; else goto _L3
_L3:
        int i;
        if (apw1.l() instanceof Integer)
        {
            i = g.a((Integer)apw1.l(), 0);
        } else
        {
            i = 1;
        }
        ebh1 = (android.widget.RelativeLayout.LayoutParams)c.getLayoutParams();
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            ebh1.removeRule(9);
            ebh1.removeRule(11);
            ebh1.removeRule(14);
        } else
        {
            ebh1.addRule(9, 0);
            ebh1.addRule(11, 0);
            ebh1.addRule(14, 0);
        }
        i;
        JVM INSTR tableswitch 2 3: default 124
    //                   2 217
    //                   3 227;
           goto _L4 _L5 _L6
_L4:
        ebh1.addRule(11, -1);
_L8:
        c.setLayoutParams(ebh1);
        c.setVisibility(0);
        ebh1 = new FrameSequenceDrawable(FrameSequence.decodeByteArray(eab1.c()));
        ebh1.setOnFinishedListener(a);
        c.setImageDrawable(ebh1);
        ebh1.start();
        g.a(b, 2019);
        return;
_L5:
        ebh1.addRule(9, -1);
        continue; /* Loop/switch isn't completed */
_L6:
        ebh1.addRule(14, -1);
        if (true) goto _L8; else goto _L7
_L7:
    }
}
