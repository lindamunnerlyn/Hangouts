// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Map;

public final class acs
{

    public static final String a[] = {
        "_id", "msg_box", "thread_id", "retr_txt", "sub", "ct_l", "ct_t", "m_cls", "m_id", "resp_txt", 
        "tr_id", "ct_cls", "d_rpt", "m_type", "v", "pri", "rr", "read_status", "rpt_a", "retr_st", 
        "st", "date", "d_tm", "exp", "m_size", "sub_cs", "retr_txt_cs", "read", "seen"
    };
    private static acs b;
    private static final add c = add.b();
    private static final int d[] = {
        129, 130, 137, 151
    };
    private static final String e[] = {
        "_id", "chset", "cd", "cid", "cl", "ct", "fn", "name", "text"
    };
    private static final hm f;
    private static final SparseIntArray g;
    private static final SparseIntArray h;
    private static final SparseIntArray i;
    private static final SparseIntArray j;
    private static final SparseIntArray k;
    private static final SparseArray l;
    private static final SparseArray m;
    private static final SparseArray n;
    private static final SparseArray o;
    private static final SparseArray p;
    private final Context q;
    private final ContentResolver r;
    private final TelephonyManager s;

    private acs(Context context)
    {
        q = context;
        r = context.getContentResolver();
        s = (TelephonyManager)context.getSystemService("phone");
    }

    private acj a(long l1, int i1)
    {
        acj acj1 = new acj();
        if (i1 == 132 || i1 == 128)
        {
            acr aacr[] = a(l1);
            if (aacr != null)
            {
                int j1 = aacr.length;
                for (i1 = 0; i1 < j1; i1++)
                {
                    acj1.a(aacr[i1]);
                }

            }
        }
        return acj1;
    }

    public static acs a(Context context)
    {
        if (b == null || !context.equals(b.q))
        {
            b = new acs(context);
        }
        return b;
    }

    private Uri a(acr acr1, long l1, Map map)
    {
        Uri uri = Uri.parse((new StringBuilder(39)).append("content://mms/").append(l1).append("/part").toString());
        ContentValues contentvalues = new ContentValues(8);
        int i1 = acr1.d();
        if (i1 != 0)
        {
            contentvalues.put("chset", Integer.valueOf(i1));
        }
        String s1 = a(acr1);
        if (s1 != null)
        {
            Object obj = s1;
            if ("image/jpg".equals(s1))
            {
                obj = "image/jpeg";
            }
            s1 = ((String) (obj));
            if ("text/plain".equals(obj))
            {
                s1 = ((String) (obj));
                if ((new ace(i1, acr1.a())).c().startsWith("BEGIN:VCARD"))
                {
                    s1 = "text/x-vCard";
                    acr1.e("text/x-vCard".getBytes());
                }
            }
            contentvalues.put("ct", s1);
            if ("application/smil".equals(s1))
            {
                contentvalues.put("seq", Integer.valueOf(-1));
            }
            byte abyte0[] = acr1.j();
            if (abyte0 != null)
            {
                contentvalues.put("fn", new String(abyte0));
            }
            abyte0 = acr1.i();
            if (abyte0 != null)
            {
                contentvalues.put("name", new String(abyte0));
            }
            abyte0 = acr1.f();
            if (abyte0 != null)
            {
                contentvalues.put("cd", a(abyte0));
            }
            abyte0 = acr1.c();
            if (abyte0 != null)
            {
                contentvalues.put("cid", a(abyte0));
            }
            abyte0 = acr1.e();
            if (abyte0 != null)
            {
                contentvalues.put("cl", a(abyte0));
            }
            abyte0 = g.b(r, uri, contentvalues);
            if (abyte0 == null)
            {
                throw new abz("Failed to persist part, return null.");
            } else
            {
                a(acr1, ((Uri) (abyte0)), s1, map);
                acr1.a(abyte0);
                return abyte0;
            }
        } else
        {
            throw new abz("MIME type of the part must be set.");
        }
    }

    private static String a(acr acr1)
    {
        if (acr1.g() == null)
        {
            return null;
        } else
        {
            return a(acr1.g());
        }
    }

    private static String a(Context context, Uri uri)
    {
        Context context1;
        Context context2;
        String s1;
        context2 = null;
        context1 = null;
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        s1 = uri.getScheme();
        if (s1 != null && !s1.equals("") && !s1.equals("file")) goto _L2; else goto _L1
_L1:
        uri = uri.getPath();
_L4:
        return uri;
_L2:
        if (s1.equals("http"))
        {
            return uri.toString();
        }
        if (!s1.equals("content"))
        {
            break; /* Loop/switch isn't completed */
        }
        context = context.getContentResolver().query(uri, new String[] {
            "_data"
        }, null, null, null);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        context1 = context;
        context2 = context;
        if (context.getCount() == 0)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        context1 = context;
        context2 = context;
        if (context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_169;
        }
        context1 = context;
        context2 = context;
        try
        {
            throw new IllegalArgumentException("Given Uri could not be found in media store");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context2 = context1;
        }
        finally
        {
            if (context2 == null) goto _L0; else goto _L0
        }
        throw new IllegalArgumentException("Given Uri is not formatted in a way so that it can be found in media store.");
        context2.close();
        throw context;
        context1 = context;
        context2 = context;
        uri = context.getString(context.getColumnIndexOrThrow("_data"));
        Uri uri1 = uri;
        uri = uri1;
        if (context != null)
        {
            context.close();
            return uri1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        throw new IllegalArgumentException("Given Uri scheme is not supported");
        return null;
    }

    public static String a(byte abyte0[])
    {
        try
        {
            abyte0 = new String(abyte0, "iso-8859-1");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.e("PduPersister", "ISO_8859_1 must be supported!", abyte0);
            return "";
        }
        return abyte0;
    }

    private void a(int i1, HashSet hashset, SparseArray sparsearray, boolean flag)
    {
        ace aace[];
        aace = (ace[])sparsearray.get(i1);
        break MISSING_BLOCK_LABEL_10;
        if (aace != null && (!flag || aace.length != 1))
        {
            int j1;
            if (flag)
            {
                sparsearray = s.getLine1Number();
            } else
            {
                sparsearray = null;
            }
            j1 = aace.length;
            i1 = 0;
            while (i1 < j1) 
            {
                Object obj = aace[i1];
                if (obj != null)
                {
                    obj = ((ace) (obj)).c();
                    if ((sparsearray == null || !PhoneNumberUtils.compare(((String) (obj)), sparsearray)) && !hashset.contains(obj))
                    {
                        hashset.add(obj);
                    }
                }
                i1++;
            }
        }
        return;
    }

    private void a(long l1, int i1, ace aace[])
    {
        ContentValues contentvalues = new ContentValues(3);
        int k1 = aace.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            Object obj = aace[j1];
            contentvalues.clear();
            contentvalues.put("address", a(((ace) (obj)).b()));
            contentvalues.put("charset", Integer.valueOf(((ace) (obj)).a()));
            contentvalues.put("type", Integer.valueOf(i1));
            obj = Uri.parse((new StringBuilder(39)).append("content://mms/").append(l1).append("/addr").toString());
            g.b(r, ((Uri) (obj)), contentvalues);
        }

    }

    private void a(long l1, acp acp1)
    {
        Cursor cursor;
        cursor = g.a(r, Uri.parse((new StringBuilder(39)).append("content://mms/").append(l1).append("/addr").toString()), new String[] {
            "address", "charset", "type"
        }, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_260;
        }
_L5:
        String s1;
        int i1;
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = cursor.getString(0);
        if (TextUtils.isEmpty(s1))
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = cursor.getInt(2);
        i1;
        JVM INSTR lookupswitch 4: default 261
    //                   129: 224
    //                   130: 224
    //                   137: 195
    //                   151: 224;
           goto _L1 _L2 _L2 _L3 _L2
        while (true) 
        {
            while (true) 
            {
                if (false)
                {
                }
                break; /* Loop/switch isn't completed */
            }
        }
_L1:
        Log.e("PduPersister", (new StringBuilder(33)).append("Unknown address type: ").append(i1).toString());
        break; /* Loop/switch isn't completed */
        acp1;
        cursor.close();
        throw acp1;
_L3:
        acp1.a(new ace(cursor.getInt(1), a(s1)), i1);
        break; /* Loop/switch isn't completed */
_L2:
        acp1.b(new ace(cursor.getInt(1), a(s1)), i1);
        if (true) goto _L5; else goto _L4
_L4:
        cursor.close();
    }

    private void a(acr acr1, Uri uri, String s1, Map map)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj6;
        Object obj8;
        Object obj9;
        String s2;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        adc adc1;
        String s3;
        String s4;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        Object obj21;
        Object obj22;
        Object obj23;
        Object obj24;
        Object obj25;
        Object obj26;
        Object obj27;
        Object obj28;
        obj23 = null;
        s2 = null;
        obj17 = null;
        obj4 = null;
        obj16 = null;
        obj21 = null;
        obj9 = null;
        obj15 = null;
        obj22 = null;
        obj19 = null;
        obj14 = null;
        obj25 = null;
        obj20 = null;
        obj18 = null;
        obj8 = null;
        obj6 = null;
        adc1 = null;
        obj26 = null;
        obj = null;
        obj1 = null;
        obj28 = null;
        obj27 = null;
        obj24 = null;
        obj2 = obj24;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj3 = obj26;
        obj12 = obj18;
        obj13 = obj15;
        s4 = obj17;
        byte abyte0[] = acr1.a();
        obj2 = obj24;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj3 = obj26;
        obj12 = obj18;
        obj13 = obj15;
        s4 = obj17;
        int i1 = acr1.d();
        obj2 = obj24;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj3 = obj26;
        obj12 = obj18;
        obj13 = obj15;
        s4 = obj17;
        if ("text/plain".equals(s1)) goto _L2; else goto _L1
_L1:
        obj2 = obj24;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj3 = obj26;
        obj12 = obj18;
        obj13 = obj15;
        s4 = obj17;
        if ("application/smil".equals(s1)) goto _L2; else goto _L3
_L3:
        obj2 = obj24;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj3 = obj26;
        obj12 = obj18;
        obj13 = obj15;
        s4 = obj17;
        if (!"text/html".equals(s1)) goto _L4; else goto _L2
_L2:
        map = obj27;
        obj = obj6;
        obj1 = obj19;
        obj8 = obj4;
        if (abyte0 == null) goto _L6; else goto _L5
_L5:
        obj2 = obj24;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj3 = obj26;
        obj12 = obj18;
        obj13 = obj15;
        s4 = obj17;
        acr1 = new ContentValues();
        obj2 = obj24;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj3 = obj26;
        obj12 = obj18;
        obj13 = obj15;
        s4 = obj17;
        acr1.put("text", (new ace(i1, abyte0)).c());
        obj2 = obj24;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj3 = obj26;
        obj12 = obj18;
        obj13 = obj15;
        s4 = obj17;
        map = obj27;
        obj = obj6;
        obj1 = obj19;
        obj8 = obj4;
        if (r.update(uri, acr1, null, null) == 1) goto _L6; else goto _L7
_L7:
        obj2 = obj24;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj3 = obj26;
        obj12 = obj18;
        obj13 = obj15;
        s4 = obj17;
        acr1 = String.valueOf(uri.toString());
        obj2 = obj24;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj3 = obj26;
        obj12 = obj18;
        obj13 = obj15;
        s4 = obj17;
        if (acr1.length() == 0) goto _L9; else goto _L8
_L8:
        obj2 = obj24;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj3 = obj26;
        obj12 = obj18;
        obj13 = obj15;
        s4 = obj17;
        acr1 = "unable to update ".concat(acr1);
_L10:
        obj2 = obj24;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj3 = obj26;
        obj12 = obj18;
        obj13 = obj15;
        s4 = obj17;
        throw new abz(acr1);
        acr1;
        obj = obj2;
        obj8 = obj10;
        obj9 = obj11;
        s2 = s3;
        Log.e("PduPersister", "Failed to open Input/Output stream.", acr1);
        obj = obj2;
        obj8 = obj10;
        obj9 = obj11;
        s2 = s3;
        throw new abz(acr1);
        acr1;
        uri = ((Uri) (obj));
_L25:
        if (s2 != null)
        {
            try
            {
                s2.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                map = String.valueOf(s2);
                Log.e("PduPersister", (new StringBuilder(String.valueOf(map).length() + 27)).append("IOException while closing: ").append(map).toString(), s1);
            }
        }
        if (obj9 != null)
        {
            try
            {
                ((InputStream) (obj9)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                map = String.valueOf(obj9);
                Log.e("PduPersister", (new StringBuilder(String.valueOf(map).length() + 27)).append("IOException while closing: ").append(map).toString(), s1);
            }
        }
        if (obj8 != null)
        {
            ((adc) (obj8)).a(uri);
            uri = new File(uri);
            s1 = new ContentValues(0);
            map = r;
            uri = String.valueOf(uri.getName());
            Object obj5;
            Object obj7;
            int j1;
            long l1;
            boolean flag;
            if (uri.length() != 0)
            {
                uri = "content://mms/resetFilePerm/".concat(uri);
            } else
            {
                uri = new String("content://mms/resetFilePerm/");
            }
            g.a(map, Uri.parse(uri), s1);
        }
        throw acr1;
_L9:
        obj2 = obj24;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj3 = obj26;
        obj12 = obj18;
        obj13 = obj15;
        s4 = obj17;
        acr1 = new String("unable to update ");
          goto _L10
        acr1;
        obj = obj3;
        obj8 = obj12;
        obj9 = obj13;
        s2 = s4;
        Log.e("PduPersister", "Failed to read/write data.", acr1);
        obj = obj3;
        obj8 = obj12;
        obj9 = obj13;
        s2 = s4;
        throw new abz(acr1);
_L4:
        obj2 = obj24;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj3 = obj26;
        obj12 = obj18;
        obj13 = obj15;
        s4 = obj17;
        flag = "application/vnd.oma.drm.message".equals(s1);
        obj5 = obj28;
        obj7 = obj8;
        if (!flag) goto _L12; else goto _L11
_L11:
        if (uri == null) goto _L14; else goto _L13
_L13:
        obj2 = obj24;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj3 = obj26;
        obj12 = obj18;
        obj13 = obj15;
        s4 = obj17;
        obj1 = obj;
        obj5 = a(q, uri);
        obj2 = obj5;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj = obj5;
        obj8 = obj25;
        obj9 = obj21;
        s2 = obj23;
        obj3 = obj5;
        obj12 = obj18;
        obj13 = obj15;
        s4 = obj17;
        obj1 = obj5;
        l1 = (new File(((String) (obj5)))).length();
        obj1 = obj5;
        if (l1 <= 0L) goto _L14; else goto _L15
_L15:
        return;
        obj5;
        obj2 = obj1;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj = obj1;
        obj8 = obj25;
        obj9 = obj21;
        s2 = obj23;
        obj3 = obj1;
        obj12 = obj18;
        obj13 = obj15;
        s4 = obj17;
        obj7 = String.valueOf(acr1.b());
        obj2 = obj1;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj = obj1;
        obj8 = obj25;
        obj9 = obj21;
        s2 = obj23;
        obj3 = obj1;
        obj12 = obj18;
        obj13 = obj15;
        s4 = obj17;
        Log.e("PduPersister", (new StringBuilder(String.valueOf(obj7).length() + 25)).append("Can't get file info for: ").append(((String) (obj7))).toString(), ((Throwable) (obj5)));
_L14:
        obj2 = obj1;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj = obj1;
        obj8 = obj25;
        obj9 = obj21;
        s2 = obj23;
        obj3 = obj1;
        obj12 = obj18;
        obj13 = obj15;
        s4 = obj17;
        adc1 = adc.a(q, s1);
        obj5 = obj1;
        obj7 = adc1;
        if (adc1 != null) goto _L12; else goto _L16
_L16:
        obj2 = obj1;
        obj10 = adc1;
        obj11 = obj14;
        s3 = obj16;
        obj = obj1;
        obj8 = adc1;
        obj9 = obj21;
        s2 = obj23;
        obj3 = obj1;
        obj12 = adc1;
        obj13 = obj15;
        s4 = obj17;
        throw new abz((new StringBuilder(String.valueOf(s1).length() + 31)).append("Mimetype ").append(s1).append(" can not be converted.").toString());
_L12:
        obj2 = obj5;
        obj10 = obj7;
        obj11 = obj14;
        s3 = obj16;
        obj = obj5;
        obj8 = obj7;
        obj9 = obj21;
        s2 = obj23;
        obj3 = obj5;
        obj12 = obj7;
        obj13 = obj15;
        s4 = obj17;
        s1 = r.openOutputStream(uri);
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_1542;
        }
        obj2 = obj5;
        obj10 = obj7;
        obj11 = obj14;
        s3 = s1;
        obj = obj5;
        obj8 = obj7;
        obj9 = obj21;
        s2 = s1;
        obj3 = obj5;
        obj12 = obj7;
        obj13 = obj15;
        s4 = s1;
        acr1 = String.valueOf(uri);
        obj2 = obj5;
        obj10 = obj7;
        obj11 = obj14;
        s3 = s1;
        obj = obj5;
        obj8 = obj7;
        obj9 = obj21;
        s2 = s1;
        obj3 = obj5;
        obj12 = obj7;
        obj13 = obj15;
        s4 = s1;
        throw new abz((new StringBuilder(String.valueOf(acr1).length() + 34)).append("Failed to create output stream on ").append(acr1).toString());
        if (abyte0 != null) goto _L18; else goto _L17
_L17:
        obj2 = obj5;
        obj10 = obj7;
        obj11 = obj14;
        s3 = s1;
        obj = obj5;
        obj8 = obj7;
        obj9 = obj21;
        s2 = s1;
        obj3 = obj5;
        obj12 = obj7;
        obj13 = obj15;
        s4 = s1;
        obj1 = acr1.b();
        if (obj1 != null && obj1 != uri) goto _L20; else goto _L19
_L19:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (acr acr1)
            {
                uri = String.valueOf(s1);
                Log.e("PduPersister", (new StringBuilder(String.valueOf(uri).length() + 27)).append("IOException while closing: ").append(uri).toString(), acr1);
            }
        }
        if (obj7 != null)
        {
            ((adc) (obj7)).a(((String) (obj5)));
            acr1 = new File(((String) (obj5)));
            uri = new ContentValues(0);
            s1 = r;
            acr1 = String.valueOf(acr1.getName());
            if (acr1.length() != 0)
            {
                acr1 = "content://mms/resetFilePerm/".concat(acr1);
            } else
            {
                acr1 = new String("content://mms/resetFilePerm/");
            }
            g.a(s1, Uri.parse(acr1), uri);
            return;
        }
          goto _L21
_L20:
        uri = obj22;
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_1875;
        }
        obj2 = obj5;
        obj10 = obj7;
        obj11 = obj14;
        s3 = s1;
        obj = obj5;
        obj8 = obj7;
        obj9 = obj21;
        s2 = s1;
        obj3 = obj5;
        obj12 = obj7;
        obj13 = obj15;
        s4 = s1;
        uri = obj22;
        if (!map.containsKey(obj1))
        {
            break MISSING_BLOCK_LABEL_1875;
        }
        obj2 = obj5;
        obj10 = obj7;
        obj11 = obj14;
        s3 = s1;
        obj = obj5;
        obj8 = obj7;
        obj9 = obj21;
        s2 = s1;
        obj3 = obj5;
        obj12 = obj7;
        obj13 = obj15;
        s4 = s1;
        uri = (InputStream)map.get(obj1);
        acr1 = uri;
        if (uri != null)
        {
            break MISSING_BLOCK_LABEL_1933;
        }
        obj2 = obj5;
        obj10 = obj7;
        obj11 = uri;
        s3 = s1;
        obj = obj5;
        obj8 = obj7;
        obj9 = uri;
        s2 = s1;
        obj3 = obj5;
        obj12 = obj7;
        obj13 = uri;
        s4 = s1;
        acr1 = r.openInputStream(((Uri) (obj1)));
        if (acr1 != null)
        {
            break MISSING_BLOCK_LABEL_2065;
        }
        obj2 = obj5;
        obj10 = obj7;
        obj11 = acr1;
        s3 = s1;
        obj = obj5;
        obj8 = obj7;
        obj9 = acr1;
        s2 = s1;
        obj3 = obj5;
        obj12 = obj7;
        obj13 = acr1;
        s4 = s1;
        uri = String.valueOf(obj1);
        obj2 = obj5;
        obj10 = obj7;
        obj11 = acr1;
        s3 = s1;
        obj = obj5;
        obj8 = obj7;
        obj9 = acr1;
        s2 = s1;
        obj3 = obj5;
        obj12 = obj7;
        obj13 = acr1;
        s4 = s1;
        throw new abz((new StringBuilder(String.valueOf(uri).length() + 33)).append("Failed to create input stream on ").append(uri).toString());
        obj2 = obj5;
        obj10 = obj7;
        obj11 = acr1;
        s3 = s1;
        obj = obj5;
        obj8 = obj7;
        obj9 = acr1;
        s2 = s1;
        obj3 = obj5;
        obj12 = obj7;
        obj13 = acr1;
        s4 = s1;
        uri = new byte[8192];
_L22:
        obj2 = obj5;
        obj10 = obj7;
        obj11 = acr1;
        s3 = s1;
        obj = obj5;
        obj8 = obj7;
        obj9 = acr1;
        s2 = s1;
        obj3 = obj5;
        obj12 = obj7;
        obj13 = acr1;
        s4 = s1;
        j1 = acr1.read(uri);
        map = ((Map) (obj5));
        obj = obj7;
        obj1 = acr1;
        obj8 = s1;
        if (j1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_2240;
        }
        obj2 = obj5;
        obj10 = obj7;
        obj11 = acr1;
        s3 = s1;
        obj = obj5;
        obj8 = obj7;
        obj9 = acr1;
        s2 = s1;
        obj3 = obj5;
        obj12 = obj7;
        obj13 = acr1;
        s4 = s1;
        s1.write(uri, 0, j1);
        continue; /* Loop/switch isn't completed */
        obj2 = obj5;
        obj10 = obj7;
        obj11 = acr1;
        s3 = s1;
        obj = obj5;
        obj8 = obj7;
        obj9 = acr1;
        s2 = s1;
        obj3 = obj5;
        obj12 = obj7;
        obj13 = acr1;
        s4 = s1;
        map = ((adc) (obj7)).a(uri, j1);
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_2352;
        }
        obj2 = obj5;
        obj10 = obj7;
        obj11 = acr1;
        s3 = s1;
        obj = obj5;
        obj8 = obj7;
        obj9 = acr1;
        s2 = s1;
        obj3 = obj5;
        obj12 = obj7;
        obj13 = acr1;
        s4 = s1;
        s1.write(map, 0, map.length);
        if (true) goto _L22; else goto _L6
        obj2 = obj5;
        obj10 = obj7;
        obj11 = acr1;
        s3 = s1;
        obj = obj5;
        obj8 = obj7;
        obj9 = acr1;
        s2 = s1;
        obj3 = obj5;
        obj12 = obj7;
        obj13 = acr1;
        s4 = s1;
        throw new abz("Error converting drm data.");
_L18:
        if (flag) goto _L24; else goto _L23
_L23:
        obj2 = obj5;
        obj10 = obj7;
        obj11 = obj14;
        s3 = s1;
        obj = obj5;
        obj8 = obj7;
        obj9 = obj21;
        s2 = s1;
        obj3 = obj5;
        obj12 = obj7;
        obj13 = obj15;
        s4 = s1;
        s1.write(abyte0);
        obj8 = s1;
        obj1 = obj19;
        obj = obj7;
        map = ((Map) (obj5));
_L6:
        if (obj8 != null)
        {
            try
            {
                ((OutputStream) (obj8)).close();
            }
            // Misplaced declaration of an exception variable
            catch (acr acr1)
            {
                uri = String.valueOf(obj8);
                Log.e("PduPersister", (new StringBuilder(String.valueOf(uri).length() + 27)).append("IOException while closing: ").append(uri).toString(), acr1);
            }
        }
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (acr acr1)
            {
                uri = String.valueOf(obj1);
                Log.e("PduPersister", (new StringBuilder(String.valueOf(uri).length() + 27)).append("IOException while closing: ").append(uri).toString(), acr1);
            }
        }
        if (obj != null)
        {
            ((adc) (obj)).a(map);
            acr1 = new File(map);
            uri = new ContentValues(0);
            s1 = r;
            acr1 = String.valueOf(acr1.getName());
            if (acr1.length() != 0)
            {
                acr1 = "content://mms/resetFilePerm/".concat(acr1);
            } else
            {
                acr1 = new String("content://mms/resetFilePerm/");
            }
            g.a(s1, Uri.parse(acr1), uri);
            return;
        }
_L21:
        if (true) goto _L15; else goto _L24
_L24:
        obj2 = obj5;
        obj10 = obj7;
        obj11 = obj14;
        s3 = s1;
        obj = obj5;
        obj8 = obj7;
        obj9 = obj21;
        s2 = s1;
        obj3 = obj5;
        obj12 = obj7;
        obj13 = obj15;
        s4 = s1;
        acr1 = ((adc) (obj7)).a(abyte0, abyte0.length);
        if (acr1 == null)
        {
            break MISSING_BLOCK_LABEL_2698;
        }
        obj2 = obj5;
        obj10 = obj7;
        obj11 = obj14;
        s3 = s1;
        obj = obj5;
        obj8 = obj7;
        obj9 = obj21;
        s2 = s1;
        obj3 = obj5;
        obj12 = obj7;
        obj13 = obj15;
        s4 = s1;
        s1.write(acr1, 0, acr1.length);
        map = ((Map) (obj5));
        obj = obj7;
        obj1 = obj19;
        obj8 = s1;
          goto _L6
        obj2 = obj5;
        obj10 = obj7;
        obj11 = obj14;
        s3 = s1;
        obj = obj5;
        obj8 = obj7;
        obj9 = obj21;
        s2 = s1;
        obj3 = obj5;
        obj12 = obj7;
        obj13 = obj15;
        s4 = s1;
        throw new abz("Error converting drm data.");
        acr1;
        uri = null;
        obj8 = obj20;
          goto _L25
    }

    private static void a(Cursor cursor, acp acp1)
    {
        int i1 = h.size();
        do
        {
            int j1 = i1 - 1;
            if (j1 < 0)
            {
                break;
            }
            i1 = h.valueAt(j1);
            int j2 = h.keyAt(j1);
            String s1 = cursor.getString(i1);
            i1 = j1;
            if (s1 != null)
            {
                i1 = j1;
                if (s1.length() > 0)
                {
                    acp1.a(new ace(cursor.getInt(g.get(j2)), a(s1)), j2);
                    i1 = j1;
                }
            }
        } while (true);
        i1 = i.size();
        do
        {
            int k1 = i1 - 1;
            if (k1 < 0)
            {
                break;
            }
            i1 = i.valueAt(k1);
            int k2 = i.keyAt(k1);
            String s2 = cursor.getString(i1);
            i1 = k1;
            if (s2 != null)
            {
                acp1.a(a(s2), k2);
                i1 = k1;
            }
        } while (true);
        i1 = j.size();
        do
        {
            int l1 = i1 - 1;
            if (l1 < 0)
            {
                break;
            }
            int l2 = j.valueAt(l1);
            int j3 = j.keyAt(l1);
            i1 = l1;
            if (!cursor.isNull(l2))
            {
                acp1.a(cursor.getInt(l2), j3);
                i1 = l1;
            }
        } while (true);
        i1 = k.size();
        do
        {
            int i2 = i1 - 1;
            if (i2 < 0)
            {
                break;
            }
            int i3 = k.valueAt(i2);
            int k3 = k.keyAt(i2);
            i1 = i2;
            if (!cursor.isNull(i3))
            {
                acp1.a(cursor.getLong(i3), k3);
                i1 = i2;
            }
        } while (true);
    }

    private static byte[] a(Cursor cursor, int i1)
    {
        if (!cursor.isNull(i1))
        {
            return a(cursor.getString(i1));
        } else
        {
            return null;
        }
    }

    private static byte[] a(String s1)
    {
        try
        {
            s1 = s1.getBytes("iso-8859-1");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.e("PduPersister", "ISO_8859_1 must be supported!", s1);
            return new byte[0];
        }
        return s1;
    }

    private acr[] a(long l1)
    {
        Object obj2;
        Object obj3;
        Cursor cursor;
        obj3 = null;
        obj2 = null;
        cursor = g.a(r, Uri.parse((new StringBuilder(39)).append("content://mms/").append(l1).append("/part").toString()), e, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        int i1 = cursor.getCount();
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        if (cursor != null)
        {
            cursor.close();
        }
        return null;
        acr aacr[] = new acr[cursor.getCount()];
        i1 = 0;
_L23:
        if (!cursor.moveToNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        acr acr1;
        acr1 = new acr();
        if (cursor.isNull(1))
        {
            break MISSING_BLOCK_LABEL_706;
        }
        obj = Integer.valueOf(cursor.getInt(1));
_L24:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        acr1.a(((Integer) (obj)).intValue());
        byte abyte0[] = a(cursor, 2);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        acr1.d(abyte0);
        abyte0 = a(cursor, 3);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        acr1.b(abyte0);
        abyte0 = a(cursor, 4);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        acr1.c(abyte0);
        byte abyte1[] = a(cursor, 5);
        if (abyte1 == null) goto _L4; else goto _L3
_L3:
        acr1.e(abyte1);
        abyte0 = a(cursor, 6);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        acr1.h(abyte0);
        abyte0 = a(cursor, 7);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        acr1.g(abyte0);
        Object obj1;
        String s1;
        l1 = cursor.getLong(0);
        obj1 = Uri.parse((new StringBuilder(39)).append("content://mms/part/").append(l1).toString());
        acr1.a(((Uri) (obj1)));
        s1 = a(abyte1);
        if (g.b(s1) || g.c(s1) || g.d(s1)) goto _L6; else goto _L5
_L5:
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        if (!"text/plain".equals(s1) && !"application/smil".equals(s1) && !"text/html".equals(s1)) goto _L8; else goto _L7
_L7:
        obj1 = cursor.getString(8);
        if (obj == null) goto _L10; else goto _L9
_L9:
        int j1 = ((Integer) (obj)).intValue();
          goto _L11
_L22:
        obj = (new ace(j1, ((String) (obj)))).b();
        bytearrayoutputstream.write(((byte []) (obj)), 0, obj.length);
_L15:
        acr1.a(bytearrayoutputstream.toByteArray());
        break; /* Loop/switch isn't completed */
_L4:
        throw new abz("Content-Type must be set.");
        obj;
        if (cursor != null)
        {
            cursor.close();
        }
        throw obj;
_L10:
        j1 = 106;
          goto _L11
_L21:
        obj = "";
        continue; /* Loop/switch isn't completed */
_L8:
        obj = obj3;
        obj1 = r.openInputStream(((Uri) (obj1)));
        obj = new byte[256];
        j1 = ((InputStream) (obj1)).read(((byte []) (obj)));
_L13:
        if (j1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        bytearrayoutputstream.write(((byte []) (obj)), 0, j1);
        j1 = ((InputStream) (obj1)).read(((byte []) (obj)));
        if (true) goto _L13; else goto _L12
_L12:
        if (obj1 == null) goto _L15; else goto _L14
_L14:
        ((InputStream) (obj1)).close();
          goto _L15
        obj;
        Log.e("PduPersister", "Failed to close stream", ((Throwable) (obj)));
          goto _L15
        obj;
        obj1 = obj2;
        obj2 = obj;
_L19:
        obj = obj1;
        Log.e("PduPersister", "Failed to load part data", ((Throwable) (obj2)));
        obj = obj1;
        cursor.close();
        obj = obj1;
        throw new abz(((Throwable) (obj2)));
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
_L18:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_636;
        }
        ((InputStream) (obj1)).close();
_L16:
        throw obj;
        obj1;
        Log.e("PduPersister", "Failed to close stream", ((Throwable) (obj1)));
          goto _L16
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
        return aacr;
        obj;
        if (true) goto _L18; else goto _L17
_L17:
        exception;
        if (true) goto _L19; else goto _L11
_L11:
        if (obj1 == null) goto _L21; else goto _L20
_L20:
        obj = obj1;
        if (true) goto _L22; else goto _L6
_L6:
        aacr[i1] = acr1;
        i1++;
          goto _L23
        obj = null;
          goto _L24
    }

    private acf b(Uri uri)
    {
        obj = c;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = c.a(uri);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        c.wait();
_L1:
        Object obj1 = (ade)c.a(uri);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        obj1 = ((ade) (obj1)).a();
        obj;
        JVM INSTR monitorexit ;
        synchronized (c)
        {
            c.a(uri, false);
            c.notifyAll();
        }
        return ((acf) (obj1));
        Object obj2;
        obj2;
        Log.e("PduPersister", "load: ", ((Throwable) (obj2)));
          goto _L1
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
        obj2;
        synchronized (c)
        {
            c.a(uri, false);
            c.notifyAll();
        }
        throw obj2;
        uri;
        obj;
        JVM INSTR monitorexit ;
        throw uri;
        c.a(uri, true);
        obj;
        JVM INSTR monitorexit ;
        long l1;
        obj = g.a(r, uri, a, null, null, null);
        obj3 = new acp();
        l1 = ContentUris.parseId(uri);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        if (((Cursor) (obj)).getCount() == 1 && ((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_240;
        }
        obj3 = String.valueOf(uri);
        throw new abz((new StringBuilder(String.valueOf(obj3).length() + 9)).append("Bad uri: ").append(((String) (obj3))).toString());
        obj3;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        ((Cursor) (obj)).close();
        throw obj3;
        int i1;
        long l2;
        i1 = ((Cursor) (obj)).getInt(1);
        l2 = ((Cursor) (obj)).getLong(2);
        a(((Cursor) (obj)), ((acp) (obj3)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        ((Cursor) (obj)).close();
        if (l1 != -1L)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        throw new abz("Error! ID of the message: -1.");
        int j1;
        a(l1, ((acp) (obj3)));
        j1 = ((acp) (obj3)).a(140);
        obj = a(l1, j1);
        j1;
        JVM INSTR tableswitch 128 151: default 679
    //                   128 564
    //                   129 613
    //                   130 465
    //                   131 589
    //                   132 551
    //                   133 577
    //                   134 527
    //                   135 601
    //                   136 539
    //                   137 613
    //                   138 613
    //                   139 613
    //                   140 613
    //                   141 613
    //                   142 613
    //                   143 613
    //                   144 613
    //                   145 613
    //                   146 613
    //                   147 613
    //                   148 613
    //                   149 613
    //                   150 613
    //                   151 613;
           goto _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4
_L2:
        obj = String.valueOf(Integer.toHexString(j1));
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_660;
        }
        obj = "Unrecognized PDU type: ".concat(((String) (obj)));
_L13:
        throw new abz(((String) (obj)));
_L5:
        obj = new ach(((acp) (obj3)));
_L12:
        synchronized (c)
        {
            ade ade1 = new ade(((acf) (obj)), i1, l2);
            c.a(uri, ade1);
            c.a(uri, false);
            c.notifyAll();
        }
        return ((acf) (obj));
        uri;
        obj3;
        JVM INSTR monitorexit ;
        throw uri;
_L9:
        obj = new acd(((acp) (obj3)));
          goto _L12
_L11:
        obj = new acv(((acp) (obj3)));
          goto _L12
_L7:
        obj = new acx(((acp) (obj3)), ((acj) (obj)));
          goto _L12
_L3:
        obj = new acz(((acp) (obj3)), ((acj) (obj)));
          goto _L12
_L8:
        obj = new aca(((acp) (obj3)));
          goto _L12
_L6:
        obj = new aci(((acp) (obj3)));
          goto _L12
_L10:
        obj = new acw(((acp) (obj3)));
          goto _L12
_L4:
        obj = String.valueOf(Integer.toHexString(j1));
        if (((String) (obj)).length() != 0)
        {
            obj = "Unsupported PDU type: ".concat(((String) (obj)));
        } else
        {
            obj = new String("Unsupported PDU type: ");
        }
        throw new abz(((String) (obj)));
        obj = new String("Unrecognized PDU type: ");
          goto _L13
        uri;
        obj;
        JVM INSTR monitorexit ;
        throw uri;
    }

    public acf a(Uri uri)
    {
        return b(uri);
    }

    public Uri a(acf acf1, Uri uri, boolean flag)
    {
        return a(acf1, uri, true, flag, null, null);
    }

    public Uri a(acf acf1, Uri uri, boolean flag, boolean flag1, Map map, act act1)
    {
        long l3;
        if (uri == null)
        {
            throw new abz("Uri may not be null.");
        }
        l3 = -1L;
        long l4 = ContentUris.parseId(uri);
        l3 = l4;
_L9:
        boolean flag3;
        if (l3 != -1L)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (!flag3 && f.get(uri) == null)
        {
            throw new abz("Bad destination, must be one of content://mms/inbox, content://mms/sent, content://mms/drafts, content://mms/outbox, content://mms/temp.");
        }
        map = c;
        map;
        JVM INSTR monitorenter ;
        flag = c.a(uri);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        c.wait();
_L1:
        map;
        JVM INSTR monitorexit ;
        ContentValues contentvalues;
        acp acp1;
        c.b(uri);
        acp1 = acf1.a();
        contentvalues = new ContentValues();
        int i1 = m.size();
        do
        {
            i1--;
            if (i1 < 0)
            {
                break;
            }
            int i2 = m.keyAt(i1);
            map = acp1.c(i2);
            if (map != null)
            {
                String s1 = (String)l.get(i2);
                contentvalues.put((String)m.valueAt(i1), a(map.b()));
                contentvalues.put(s1, Integer.valueOf(map.a()));
            }
        } while (true);
        break MISSING_BLOCK_LABEL_247;
        InterruptedException interruptedexception;
        interruptedexception;
        Log.e("PduPersister", "persist1: ", interruptedexception);
          goto _L1
        acf1;
        map;
        JVM INSTR monitorexit ;
        throw acf1;
        SparseArray sparsearray;
        int j1;
        j1 = n.size();
        do
        {
            j1--;
            if (j1 < 0)
            {
                break;
            }
            map = acp1.b(n.keyAt(j1));
            if (map != null)
            {
                contentvalues.put((String)n.valueAt(j1), a(((byte []) (map))));
            }
        } while (true);
        j1 = o.size();
        do
        {
            j1--;
            if (j1 < 0)
            {
                break;
            }
            int j2 = acp1.a(o.keyAt(j1));
            if (j2 != 0)
            {
                contentvalues.put((String)o.valueAt(j1), Integer.valueOf(j2));
            }
        } while (true);
        j1 = p.size();
        do
        {
            j1--;
            if (j1 < 0)
            {
                break;
            }
            l4 = acp1.e(p.keyAt(j1));
            if (l4 != -1L)
            {
                contentvalues.put((String)p.valueAt(j1), Long.valueOf(l4));
            }
        } while (true);
        sparsearray = new SparseArray(d.length);
        int ai[] = d;
        int k2 = ai.length;
        j1 = 0;
        while (j1 < k2) 
        {
            int j3 = ai[j1];
            map = null;
            if (j3 == 137)
            {
                ace ace1 = acp1.c(j3);
                if (ace1 != null)
                {
                    map = new ace[1];
                    map[0] = ace1;
                }
            } else
            {
                map = acp1.d(j3);
            }
            sparsearray.put(j3, map);
            j1++;
        }
        map = new HashSet();
        j1 = acf1.b();
        if (j1 != 130 && j1 != 132 && j1 != 128) goto _L3; else goto _L2
_L2:
        j1;
        JVM INSTR tableswitch 128 132: default 624
    //                   128 865
    //                   129 624
    //                   130 821
    //                   131 624
    //                   132 821;
           goto _L4 _L5 _L4 _L6 _L4 _L6
_L4:
        l4 = -1L;
        if (!map.isEmpty())
        {
            l4 = adg.a(q, map);
        }
        contentvalues.put("thread_id", Long.valueOf(l4));
        if (act1 != null)
        {
            act1.a(l4);
        }
_L3:
        boolean flag5;
        l4 = System.currentTimeMillis();
        boolean flag4 = true;
        boolean flag2 = true;
        flag5 = flag4;
        if (acf1 instanceof acg)
        {
            acf1 = ((acg)acf1).d();
            flag5 = flag4;
            if (acf1 != null)
            {
                int k3 = acf1.b();
                if (k3 > 2)
                {
                    flag2 = false;
                }
                int l2 = 0;
                do
                {
                    flag5 = flag2;
                    if (l2 >= k3)
                    {
                        break;
                    }
                    map = acf1.a(l2);
                    a(((acr) (map)), l4, ((Map) (null)));
                    map = a(((acr) (map)));
                    flag5 = flag2;
                    if (map != null)
                    {
                        flag5 = flag2;
                        if (!"application/smil".equals(map))
                        {
                            flag5 = flag2;
                            if (!"text/plain".equals(map))
                            {
                                flag5 = false;
                            }
                        }
                    }
                    l2++;
                    flag2 = flag5;
                } while (true);
            }
        }
        break; /* Loop/switch isn't completed */
_L6:
        a(137, ((HashSet) (map)), sparsearray, false);
        if (flag1)
        {
            a(151, ((HashSet) (map)), sparsearray, true);
            a(130, ((HashSet) (map)), sparsearray, true);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        a(151, ((HashSet) (map)), sparsearray, false);
        if (true) goto _L4; else goto _L7
_L7:
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            int k1;
            int l1;
            int i3;
            if (flag5)
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            contentvalues.put("text_only", Integer.valueOf(k1));
        }
        if (flag3)
        {
            g.a(r, uri, contentvalues);
            acf1 = uri;
        } else
        {
            acf1 = g.b(r, uri, contentvalues);
            if (acf1 == null)
            {
                throw new abz("persist() failed: return null.");
            }
            l3 = ContentUris.parseId(acf1);
        }
        map = new ContentValues(1);
        map.put("mid", Long.valueOf(l3));
        g.a(r, Uri.parse((new StringBuilder(39)).append("content://mms/").append(l4).append("/part").toString()), map);
        if (!flag3)
        {
            acf1 = String.valueOf(uri);
            acf1 = Uri.parse((new StringBuilder(String.valueOf(acf1).length() + 21)).append(acf1).append("/").append(l3).toString());
        }
        uri = d;
        l1 = uri.length;
        for (k1 = 0; k1 < l1; k1++)
        {
            i3 = uri[k1];
            map = (ace[])sparsearray.get(i3);
            if (map != null)
            {
                a(l3, i3, ((ace []) (map)));
            }
        }

        break MISSING_BLOCK_LABEL_1145;
        map;
        if (true) goto _L9; else goto _L8
_L8:
        return acf1;
    }

    static 
    {
        Object obj = new hm();
        f = ((hm) (obj));
        ((hm) (obj)).put(android.provider.Telephony.Mms.Inbox.CONTENT_URI, Integer.valueOf(1));
        f.put(android.provider.Telephony.Mms.Sent.CONTENT_URI, Integer.valueOf(2));
        f.put(android.provider.Telephony.Mms.Draft.CONTENT_URI, Integer.valueOf(3));
        f.put(android.provider.Telephony.Mms.Outbox.CONTENT_URI, Integer.valueOf(4));
        obj = new SparseIntArray();
        g = ((SparseIntArray) (obj));
        ((SparseIntArray) (obj)).put(150, 25);
        g.put(154, 26);
        obj = new SparseArray();
        l = ((SparseArray) (obj));
        ((SparseArray) (obj)).put(150, "sub_cs");
        l.put(154, "retr_txt_cs");
        obj = new SparseIntArray();
        h = ((SparseIntArray) (obj));
        ((SparseIntArray) (obj)).put(154, 3);
        h.put(150, 4);
        obj = new SparseArray();
        m = ((SparseArray) (obj));
        ((SparseArray) (obj)).put(154, "retr_txt");
        m.put(150, "sub");
        obj = new SparseIntArray();
        i = ((SparseIntArray) (obj));
        ((SparseIntArray) (obj)).put(131, 5);
        i.put(132, 6);
        i.put(138, 7);
        i.put(139, 8);
        i.put(147, 9);
        i.put(152, 10);
        obj = new SparseArray();
        n = ((SparseArray) (obj));
        ((SparseArray) (obj)).put(131, "ct_l");
        n.put(132, "ct_t");
        n.put(138, "m_cls");
        n.put(139, "m_id");
        n.put(147, "resp_txt");
        n.put(152, "tr_id");
        obj = new SparseIntArray();
        j = ((SparseIntArray) (obj));
        ((SparseIntArray) (obj)).put(186, 11);
        j.put(134, 12);
        j.put(140, 13);
        j.put(141, 14);
        j.put(143, 15);
        j.put(144, 16);
        j.put(155, 17);
        j.put(145, 18);
        j.put(153, 19);
        j.put(149, 20);
        obj = new SparseArray();
        o = ((SparseArray) (obj));
        ((SparseArray) (obj)).put(186, "ct_cls");
        o.put(134, "d_rpt");
        o.put(140, "m_type");
        o.put(141, "v");
        o.put(143, "pri");
        o.put(144, "rr");
        o.put(155, "read_status");
        o.put(145, "rpt_a");
        o.put(153, "retr_st");
        o.put(149, "st");
        obj = new SparseIntArray();
        k = ((SparseIntArray) (obj));
        ((SparseIntArray) (obj)).put(133, 21);
        k.put(135, 22);
        k.put(136, 23);
        k.put(142, 24);
        obj = new SparseArray();
        p = ((SparseArray) (obj));
        ((SparseArray) (obj)).put(133, "date");
        p.put(135, "d_tm");
        p.put(136, "exp");
        p.put(142, "m_size");
    }
}
