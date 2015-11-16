// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

final class grw
    implements gux
{

    final grs a;

    grw(grs grs1)
    {
        a = grs1;
        super();
    }

    public Object a(guy guy, Object obj)
    {
        guy = null;
        if (obj instanceof Bitmap)
        {
            guy = (Bitmap)obj;
        } else
        if (obj instanceof gup)
        {
            gup gup1 = (gup)obj;
            guy = ((gup)obj).a;
            if (gup1.b < guy.getWidth() || gup1.c < guy.getHeight())
            {
                guy = Bitmap.createBitmap(guy, 0, 0, gup1.b, gup1.c);
            }
        }
        if (guy == null)
        {
            return obj;
        } else
        {
            obj = grs.a(a).a(guy.getWidth(), guy.getHeight());
            obj = hgn.a(guy, g.F(grs.b(a)), ((Bitmap) (obj)));
            grs.a(a).a(guy);
            return obj;
        }
    }
}
