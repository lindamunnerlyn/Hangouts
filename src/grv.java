// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

final class grv
    implements gux
{

    final grs a;

    grv(grs grs1)
    {
        a = grs1;
        super();
    }

    public Object a(guy guy, Object obj)
    {
        Bitmap bitmap = null;
        if (!(obj instanceof Bitmap)) goto _L2; else goto _L1
_L1:
        bitmap = (Bitmap)obj;
_L4:
        if (bitmap == null)
        {
            return obj;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (obj instanceof gup)
        {
            gup gup1 = (gup)obj;
            bitmap = ((gup)obj).a;
            if (gup1.b < bitmap.getWidth() || gup1.c < bitmap.getHeight())
            {
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, gup1.b, gup1.c);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
label0:
        {
            int i = ((grt)guy).a();
            if (bitmap.getWidth() >= i)
            {
                guy = bitmap;
                if (bitmap.getHeight() >= i)
                {
                    break label0;
                }
            }
            guy = grs.a(a).a(i, i);
            obj = hkm.a(bitmap, i, i, guy);
            if (obj != guy)
            {
                grs.a(a).a(guy);
            }
            guy = bitmap;
            if (obj != bitmap)
            {
                grs.a(a).a(bitmap);
                guy = ((guy) (obj));
            }
        }
        return hgn.a(guy);
    }
}
