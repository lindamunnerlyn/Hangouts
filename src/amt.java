// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

public final class amt extends apw
    implements aqb
{

    private static final boolean f = false;
    private static final double s = 2D / (Math.sqrt(2D) + 2D);
    private static final double t = (1.0D - Math.sin(Math.acos(0.5D))) / 4D;
    private Bitmap g;
    private Canvas h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private List n;
    private final apw o[] = new apw[4];
    private final dpy p = new dpy();
    private Rect q;
    private Rect r;

    private amt(amu amu1, int i1, List list, aqb aqb1, boolean flag, Object obj)
    {
        super(amu1, aqb1, flag, obj);
        i = false;
        j = true;
        k = 0;
        m = i1;
        n = list;
    }

    public static apw a(List list, int i1, List list1, String s1, int j1, String s2, aqb aqb1, Object obj, 
            String s3, boolean flag, amv amv, boolean flag1)
    {
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_302;
        }
        if (f)
        {
            String s4 = String.valueOf(list);
            ebw.b("Babel_medialoader", (new StringBuilder(String.valueOf(s3).length() + 73 + String.valueOf(s4).length())).append("makeImageRequest oldKey=").append(s3).append(" size=").append(j1).append(" urls=").append(s4).append("defaultAvatars=").append(i1).toString());
        }
        if (list.size() + i1 != 0) goto _L2; else goto _L1
_L1:
        list = null;
_L4:
        return list;
_L2:
        if (list.size() == 1 && i1 == 0)
        {
            list = new apw((new eam((String)list.get(0), s1)).a(j1).d(true).b(true).e(flag).a(amv), aqb1, flag1, obj);
            list.b(false);
            return list;
        }
        list = new amu(list, s1, s2, j1);
        list.e(flag).a(amv);
        if (TextUtils.equals(list.s(), s3))
        {
            if (f)
            {
                ebw.b("Babel_medialoader", "makeImageRequest MATCH multiple");
            }
            return null;
        }
        list1 = new amt(list, i1, list1, aqb1, flag1, obj);
        list = list1;
        if (!f) goto _L4; else goto _L3
_L3:
        list = String.valueOf(list1.toString());
        if (list.length() != 0)
        {
            list = "makeImageRequest create new AvatarImageRequest=".concat(list);
        } else
        {
            list = new String("makeImageRequest create new AvatarImageRequest=");
        }
        ebw.b("Babel_medialoader", list);
        return list1;
        ebw.a("Babel_medialoader", "makeImageRequest imageUrls are null and no default avatars used, returning null.");
        return null;
    }

    private void a(Bitmap bitmap, int i1)
    {
        int j1;
        int k1;
        String s1;
        int i2;
        int i3;
        boolean flag;
        if (i1 >= 0 && i1 < k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(flag);
        if (q == null)
        {
            q = new Rect();
        }
        if (r == null)
        {
            r = new Rect();
        }
        bitmap = b(bitmap);
        j1 = ((amu)b).d();
        k1 = j1 / 2;
        i2 = bitmap.getWidth();
        i3 = bitmap.getHeight();
        a(q, i2, i3);
        k;
        JVM INSTR tableswitch 1 4: default 136
    //                   1 250
    //                   2 285
    //                   3 357
    //                   4 460;
           goto _L1 _L2 _L3 _L4 _L5
_L7:
        if (f)
        {
            s1 = toString();
            ebw.b("Babel_medialoader", (new StringBuilder(String.valueOf(s1).length() + 70)).append("AvatarImageRequest  drew onto composite position=").append(i1).append(" compound:").append(s1).toString());
        }
        if (g == null)
        {
            g = ean.a().b(j1, j1);
            h = new Canvas(g);
        }
        h.drawBitmap(bitmap, q, r, null);
        return;
_L2:
        switch (i1)
        {
        case 0: // '\0'
            a(r, j1, j1);
            break;
        }
_L1:
        if (true) goto _L7; else goto _L6
_L6:
_L3:
        k1 = (int)(s * (double)j1);
        int j2 = j1 - k1;
        r.set(0, 0, k1, k1);
        switch (i1)
        {
        case 1: // '\001'
            r.offset(j2, j2);
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
_L4:
        r.set(0, 0, k1, k1);
        int k2 = (int)((double)j1 * t);
        switch (i1)
        {
        case 0: // '\0'
            r.offset(k1 / 2, k2);
            break;

        case 1: // '\001'
            r.offset(0, k1 - k2);
            break;

        case 2: // '\002'
            r.offset(k1, k1 - k2);
            break;
        }
        if (true) goto _L7; else goto _L9
_L9:
_L5:
        Rect rect = r;
        int l1 = j1 / 2;
        int l2 = j1 - l1;
        rect.set(0, 0, l1, l1);
        switch (i1)
        {
        case 0: // '\0'
            rect.offset(0, 0);
            break;

        case 1: // '\001'
            rect.offset(l2, 0);
            break;

        case 2: // '\002'
            rect.offset(0, l2);
            break;

        case 3: // '\003'
            rect.offset(l2, l2);
            break;
        }
        if (true) goto _L7; else goto _L10
_L10:
    }

    private static void a(Rect rect, int i1, int j1)
    {
        if (i1 > j1)
        {
            i1 = (i1 - j1) / 2;
            rect.set(i1, 0, i1 + j1, j1);
            return;
        } else
        {
            j1 = (j1 - i1) / 2;
            rect.set(0, j1, i1, j1 + i1);
            return;
        }
    }

    private void p()
    {
        if (l == 0)
        {
            ebh ebh1 = new ebh(g, c());
            ebh1.a();
            ean.a().a(c(), ebh1);
            ((dmt)hgx.a(g.nS, dmt)).a(this, ebh1);
            g = null;
            h = null;
        }
    }

    public void a(ebh ebh1, eab eab, boolean flag, apw apw1, boolean flag1)
    {
        apw aapw[];
        gbh.a(eab);
        gbh.b();
        if (f)
        {
            eab = apw1.toString();
            String s1 = toString();
            ebw.b("Babel_medialoader", (new StringBuilder(String.valueOf(eab).length() + 92 + String.valueOf(s1).length())).append("AvatarImageRequest setImageBitmap for request ").append(eab).append(" success=").append(flag).append(" loadedFromCache=").append(flag1).append(" compound:").append(s1).toString());
        }
        if (!flag)
        {
            eab = anv.c();
        } else
        {
            eab = ebh1.e();
        }
        aapw = o;
        aapw;
        JVM INSTR monitorenter ;
        if (!i)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (ebh1 == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        ebh1.b();
        aapw;
        JVM INSTR monitorexit ;
        return;
        int i1 = 0;
        while (i1 < k && o[i1] != apw1) 
        {
            i1++;
        }
        if (i1 < k)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        if (ebh1 == null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        ebh1.b();
        ebw.g("Babel", "Received image that was not part of the requested set");
        aapw;
        JVM INSTR monitorexit ;
        return;
        ebh1;
        aapw;
        JVM INSTR monitorexit ;
        throw ebh1;
        a(((Bitmap) (eab)), i1);
        if (ebh1 == null)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        ebh1.b();
        o[i1] = null;
        l = l - 1;
        if (f)
        {
            int j1 = l;
            ebh1 = String.valueOf(apw1);
            eab = toString();
            ebw.b("Babel_medialoader", (new StringBuilder(String.valueOf(ebh1).length() + 70 + String.valueOf(eab).length())).append("AvatarImageRequest pending size=").append(j1).append(" request removed=").append(ebh1).append(" compound:").append(eab).toString());
        }
        p();
        aapw;
        JVM INSTR monitorexit ;
    }

    public void a(boolean flag)
    {
        j = flag;
    }

    public boolean a()
    {
        return false;
    }

    public void b()
    {
        int i1;
        i1 = 0;
        super.b();
        apw aapw[] = o;
        aapw;
        JVM INSTR monitorenter ;
        i = true;
        Exception exception;
        for (; i1 < k; i1++)
        {
            if (o[i1] != null)
            {
                o[i1].b();
                o[i1] = null;
            }
            break MISSING_BLOCK_LABEL_94;
        }

        l = 0;
        if (g != null)
        {
            ean.a().a(g);
            g = null;
            h = null;
        }
        aapw;
        JVM INSTR monitorexit ;
        return;
        exception;
        aapw;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public dms c_()
    {
        Object obj1;
        int j1;
        int k1;
        int l1;
label0:
        {
            j1 = 0;
            if (f)
            {
                String s1 = String.valueOf(toString());
                if (s1.length() != 0)
                {
                    obj = "AvatarImageRequest getBytes for request ".concat(s1);
                } else
                {
                    obj = new String("AvatarImageRequest getBytes for request ");
                }
                ebw.b("Babel_medialoader", ((String) (obj)));
            }
            gbh.b();
            obj1 = (amu)b;
            k1 = ((amu) (obj1)).d();
            l1 = ((amu) (obj1)).a.size();
            synchronized (o)
            {
                if (!i)
                {
                    break label0;
                }
            }
            return null;
        }
        k = Math.min(m + l1, 4);
        int i1 = 0;
_L6:
        if (i1 >= Math.min(l1, 4)) goto _L2; else goto _L1
_L1:
        Object obj2 = (String)((amu) (obj1)).a.get(i1);
        if (!TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            obj2 = new apw((new eam(((String) (obj2)), m())).a(k1).d(true).b(j), this, false, null);
            ((apw) (obj2)).b(d());
            if (f)
            {
                String s2 = ((apw) (obj2)).toString();
                String s3 = toString();
                ebw.b("Babel_medialoader", (new StringBuilder(String.valueOf(s2).length() + 51 + String.valueOf(s3).length())).append("AvatarImageRequest creating ImageRequest ").append(s2).append(" compound:").append(s3).toString());
            }
            o[l] = ((apw) (obj2));
            l = l + 1;
        }
          goto _L3
_L2:
        obj1 = g.nS;
        i1 = j1;
_L7:
        if (i1 < l)
        {
            apw apw1 = o[i1];
            if (!apw1.e())
            {
                ((dmt)hgx.a(((android.content.Context) (obj1)), dmt)).c(apw1);
            }
            break MISSING_BLOCK_LABEL_512;
        }
        Bitmap bitmap;
        Iterator iterator;
        if (l >= k)
        {
            break MISSING_BLOCK_LABEL_487;
        }
        bitmap = ean.a().b(k1, k1);
        i1 = l;
        iterator = n.iterator();
_L4:
        String s4;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_451;
            }
            s4 = (String)iterator.next();
            if (i1 >= k)
            {
                break MISSING_BLOCK_LABEL_451;
            }
        } while (!dpy.a(((android.content.Context) (obj1)), bitmap, s4, k1, dqa.a, g.dt));
        j1 = i1 + 1;
        a(bitmap, i1);
        i1 = j1;
          goto _L4
        ean.a().a(bitmap);
        obj1 = anv.c();
_L5:
        if (i1 >= k)
        {
            break MISSING_BLOCK_LABEL_487;
        }
        a(((Bitmap) (obj1)), i1);
        i1++;
          goto _L5
        p();
        obj;
        JVM INSTR monitorexit ;
        return null;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L3:
        i1++;
          goto _L6
        i1++;
          goto _L7
    }

    static 
    {
        hik hik = ebw.d;
    }
}
