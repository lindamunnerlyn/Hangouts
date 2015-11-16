// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.content.UriMatcher;
import android.net.Uri;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;

public final class adb extends acy
{

    private static final UriMatcher a;
    private static final SparseArray b;
    private static adb c;
    private final SparseArray d = new SparseArray();
    private final hm e = new hm();
    private final HashSet f = new HashSet();

    private adb()
    {
    }

    public static final adb b()
    {
        adb;
        JVM INSTR monitorenter ;
        adb adb1;
        if (c == null)
        {
            c = new adb();
        }
        adb1 = c;
        adb;
        JVM INSTR monitorexit ;
        return adb1;
        Exception exception;
        exception;
        throw exception;
    }

    private void b(Uri uri, adc adc1)
    {
        adc1 = (HashSet)e.get(Long.valueOf(adc1.c()));
        if (adc1 != null)
        {
            adc1.remove(uri);
        }
    }

    private adc c(Uri uri)
    {
        f.remove(uri);
        adc adc1 = (adc)super.b(uri);
        if (adc1 != null)
        {
            b(uri, adc1);
            c(uri, adc1);
            return adc1;
        } else
        {
            return null;
        }
    }

    private void c(Uri uri, adc adc1)
    {
        adc1 = (HashSet)e.get(Long.valueOf(adc1.b()));
        if (adc1 != null)
        {
            adc1.remove(uri);
        }
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        super.a();
        d.clear();
        e.clear();
        f.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(Uri uri, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        f.add(uri);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f.remove(uri);
        if (true) goto _L4; else goto _L3
_L3:
        uri;
        throw uri;
    }

    public boolean a(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = f.contains(uri);
        this;
        JVM INSTR monitorexit ;
        return flag;
        uri;
        throw uri;
    }

    public boolean a(Uri uri, adc adc1)
    {
        this;
        JVM INSTR monitorenter ;
        HashSet hashset;
        int i;
        i = adc1.b();
        hashset = (HashSet)d.get(i);
        if (hashset != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        hashset = new HashSet();
        d.put(i, hashset);
        HashSet hashset1;
        long l;
        l = adc1.c();
        hashset1 = (HashSet)e.get(Long.valueOf(l));
        if (hashset1 != null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        hashset1 = new HashSet();
        e.put(Long.valueOf(l), hashset1);
        a.match(uri);
        JVM INSTR tableswitch 1 9: default 226
    //                   1 194
    //                   2 226
    //                   3 199
    //                   4 226
    //                   5 199
    //                   6 226
    //                   7 199
    //                   8 226
    //                   9 199;
           goto _L1 _L2 _L1 _L3 _L1 _L3 _L1 _L3 _L1 _L3
_L1:
        break MISSING_BLOCK_LABEL_226;
_L4:
        Object obj;
        boolean flag = super.a(obj, adc1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        hashset.add(obj);
        hashset1.add(obj);
        a(uri, false);
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        obj = uri;
          goto _L4
_L3:
        obj = uri.getLastPathSegment();
        obj = Uri.withAppendedPath(android.provider.Telephony.Mms.CONTENT_URI, ((String) (obj)));
          goto _L4
        uri;
        throw uri;
        obj = null;
          goto _L4
    }

    public volatile boolean a(Object obj, Object obj1)
    {
        return a((Uri)obj, (adc)obj1);
    }

    public adc b(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        int i = a.match(uri);
        i;
        JVM INSTR tableswitch 0 11: default 76
    //                   0 111
    //                   1 82
    //                   2 120
    //                   3 91
    //                   4 120
    //                   5 91
    //                   6 120
    //                   7 91
    //                   8 120
    //                   9 91
    //                   10 111
    //                   11 231;
           goto _L1 _L2 _L3 _L4 _L5 _L4 _L5 _L4 _L5 _L4 _L5 _L2 _L6
_L1:
        uri = null;
_L15:
        this;
        JVM INSTR monitorexit ;
        return uri;
_L3:
        uri = c(uri);
        continue; /* Loop/switch isn't completed */
_L5:
        uri = uri.getLastPathSegment();
        uri = c(Uri.withAppendedPath(android.provider.Telephony.Mms.CONTENT_URI, uri));
        continue; /* Loop/switch isn't completed */
_L2:
        a();
        uri = null;
        continue; /* Loop/switch isn't completed */
_L4:
        uri = (Integer)b.get(i);
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        Object obj;
        obj = (HashSet)d.get(uri.intValue());
        d.remove(uri.intValue());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        uri = ((HashSet) (obj)).iterator();
_L8:
        adc adc1;
        do
        {
            if (!uri.hasNext())
            {
                break MISSING_BLOCK_LABEL_226;
            }
            obj = (Uri)uri.next();
            f.remove(obj);
            adc1 = (adc)super.b(obj);
        } while (adc1 == null);
        b(((Uri) (obj)), adc1);
        if (true) goto _L8; else goto _L7
_L7:
        uri;
        throw uri;
        uri = null;
        continue; /* Loop/switch isn't completed */
_L6:
        long l = ContentUris.parseId(uri);
        uri = (HashSet)e.remove(Long.valueOf(l));
        if (uri == null) goto _L10; else goto _L9
_L9:
        uri = uri.iterator();
_L13:
        if (!uri.hasNext()) goto _L10; else goto _L11
_L11:
        obj = (Uri)uri.next();
        f.remove(obj);
        adc1 = (adc)super.b(obj);
        if (adc1 == null) goto _L13; else goto _L12
_L12:
        c(((Uri) (obj)), adc1);
          goto _L13
_L10:
        uri = null;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public volatile Object b(Object obj)
    {
        return b((Uri)obj);
    }

    static 
    {
        Object obj = new UriMatcher(-1);
        a = ((UriMatcher) (obj));
        ((UriMatcher) (obj)).addURI("mms", null, 0);
        a.addURI("mms", "#", 1);
        a.addURI("mms", "inbox", 2);
        a.addURI("mms", "inbox/#", 3);
        a.addURI("mms", "sent", 4);
        a.addURI("mms", "sent/#", 5);
        a.addURI("mms", "drafts", 6);
        a.addURI("mms", "drafts/#", 7);
        a.addURI("mms", "outbox", 8);
        a.addURI("mms", "outbox/#", 9);
        a.addURI("mms-sms", "conversations", 10);
        a.addURI("mms-sms", "conversations/#", 11);
        obj = new SparseArray();
        b = ((SparseArray) (obj));
        ((SparseArray) (obj)).put(2, Integer.valueOf(1));
        b.put(4, Integer.valueOf(2));
        b.put(6, Integer.valueOf(3));
        b.put(8, Integer.valueOf(4));
    }
}
