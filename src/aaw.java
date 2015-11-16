// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

public final class aaw
    implements br
{

    final aam a;

    aaw(aam aam1)
    {
        a = aam1;
        super();
    }

    public em onCreateLoader(int i, Bundle bundle)
    {
        bundle = bundle.getString("image_uri");
        switch (i)
        {
        default:
            return null;

        case 2: // '\002'
            return a.a(2, bundle);

        case 1: // '\001'
            return a.a(1, bundle);
        }
    }

    public void onLoadFinished(em em1, Object obj)
    {
        aaf aaf1;
        obj = ((abi)obj).a(a.c.getResources());
        aaf1 = a.c.j();
        em1.o();
        JVM INSTR tableswitch 1 2: default 60
    //                   1 141
    //                   2 61;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        if (!((aam) (em1 = a)).q)
        {
            ((aam) (em1)).j.setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
            if (obj != null)
            {
                if (((aam) (em1)).g.getMeasuredWidth() == 0)
                {
                    obj = ((aam) (em1)).g;
                    ((View) (obj)).getViewTreeObserver().addOnGlobalLayoutListener(new aat(em1, ((View) (obj))));
                } else
                {
                    em1.n();
                }
            }
            ((aam) (em1)).c.f().a(100, null, em1);
            return;
        }
          goto _L1
_L2:
        if (obj == null)
        {
            aaf1.a(null);
            return;
        } else
        {
            aaf1.a(((android.graphics.drawable.Drawable) (obj)));
            return;
        }
    }

    public void onLoaderReset(em em1)
    {
    }
}
