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

public final class bbt
    implements aqs
{

    private hm a;
    private hm b;
    private hm c;
    private hm d;
    private final dpn e;

    bbt(Context context)
    {
        a = new hm();
        b = new hm();
        c = new hm();
        d = new hm();
        e = (dpn)hlp.a(context, dpn);
    }

    public bbo a(Cursor cursor)
    {
        this;
        JVM INSTR monitorenter ;
        bbo bbo1;
        String s;
        long l;
        s = cursor.getString(cursor.getColumnIndex("_data"));
        bbo1 = (bbo)a.get(s);
        l = cursor.getLong(cursor.getColumnIndex("_id"));
        if (bbo1 != null) goto _L2; else goto _L1
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
        i = bbp.b;
_L6:
        cursor = new bbo(s, i);
        cursor.c = l;
        a.put(s, cursor);
_L8:
        this;
        JVM INSTR monitorexit ;
        return cursor;
_L4:
        i = bbp.a;
          goto _L6
_L2:
        cursor = bbo1;
        if (bbo1.c == l) goto _L8; else goto _L7
_L7:
        bbo1.c = l;
        a.put(s, bbo1);
        cursor = bbo1;
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
            eef eef1 = (eef)b.c(i);
            if (eef1.i() > 0)
            {
                eef1.b();
            }
            break MISSING_BLOCK_LABEL_114;
        }
_L2:
        if (j >= c.size())
        {
            break; /* Loop/switch isn't completed */
        }
        ehk ehk1 = (ehk)c.c(j);
        ehk1.b();
        ehk1.c();
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

    public void a(eef eef1, edf edf1, boolean flag, aqn aqn1, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag3 = false;
        Object obj1;
        bbo bbo1;
        obj1 = (bbv)aqn1.m();
        d.remove(((bbv) (obj1)).b);
        bbo1 = b(((bbv) (obj1)).b);
        aqn1 = ((bbv) (obj1)).b;
        boolean flag2 = flag3;
        if (bbo1 == null) goto _L2; else goto _L1
_L1:
        flag2 = flag3;
        if (((bbv) (obj1)).a == null) goto _L2; else goto _L3
_L3:
        flag2 = flag3;
        if (!((bbv) (obj1)).a.a(bbo1)) goto _L2; else goto _L4
_L4:
        flag3 = true;
        if (edf1 == null) goto _L6; else goto _L5
_L5:
        Object obj;
        obj = new ehk(edf1);
        ((bbv) (obj1)).a.a().setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
        ((ehk) (obj)).a();
        bbo1.b = bbp.c;
        obj1 = (bbo)a.get(aqn1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        obj1.e = ((ehk) (obj)).getIntrinsicHeight();
        obj1.f = ((ehk) (obj)).getIntrinsicWidth();
        a.put(aqn1, obj1);
        c.put(aqn1, obj);
        flag2 = true;
_L2:
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        if (eef1 == null)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        eef1.b();
        if (edf1 == null)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        edf1.b();
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        flag2 = flag3;
        if (eef1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((bbv) (obj1)).a.a().setImageBitmap(eef1.e());
        obj = (bbo)a.get(aqn1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_301;
        }
        obj.e = eef1.e().getHeight();
        obj.f = eef1.e().getWidth();
        a.put(aqn1, obj);
        b.put(aqn1, eef1);
        flag2 = flag3;
        if (true) goto _L2; else goto _L7
_L7:
        eef1;
        throw eef1;
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = (aqn)d.remove(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        e.b(((dor) (obj)));
        obj = (eef)b.remove(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (((eef) (obj)).i() > 0)
        {
            ((eef) (obj)).b();
        }
        s = (ehk)c.remove(s);
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

    public void a(String s, bbu bbu1, int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (bbu1 != null) goto _L2; else goto _L1
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
        aqn aqn1 = (aqn)d.get(s);
        if (aqn1 == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        if (bbu1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        aqn1.b();
        d.remove(s);
        edq edq1 = (new edq(Uri.fromFile(new File(s)).toString(), null)).b(false).a(i << 1).c(false);
        bbv bbv1 = new bbv();
        bbv1.b = s;
        bbv1.a = bbu1;
        bbu1 = new aqn(edq1, this, true, bbv1);
        d.put(s, bbu1);
        e.a(bbu1);
        if (true) goto _L4; else goto _L5
_L5:
        s;
        throw s;
    }

    public void a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        gdv.a("Expected condition to be true", a.isEmpty());
        bbo bbo1;
        for (list = list.iterator(); list.hasNext(); a.put(bbo1.a, bbo1))
        {
            bbo1 = (bbo)list.next();
        }

        break MISSING_BLOCK_LABEL_61;
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
        flag = ((bbo)a.c(j)).d;
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

    public bbo b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = (bbo)a.get(s);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public jsh c()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = new jsj();
        int i = 0;
_L2:
        if (i < a.size())
        {
            bbo bbo1 = (bbo)a.c(i);
            if (bbo1.d)
            {
                ((jsj) (obj)).c(bbo1);
            }
            break MISSING_BLOCK_LABEL_65;
        }
        obj = ((jsj) (obj)).a();
        this;
        JVM INSTR monitorexit ;
        return ((jsh) (obj));
        Exception exception;
        exception;
        throw exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
