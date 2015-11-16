// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;

final class baf
    implements aqs
{

    private final android.support.rastermill.FrameSequenceDrawable.OnFinishedListener a;
    private final aoa b;
    private final ImageView c;
    private aqn d;

    public baf(android.support.rastermill.FrameSequenceDrawable.OnFinishedListener onfinishedlistener, aoa aoa, ImageView imageview)
    {
        a = onfinishedlistener;
        b = aoa;
        c = imageview;
    }

    public void a()
    {
        if (d != null)
        {
            d.b();
        }
    }

    public void a(aqn aqn1)
    {
        d = aqn1;
    }

    public void a(eef eef1, edf edf1, boolean flag, aqn aqn1, boolean flag1)
    {
        if (eef1 != null)
        {
            eev.g("Babel", "Unexpected refCountedBitmap returned on a STICKER_REQUEST");
            eef1.b();
        }
        if (aqn1 == d) goto _L2; else goto _L1
_L1:
        return;
_L2:
        d = null;
        if (!flag || edf1 == null) goto _L1; else goto _L3
_L3:
        int i;
        if (aqn1.m() instanceof Integer)
        {
            i = g.a((Integer)aqn1.m(), 0);
        } else
        {
            i = 1;
        }
        eef1 = (android.widget.RelativeLayout.LayoutParams)c.getLayoutParams();
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            eef1.removeRule(9);
            eef1.removeRule(11);
            eef1.removeRule(14);
        } else
        {
            eef1.addRule(9, 0);
            eef1.addRule(11, 0);
            eef1.addRule(14, 0);
        }
        i;
        JVM INSTR tableswitch 2 3: default 124
    //                   2 217
    //                   3 227;
           goto _L4 _L5 _L6
_L4:
        eef1.addRule(11, -1);
_L8:
        c.setLayoutParams(eef1);
        c.setVisibility(0);
        eef1 = new FrameSequenceDrawable(FrameSequence.decodeByteArray(edf1.c()));
        eef1.setOnFinishedListener(a);
        c.setImageDrawable(eef1);
        eef1.start();
        g.a(b, 2019);
        return;
_L5:
        eef1.addRule(9, -1);
        continue; /* Loop/switch isn't completed */
_L6:
        eef1.addRule(14, -1);
        if (true) goto _L8; else goto _L7
_L7:
    }
}
