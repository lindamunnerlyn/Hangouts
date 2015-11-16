// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public final class bbd
    implements aqb
{

    private hm a;
    private hm b;
    private hm c;
    private hm d;
    private final dmt e;

    bbd(Context context)
    {
        a = new hm();
        b = new hm();
        c = new hm();
        d = new hm();
        e = (dmt)hgx.a(context, dmt);
    }

    public bay a(Cursor cursor)
    {
        this;
        JVM INSTR monitorenter ;
        bay bay1;
        String s;
        long l;
        s = cursor.getString(cursor.getColumnIndex("_data"));
        bay1 = (bay)a.get(s);
        l = cursor.getLong(cursor.getColumnIndex("_id"));
        if (bay1 != null) goto _L2; else goto _L1
_L1:
        int i = cursor.getInt(cursor.getColumnIndex("media_type"));
        i;
        JVM INSTR tableswitch 1 3: default 204
    //                   1 163
    //                   2 92
    //                   3 127;
           goto _L3 _L4 _L3 _L5
_L3:
        throw new IllegalStateException((new StringBuilder(32)).append("Unexpected mediaType ").append(i).toString());
        cursor;
        this;
        JVM INSTR monitorexit ;
        throw cursor;
_L5:
        i = baz.b;
_L6:
        cursor = new bay(s, i);
        cursor.c = l;
        a.put(s, cursor);
_L8:
        this;
        JVM INSTR monitorexit ;
        return cursor;
_L4:
        i = baz.a;
          goto _L6
_L2:
        cursor = bay1;
        if (bay1.c == l) goto _L8; else goto _L7
_L7:
        bay1.c = l;
        a.put(s, bay1);
        cursor = bay1;
          goto _L8
    }

    public void a()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        int i = 0;
_L4:
        int j = ((flag) ? 1 : 0);
        if (i < b.size())
        {
            ebh ebh1 = (ebh)b.c(i);
            if (ebh1.i() > 0)
            {
                ebh1.b();
            }
            break MISSING_BLOCK_LABEL_114;
        }
_L2:
        if (j >= c.size())
        {
            break; /* Loop/switch isn't completed */
        }
        eei eei1 = (eei)c.c(j);
        eei1.b();
        eei1.c();
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        b.clear();
        c.clear();
        a.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
        i++;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(ebh ebh1, eab eab1, boolean flag, apw apw1, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag3 = false;
        Object obj1;
        bay bay1;
        obj1 = (bbf)apw1.l();
        d.remove(((bbf) (obj1)).b);
        bay1 = b(((bbf) (obj1)).b);
        apw1 = ((bbf) (obj1)).b;
        boolean flag2 = flag3;
        if (bay1 == null) goto _L2; else goto _L1
_L1:
        flag2 = flag3;
        if (((bbf) (obj1)).a == null) goto _L2; else goto _L3
_L3:
        flag2 = flag3;
        if (!((bbf) (obj1)).a.a(bay1)) goto _L2; else goto _L4
_L4:
        flag3 = true;
        if (eab1 == null) goto _L6; else goto _L5
_L5:
        Object obj;
        obj = new eei(eab1);
        ((bbf) (obj1)).a.a().setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
        ((eei) (obj)).a();
        bay1.b = baz.c;
        obj1 = (bay)a.get(apw1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        obj1.e = ((eei) (obj)).getIntrinsicHeight();
        obj1.f = ((eei) (obj)).getIntrinsicWidth();
        a.put(apw1, obj1);
        c.put(apw1, obj);
        flag2 = true;
_L2:
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        if (ebh1 == null)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        ebh1.b();
        if (eab1 == null)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        eab1.b();
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        flag2 = flag3;
        if (ebh1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((bbf) (obj1)).a.a().setImageBitmap(ebh1.e());
        obj = (bay)a.get(apw1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_301;
        }
        obj.e = ebh1.e().getHeight();
        obj.f = ebh1.e().getWidth();
        a.put(apw1, obj);
        b.put(apw1, ebh1);
        flag2 = flag3;
        if (true) goto _L2; else goto _L7
_L7:
        ebh1;
        throw ebh1;
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = (apw)d.remove(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        e.b(((dlt) (obj)));
        obj = (ebh)b.remove(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (((ebh) (obj)).i() > 0)
        {
            ((ebh) (obj)).b();
        }
        s = (eei)c.remove(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        s.b();
        s.c();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void a(String s, bbe bbe1, int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (bbe1 != null) goto _L2; else goto _L1
_L1:
        if (b.containsKey(s)) goto _L4; else goto _L3
_L3:
        boolean flag = c.containsKey(s);
        if (!flag) goto _L2; else goto _L4
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        apw apw1 = (apw)d.get(s);
        if (apw1 == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        if (bbe1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        apw1.b();
        d.remove(s);
        eam eam1 = (new eam(Uri.fromFile(new File(s)).toString(), null)).b(false).a(i << 1).c(false);
        bbf bbf1 = new bbf();
        bbf1.b = s;
        bbf1.a = bbe1;
        bbe1 = new apw(eam1, this, true, bbf1);
        d.put(s, bbe1);
        e.a(bbe1);
        if (true) goto _L4; else goto _L5
_L5:
        s;
        throw s;
    }

    public void a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        gbh.a(a.isEmpty());
        bay bay1;
        for (list = list.iterator(); list.hasNext(); a.put(bay1.a, bay1))
        {
            bay1 = (bay)list.next();
        }

        break MISSING_BLOCK_LABEL_59;
        list;
        throw list;
        this;
        JVM INSTR monitorexit ;
    }

    public int b()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        int j;
        j = 0;
        i = 0;
_L2:
        boolean flag;
        if (j >= a.size())
        {
            break; /* Loop/switch isn't completed */
        }
        flag = ((bay)a.c(j)).d;
        if (flag)
        {
            i++;
        }
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public bay b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = (bay)a.get(s);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public jlk c()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = new jlm();
        int i = 0;
_L2:
        if (i < a.size())
        {
            bay bay1 = (bay)a.c(i);
            if (bay1.d)
            {
                ((jlm) (obj)).c(bay1);
            }
            break MISSING_BLOCK_LABEL_65;
        }
        obj = ((jlm) (obj)).a();
        this;
        JVM INSTR monitorexit ;
        return ((jlk) (obj));
        Exception exception;
        exception;
        throw exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
