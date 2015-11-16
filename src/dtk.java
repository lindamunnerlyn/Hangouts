// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Picture;
import android.util.DisplayMetrics;
import android.widget.ImageView;

public final class dtk
    implements Runnable
{

    final Resources a;
    final int b;
    final ImageView c;
    final dtm d;
    final boolean e = true;

    public dtk(Resources resources, int i, ImageView imageview, dtm dtm1, boolean flag)
    {
        a = resources;
        b = i;
        c = imageview;
        d = dtm1;
        super();
    }

    public void run()
    {
        Object obj;
        Picture picture;
        Resources resources;
        int i;
        int j;
        int k;
        int l;
        picture = kxd.a(a, b).a();
        i = picture.getHeight();
        j = picture.getWidth();
        k = c.getMeasuredHeight();
        l = c.getMeasuredWidth();
        obj = d;
        resources = a;
_L11:
        dtl.a[((dtm) (obj)).ordinal()];
        JVM INSTR tableswitch 1 5: default 100
    //                   1 147
    //                   2 147
    //                   3 202
    //                   4 214
    //                   5 240;
           goto _L1 _L2 _L2 _L3 _L4 _L5
_L1:
        float f;
        obj = String.valueOf(obj);
        gbh.a((new StringBuilder(String.valueOf(obj).length() + 21)).append("Invalid scaleMethod: ").append(((String) (obj))).toString());
        f = 0.0F;
_L8:
        if (f > 1.401298E-45F) goto _L7; else goto _L6
_L6:
        return;
_L2:
        if (i * l < k * j)
        {
            if (obj == dtm.a)
            {
                obj = dtm.e;
            } else
            {
                obj = dtm.d;
            }
        } else
        if (obj == dtm.a)
        {
            obj = dtm.d;
        } else
        {
            obj = dtm.e;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        f = resources.getDisplayMetrics().density;
          goto _L8
_L4:
        if (i == 0)
        {
            throw new IllegalArgumentException("Source height cannot be 0");
        }
        f = (float)k / (float)i;
          goto _L8
_L5:
        if (j == 0)
        {
            throw new IllegalArgumentException("Source width cannot be 0");
        }
        f = (float)l / (float)j;
          goto _L8
_L7:
        c.setImageDrawable(new dtn(picture, f));
        if (!e) goto _L6; else goto _L9
_L9:
        android.view.ViewGroup.LayoutParams layoutparams = c.getLayoutParams();
        layoutparams.height = -2;
        layoutparams.width = -2;
        c.setLayoutParams(layoutparams);
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }
}
