// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

final class gwg
    implements gzh
{

    final gwd a;

    gwg(gwd gwd1)
    {
        a = gwd1;
        super();
    }

    public Object a(gzi gzi, Object obj)
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
        if (obj instanceof gyz)
        {
            gyz gyz1 = (gyz)obj;
            bitmap = ((gyz)obj).a;
            if (gyz1.b < bitmap.getWidth() || gyz1.c < bitmap.getHeight())
            {
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, gyz1.b, gyz1.c);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
label0:
        {
            int i = ((gwe)gzi).a();
            if (bitmap.getWidth() >= i)
            {
                gzi = bitmap;
                if (bitmap.getHeight() >= i)
                {
                    break label0;
                }
            }
            gzi = a.b.a(i, i);
            obj = hph.a(bitmap, i, i, gzi);
            if (obj != gzi)
            {
                a.b.a(gzi);
            }
            gzi = bitmap;
            if (obj != bitmap)
            {
                a.b.a(bitmap);
                gzi = ((gzi) (obj));
            }
        }
        return hlf.a(gzi);
    }
}
