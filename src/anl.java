// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

public final class anl extends aqn
    implements aqs
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
    private final aqn o[] = new aqn[4];
    private final dsr p = new dsr();
    private Rect q;
    private Rect r;

    private anl(anm anm1, int i1, List list, aqs aqs1, boolean flag, Object obj)
    {
        super(anm1, aqs1, flag, obj);
        i = false;
        j = true;
        k = 0;
        m = i1;
        n = list;
    }

    public static aqn a(List list, int i1, List list1, String s1, int j1, String s2, aqs aqs1, Object obj, 
            String s3, boolean flag, ann ann, boolean flag1)
    {
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_302;
        }
        if (f)
        {
            String s4 = String.valueOf(list);
            eev.b("Babel_medialoader", (new StringBuilder(String.valueOf(s3).length() + 73 + String.valueOf(s4).length())).append("makeImageRequest oldKey=").append(s3).append(" size=").append(j1).append(" urls=").append(s4).append("defaultAvatars=").append(i1).toString());
        }
        if (list.size() + i1 != 0) goto _L2; else goto _L1
_L1:
        list = null;
_L4:
        return list;
_L2:
        if (list.size() == 1 && i1 == 0)
        {
            list = new aqn((new edq((String)list.get(0), s1)).a(j1).d(true).b(true).e(flag).a(ann), aqs1, flag1, obj);
            list.b(false);
            return list;
        }
        list = new anm(list, s1, s2, j1);
        list.e(flag).a(ann);
        if (TextUtils.equals(list.s(), s3))
        {
            if (f)
            {
                eev.b("Babel_medialoader", "makeImageRequest MATCH multiple");
            }
            return null;
        }
        list1 = new anl(list, i1, list1, aqs1, flag1, obj);
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
        eev.b("Babel_medialoader", list);
        return list1;
        eev.a("Babel_medialoader", "makeImageRequest imageUrls are null and no default avatars used, returning null.");
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
        gdv.a("Expected condition to be true", flag);
        if (q == null)
        {
            q = new Rect();
        }
        if (r == null)
        {
            r = new Rect();
        }
        bitmap = b(bitmap);
        j1 = ((anm)b).d();
        k1 = j1 / 2;
        i2 = bitmap.getWidth();
        i3 = bitmap.getHeight();
        a(q, i2, i3);
        k;
        JVM INSTR tableswitch 1 4: default 140
    //                   1 257
    //                   2 293
    //                   3 365
    //                   4 468;
           goto _L1 _L2 _L3 _L4 _L5
_L7:
        if (f)
        {
            s1 = String.valueOf(toString());
            eev.b("Babel_medialoader", (new StringBuilder(String.valueOf(s1).length() + 70)).append("AvatarImageRequest  drew onto composite position=").append(i1).append(" compound:").append(s1).toString());
        }
        if (g == null)
        {
            g = edr.a().b(j1, j1);
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

    private void q()
    {
        if (l == 0)
        {
            eef eef1 = new eef(g, c());
            eef1.a();
            edr.a().a(c(), eef1);
            ((dpn)hlp.a(g.nU, dpn)).a(this, eef1);
            g = null;
            h = null;
        }
    }

    public void a(eef eef1, edf edf, boolean flag, aqn aqn1, boolean flag1)
    {
        aqn aaqn[];
        gdv.a("Expected null", edf);
        gdv.b();
        if (f)
        {
            edf = String.valueOf(aqn1.toString());
            String s1 = String.valueOf(toString());
            eev.b("Babel_medialoader", (new StringBuilder(String.valueOf(edf).length() + 92 + String.valueOf(s1).length())).append("AvatarImageRequest setImageBitmap for request ").append(edf).append(" success=").append(flag).append(" loadedFromCache=").append(flag1).append(" compound:").append(s1).toString());
        }
        if (!flag)
        {
            edf = aon.c();
        } else
        {
            edf = eef1.e();
        }
        aaqn = o;
        aaqn;
        JVM INSTR monitorenter ;
        if (!i)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        if (eef1 == null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        eef1.b();
        aaqn;
        JVM INSTR monitorexit ;
        return;
        int i1 = 0;
        while (i1 < k && o[i1] != aqn1) 
        {
            i1++;
        }
        if (i1 < k)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        if (eef1 == null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        eef1.b();
        eev.g("Babel", "Received image that was not part of the requested set");
        aaqn;
        JVM INSTR monitorexit ;
        return;
        eef1;
        aaqn;
        JVM INSTR monitorexit ;
        throw eef1;
        a(((Bitmap) (edf)), i1);
        if (eef1 == null)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        eef1.b();
        o[i1] = null;
        l = l - 1;
        if (f)
        {
            int j1 = l;
            eef1 = String.valueOf(aqn1);
            edf = String.valueOf(toString());
            eev.b("Babel_medialoader", (new StringBuilder(String.valueOf(eef1).length() + 70 + String.valueOf(edf).length())).append("AvatarImageRequest pending size=").append(j1).append(" request removed=").append(eef1).append(" compound:").append(edf).toString());
        }
        q();
        aaqn;
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
        aqn aaqn[] = o;
        aaqn;
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
            edr.a().a(g);
            g = null;
            h = null;
        }
        aaqn;
        JVM INSTR monitorexit ;
        return;
        exception;
        aaqn;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public dpm d_()
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
                eev.b("Babel_medialoader", ((String) (obj)));
            }
            gdv.b();
            obj1 = (anm)b;
            k1 = ((anm) (obj1)).d();
            l1 = ((anm) (obj1)).a.size();
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
        Object obj2 = (String)((anm) (obj1)).a.get(i1);
        if (!TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            obj2 = new aqn((new edq(((String) (obj2)), n())).a(k1).d(true).b(j), this, false, null);
            ((aqn) (obj2)).b(d());
            if (f)
            {
                String s2 = String.valueOf(((aqn) (obj2)).toString());
                String s3 = String.valueOf(toString());
                eev.b("Babel_medialoader", (new StringBuilder(String.valueOf(s2).length() + 51 + String.valueOf(s3).length())).append("AvatarImageRequest creating ImageRequest ").append(s2).append(" compound:").append(s3).toString());
            }
            o[l] = ((aqn) (obj2));
            l = l + 1;
        }
          goto _L3
_L2:
        obj1 = g.nU;
        i1 = j1;
_L7:
        if (i1 < l)
        {
            aqn aqn1 = o[i1];
            if (!aqn1.e())
            {
                ((dpn)hlp.a(((android.content.Context) (obj1)), dpn)).c(aqn1);
            }
            break MISSING_BLOCK_LABEL_518;
        }
        Bitmap bitmap;
        Iterator iterator;
        if (l >= k)
        {
            break MISSING_BLOCK_LABEL_493;
        }
        bitmap = edr.a().b(k1, k1);
        i1 = l;
        iterator = n.iterator();
_L4:
        String s4;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_457;
            }
            s4 = (String)iterator.next();
            if (i1 >= k)
            {
                break MISSING_BLOCK_LABEL_457;
            }
        } while (!dsr.a(((android.content.Context) (obj1)), bitmap, s4, k1, dst.a, g.ds));
        j1 = i1 + 1;
        a(bitmap, i1);
        i1 = j1;
          goto _L4
        edr.a().a(bitmap);
        obj1 = aon.c();
_L5:
        if (i1 >= k)
        {
            break MISSING_BLOCK_LABEL_493;
        }
        a(((Bitmap) (obj1)), i1);
        i1++;
          goto _L5
        q();
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
        hnc hnc = eev.d;
    }
}
