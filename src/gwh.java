// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

final class gwh
    implements gzh
{

    final gwd a;

    gwh(gwd gwd1)
    {
        a = gwd1;
        super();
    }

    public Object a(gzi gzi, Object obj)
    {
        gzi = null;
        if (obj instanceof Bitmap)
        {
            gzi = (Bitmap)obj;
        } else
        if (obj instanceof gyz)
        {
            gyz gyz1 = (gyz)obj;
            gzi = ((gyz)obj).a;
            if (gyz1.b < gzi.getWidth() || gyz1.c < gzi.getHeight())
            {
                gzi = Bitmap.createBitmap(gzi, 0, 0, gyz1.b, gyz1.c);
            }
        }
        if (gzi == null)
        {
            return obj;
        } else
        {
            obj = a.b.a(gzi.getWidth(), gzi.getHeight());
            obj = hlf.a(gzi, g.F(a.a), ((Bitmap) (obj)));
            a.b.a(gzi);
            return obj;
        }
    }
}
