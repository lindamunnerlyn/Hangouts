// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.telephony.SmsMessage;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.widget.Toast;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class drk
{

    public static String a = Character.toString('|');
    public static final Uri b = Uri.parse("content://mms/part");
    private static final boolean c = false;
    private static String d[];
    private static final Uri e;
    private static final Uri f;
    private static final Uri g;
    private static final Uri h;
    private static final Uri i;
    private static final Uri j;
    private static final Uri k;
    private static final Uri l;
    private static final String m[] = {
        "_id", "recipient_ids"
    };
    private static final Uri n = Uri.parse("content://mms-sms/canonical-address");
    private static final String o[] = {
        "date_sent"
    };
    private static Boolean p = null;
    private static ceu q = null;
    private static final String r[] = {
        "mmsc"
    };
    private static Boolean s;

    private static int a(Context context, Uri uri)
    {
        Context context1;
        Context context2;
        int i1;
        int j1;
        j1 = 0;
        i1 = 0;
        context2 = null;
        context1 = null;
        context = context.getContentResolver().openInputStream(uri);
        if (context != null) goto _L2; else goto _L1
_L1:
        j1 = i1;
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                uri = String.valueOf(uri);
                ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(uri).length() + 30)).append("getDataLength couldn't close: ").append(uri).toString(), context);
                return i1;
            }
            j1 = i1;
        }
_L3:
        return j1;
_L2:
        context1 = context;
        context2 = context;
        i1 = context.available();
          goto _L1
        IOException ioexception1;
        ioexception1;
        context1 = context;
        context2 = context;
        String s2 = String.valueOf(uri);
        context1 = context;
        context2 = context;
        ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s2).length() + 31)).append("getDataLength couldn't stream: ").append(s2).toString(), ioexception1);
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                uri = String.valueOf(uri);
                ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(uri).length() + 30)).append("getDataLength couldn't close: ").append(uri).toString(), context);
                return 0;
            }
            return 0;
        }
          goto _L3
        context;
        context2 = context1;
        String s1 = String.valueOf(uri);
        context2 = context1;
        ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s1).length() + 29)).append("getDataLength couldn't open: ").append(s1).toString(), context);
        if (context1 == null) goto _L3; else goto _L4
_L4:
        try
        {
            context1.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            uri = String.valueOf(uri);
            ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(uri).length() + 30)).append("getDataLength couldn't close: ").append(uri).toString(), context);
            return 0;
        }
        return 0;
        context;
        if (context2 != null)
        {
            try
            {
                context2.close();
            }
            catch (IOException ioexception)
            {
                uri = String.valueOf(uri);
                ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(uri).length() + 30)).append("getDataLength couldn't close: ").append(uri).toString(), ioexception);
            }
        }
        throw context;
    }

    public static long a(Context context, List list)
    {
        if (list == null || list.size() == 0)
        {
            return -1L;
        }
        list = new HashSet(list);
        long l1;
        try
        {
            l1 = ade.a(context, list);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = String.valueOf(context);
            ebw.g("Babel_SMS", (new StringBuilder(String.valueOf(context).length() + 36)).append("MmsUtils: getting thread id failed: ").append(context).toString());
            return -1L;
        }
        return l1;
    }

    public static long a(Uri uri)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = g.nS;
        obj = null;
        obj1 = null;
        uri = ((Context) (obj2)).getContentResolver().openAssetFileDescriptor(uri, "r");
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        long l1 = uri.getParcelFileDescriptor().getStatSize();
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                obj = String.valueOf(uri);
                ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(obj).length() + 43)).append("MmsUtils.getMediaFileSize: failed to close ").append(((String) (obj))).toString(), uri);
                return l1;
            }
        }
        return l1;
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                obj = String.valueOf(uri);
                ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(obj).length() + 43)).append("MmsUtils.getMediaFileSize: failed to close ").append(((String) (obj))).toString(), uri);
            }
        }
_L1:
        return 0L;
        obj;
        uri = ((Uri) (obj1));
        obj1 = obj;
_L4:
        obj = uri;
        obj2 = String.valueOf(obj1);
        obj = uri;
        ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(obj2).length() + 54)).append("MmsUtils.getMediaFileSize: cound not find media file: ").append(((String) (obj2))).toString(), ((Throwable) (obj1)));
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                obj = String.valueOf(uri);
                ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(obj).length() + 43)).append("MmsUtils.getMediaFileSize: failed to close ").append(((String) (obj))).toString(), uri);
            }
        }
          goto _L1
        uri;
_L3:
        if (obj != null)
        {
            try
            {
                ((AssetFileDescriptor) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj1 = String.valueOf(obj);
                ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(obj1).length() + 43)).append("MmsUtils.getMediaFileSize: failed to close ").append(((String) (obj1))).toString(), ((Throwable) (obj)));
            }
        }
        throw uri;
        obj1;
        obj = uri;
        uri = ((Uri) (obj1));
        if (true) goto _L3; else goto _L2
_L2:
        obj1;
          goto _L4
    }

    public static ContentValues a(Context context, SmsMessage asmsmessage[], int i1)
    {
        int j1 = 1;
        SmsMessage smsmessage = asmsmessage[0];
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("address", smsmessage.getDisplayOriginatingAddress());
        contentvalues.put("body", a(asmsmessage));
        if (g())
        {
            contentvalues.put("date_sent", Long.valueOf(smsmessage.getTimestampMillis()));
        }
        contentvalues.put("protocol", Integer.valueOf(smsmessage.getProtocolIdentifier()));
        contentvalues.put("seen", Integer.valueOf(1));
        if (smsmessage.getPseudoSubject().length() > 0)
        {
            contentvalues.put("subject", smsmessage.getPseudoSubject());
        }
        if (!smsmessage.isReplyPathPresent())
        {
            j1 = 0;
        }
        contentvalues.put("reply_path_present", Integer.valueOf(j1));
        contentvalues.put("service_center", smsmessage.getServiceCenterAddress());
        contentvalues.put("error_code", Integer.valueOf(i1));
        asmsmessage = smsmessage.getDisplayOriginatingAddress();
        if (!TextUtils.isEmpty(asmsmessage))
        {
            asmsmessage = add.a(asmsmessage);
        } else
        {
            asmsmessage = context.getResources().getString(l.sX);
            contentvalues.put("address", asmsmessage);
        }
        contentvalues.put("thread_id", Long.valueOf(ade.a(context, asmsmessage)));
        return contentvalues;
    }

    public static Uri a(Context context, acv acv1)
    {
        acq acq1 = acq.a(context);
        acv1 = acq1.a(acv1, f, c());
        ContentValues contentvalues = new ContentValues(1);
        contentvalues.put("date", Long.valueOf(System.currentTimeMillis() / 1000L));
        contentvalues.put("seen", Integer.valueOf(1));
        g.a(context.getContentResolver(), acv1, contentvalues);
        return acv1;
        context;
        acv1 = null;
_L4:
        String s1 = String.valueOf(context);
        ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s1).length() + 47)).append("MmsUtils: persist mms received message failure ").append(s1).toString(), context);
        return acv1;
        context;
        acv1 = null;
_L2:
        String s2 = String.valueOf(context);
        ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s2).length() + 46)).append("MmsUtils: update mms received message failure ").append(s2).toString(), context);
        return acv1;
        context;
        if (true) goto _L2; else goto _L1
_L1:
        context;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Uri a(Context context, acx acx, acw acw1, acr acr)
    {
        acq acq1 = acq.a(context);
        acx = acq1.a(acx, g, true, c(), null, acr);
        acr = new ContentValues(2);
        acr.put("resp_st", Integer.valueOf(acw1.e()));
        acr.put("m_id", acq.a(acw1.d()));
        g.a(context.getContentResolver(), acx, acr);
        return acx;
        context;
        acx = null;
_L4:
        acw1 = String.valueOf(context);
        ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(acw1).length() + 43)).append("MmsUtils: persist mms sent message failure ").append(acw1).toString(), context);
        return acx;
        context;
        acx = null;
_L2:
        acw1 = String.valueOf(context);
        ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(acw1).length() + 42)).append("MmsUtils: update mms sent message failure ").append(acw1).toString(), context);
        return acx;
        context;
        if (true) goto _L2; else goto _L1
_L1:
        context;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Uri a(Context context, String s1, String s2, long l1, long l2)
    {
        Uri uri;
        Long long1;
        ContentValues contentvalues;
        context = context.getContentResolver();
        uri = i;
        long1 = Long.valueOf(l1);
        contentvalues = new ContentValues(7);
        contentvalues.put("address", s1);
        if (long1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        contentvalues.put("date", long1);
        contentvalues.put("read", Integer.valueOf(1));
        contentvalues.put("subject", null);
        contentvalues.put("body", s2);
        if (l2 == -1L)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        contentvalues.put("thread_id", Long.valueOf(l2));
        context = context.insert(uri, contentvalues);
        return context;
        context;
_L2:
        s1 = String.valueOf(context);
        ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s1).length() + 38)).append("MmsUtils: persist sms message failure ").append(s1).toString(), context);
        return null;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static SmsMessage a(Intent intent)
    {
        return SmsMessage.createFromPdu(intent.getByteArrayExtra("pdu"));
    }

    public static drn a(Context context, String s1)
    {
        context = acq.a(context).a(Uri.parse(s1));
        if (!(context instanceof ace))
        {
            throw new abx("Invalid PDU type to load");
        } else
        {
            context = (ace)context;
            s1 = new drn();
            s1.b = context.d();
            s1.a = (int)context.f();
            return s1;
        }
    }

    public static drn a(Context context, String s1, String s2, String s3, int i1, int j1, int k1)
    {
        ach ach1 = new ach();
        int l1 = 0;
        Object obj;
        boolean flag;
        if (s2 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        int i2;
        int k2;
        int l2;
        int i3;
        int j3;
        if (!TextUtils.isEmpty(s1))
        {
            acp acp1;
            int j2;
            if (!flag)
            {
                l1 = 1;
            } else
            {
                l1 = 0;
            }
            acp1 = new acp();
            acp1.a(106);
            acp1.e("text/plain".getBytes());
            acp1.c("text_0.txt".getBytes());
            j2 = "text_0.txt".lastIndexOf(".");
            if (j2 == -1)
            {
                obj = "text_0.txt";
            } else
            {
                obj = "text_0.txt".substring(0, j2);
            }
            acp1.b(((String) (obj)).getBytes());
            acp1.a(s1.getBytes());
            ach1.a(acp1);
            if (l1 != 0)
            {
                a(ach1, String.format(Locale.getDefault(), "<smil><head><layout><root-layout/><region height=\"100%%\" id=\"Text\" left=\"0%%\" top=\"0%%\" width=\"100%%\"/></layout></head><body><par dur=\"8000ms\"><text src=\"%s\" region=\"Text\"/></par></body></smil>", new Object[] {
                    "text_0.txt"
                }));
            }
            l1 = acp1.a().length + 0;
            s1 = "text_0.txt";
        } else
        {
            s1 = null;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1347;
        }
        if (!g.b(s3)) goto _L2; else goto _L1
_L1:
        obj = s3;
        if (TextUtils.isEmpty(s3))
        {
            obj = "image/jpeg";
        }
        if (!g.b(((String) (obj))))
        {
            context = String.valueOf(obj);
            if (context.length() != 0)
            {
                context = "Unsupported image contentType: ".concat(context);
            } else
            {
                context = new String("Unsupported image contentType: ");
            }
            ebw.e("Babel_SMS", context, new Exception());
            i1 = 0;
        } else
        {
label0:
            {
                s3 = Uri.parse(s2);
                i3 = a(context, ((Uri) (s3)));
                if (i3 > 0)
                {
                    break label0;
                }
                ebw.e("Babel_SMS", "Can't get image", new Exception());
                i1 = 0;
            }
        }
_L5:
        i1 = l1 + i1;
_L7:
        context = new drn();
        context.b = ach1;
        context.a = i1;
        return context;
        j3 = dqv.a().e() - 1024;
        i2 = dqv.a().m();
        k2 = dqv.a().l();
        if (j1 <= i1)
        {
            l2 = k2;
            k2 = i2;
            i2 = l2;
        }
        if (c)
        {
            ebw.b("Babel_SMS", (new StringBuilder(120)).append("addPicturePart size: ").append(i3).append(" width: ").append(i1).append(" widthLimit: ").append(k2).append(" height: ").append(j1).append(" heightLimit: ").append(i2).toString());
        }
        if (i3 > j3 || i1 > k2 || j1 > i2 || k1 != 0) goto _L4; else goto _L3
_L3:
        if (c)
        {
            ebw.b("Babel_SMS", "addPicturePart - already sized");
        }
        context = new acp();
        context.a(s3);
        context.e(((String) (obj)).getBytes());
        k1 = i3;
_L6:
        context.c("image.jpg".getBytes());
        i2 = "image.jpg".lastIndexOf(".");
        if (i2 == -1)
        {
            s2 = "image.jpg";
        } else
        {
            s2 = "image.jpg".substring(0, i2);
        }
        context.b(s2.getBytes());
        ach1.a(context);
        if (c)
        {
            ebw.b("Babel_SMS", (new StringBuilder(32)).append("addPicturePart size: ").append(k1).toString());
        }
        if (!TextUtils.isEmpty(s1))
        {
            context = String.format(Locale.getDefault(), "<text src=\"%s\" region=\"Text\"/>", new Object[] {
                s1
            });
        } else
        {
            context = "";
        }
        a(ach1, String.format(Locale.getDefault(), "<smil><head><layout><root-layout width=\"%dpx\" height=\"%dpx\" /><region id=\"Image\" left=\"0\" top=\"0\" width=\"%dpx\" height=\"%dpx\" fit=\"meet\" /></layout></head><body><par dur=\"5000ms\"><img src=\"%s\" region=\"Image\" />%s</par></body></smil>", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1), Integer.valueOf(i1), Integer.valueOf(j1), "image.jpg", context
        }));
        i1 = k1;
          goto _L5
_L4:
label1:
        {
            s2 = new acp();
            context = a(k1, k2, i2, j3, ((Uri) (s3)), context);
            if (context == null)
            {
                if (c)
                {
                    ebw.b("Babel_SMS", "Resize image failed.");
                }
                context = null;
            } else
            {
                s2.a(context);
                s2.e("image/jpeg".getBytes());
                context = s2;
            }
            if (context != null)
            {
                break label1;
            }
            ebw.e("Babel_SMS", "Can't resize image: not enough memory?", new Exception());
            i1 = 0;
        }
          goto _L5
        k1 = context.a().length;
          goto _L6
_L2:
        if (g.e(s3))
        {
            obj = Uri.parse(s2);
            i1 = a(context, ((Uri) (obj)));
            if (i1 <= 0)
            {
                ebw.e("Babel_SMS", "Can't get vcard", new Exception());
                i1 = 0;
            } else
            {
                s2 = new acp();
                s2.a(((Uri) (obj)));
                s2.e(s3.getBytes());
                s2.c("contact.vcf".getBytes());
                j1 = "contact.vcf".lastIndexOf(".");
                if (j1 == -1)
                {
                    context = "contact.vcf";
                } else
                {
                    context = "contact.vcf".substring(0, j1);
                }
                s2.b(context.getBytes());
                ach1.a(s2);
                if (c)
                {
                    ebw.b("Babel_SMS", (new StringBuilder(30)).append("addVCardPart size: ").append(i1).toString());
                }
                if (!TextUtils.isEmpty(s1))
                {
                    context = String.format(Locale.getDefault(), "<text src=\"%s\" region=\"Text\"/>", new Object[] {
                        s1
                    });
                } else
                {
                    context = "";
                }
                a(ach1, String.format(Locale.getDefault(), "<smil><head><layout><root-layout width=\"%dpx\" height=\"%dpx\" /></layout></head><body><par dur=\"5000ms\"><ref src=\"%s\" />%s</par></body></smil>", new Object[] {
                    Integer.valueOf(300), Integer.valueOf(300), "contact.vcf", context
                }));
            }
            i1 += l1;
        } else
        {
            if (!g.d(s3))
            {
                break MISSING_BLOCK_LABEL_1347;
            }
            k1 = i1;
            if (i1 == 0)
            {
                k1 = 320;
            }
            i1 = j1;
            if (j1 == 0)
            {
                i1 = 160;
            }
            if (c)
            {
                context = String.valueOf(s2);
                if (context.length() != 0)
                {
                    context = "addVideoPart attachmentUrl: ".concat(context);
                } else
                {
                    context = new String("addVideoPart attachmentUrl: ");
                }
                ebw.b("Babel_SMS", context);
            }
            context = s3;
            if (TextUtils.isEmpty(s3))
            {
                context = "video/3gpp2";
            }
            s3 = new acp();
            s2 = Uri.parse(s2);
            s3.a(s2);
            s3.e(context.getBytes());
            s3.c("video.3gp".getBytes());
            j1 = "video.3gp".lastIndexOf(".");
            if (j1 == -1)
            {
                context = "video.3gp";
            } else
            {
                context = "video.3gp".substring(0, j1);
            }
            s3.b(context.getBytes());
            ach1.a(s3);
            if (!TextUtils.isEmpty(s1))
            {
                context = String.format(Locale.getDefault(), "<text src=\"%s\" region=\"Text\"/>", new Object[] {
                    s1
                });
            } else
            {
                context = "";
            }
            a(ach1, String.format(Locale.getDefault(), "<smil><head><layout><root-layout width=\"%d\" height=\"%d\" /><region id=\"Image\" left=\"0\" top=\"0\" width=\"%dpx\" height=\"%dpx\" fit=\"meet\" /></layout></head><body><par dur=\"8000ms\"><video src=\"%s\" region=\"Image\" />%s</par></body></smil>", new Object[] {
                Integer.valueOf(k1), Integer.valueOf(i1), Integer.valueOf(k1), Integer.valueOf(i1), "video.3gp", context
            }));
            i1 = (int)a(((Uri) (s2))) + l1;
        }
          goto _L7
        i1 = l1;
          goto _L7
    }

    public static CharSequence a(String s1, CharSequence charsequence)
    {
        Context context = g.nS;
        String s2 = b(context, s1);
        if (charsequence == null)
        {
            s1 = "";
        } else
        {
            s1 = charsequence;
        }
        charsequence = s1;
        if (s2 != null)
        {
            charsequence = context.getString(l.fh, new Object[] {
                s2, s1
            });
        }
        return charsequence;
    }

    public static Long a(SmsMessage smsmessage, long l1)
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar(2011, 8, 18);
        GregorianCalendar gregoriancalendar1 = new GregorianCalendar();
        gregoriancalendar1.setTimeInMillis(l1);
        if (gregoriancalendar1.before(gregoriancalendar))
        {
            l1 = smsmessage.getTimestampMillis();
        }
        return Long.valueOf(l1);
    }

    public static String a(int i1)
    {
        if (i1 <= 0)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("(?");
        for (int j1 = 0; j1 < i1 - 1; j1++)
        {
            stringbuilder.append(",?");
        }

        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    public static String a(aoe aoe, cey cey1, String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return null;
        } else
        {
            return a(aoe, cey1, Arrays.asList(s1.split(";")));
        }
    }

    public static String a(aoe aoe, cey cey1, List list)
    {
        if (list == null || list.isEmpty())
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        Object obj;
        for (list = list.iterator(); list.hasNext(); arraylist.add(obj))
        {
            obj = (String)list.next();
            obj = g.a(g.nS, ((String) (obj)), null, null);
            if (cey1 != null && cey1.a(((ceu) (obj)).b))
            {
                obj.i = Boolean.TRUE;
            }
        }

        boolean flag;
        if (cey1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return a(aoe, flag, ((List) (arraylist)));
    }

    public static String a(aoe aoe, boolean flag, List list)
    {
        byte byte0 = 1;
        if (list == null || list.isEmpty())
        {
            return null;
        }
        dfb dfb1 = new dfb();
        dfb1.a(-1L);
        aob aob1 = aob.b;
        if (list.size() > 1)
        {
            byte0 = 2;
        }
        return any.a(aoe, flag, null, list, null, null, aob1, byte0, 3, false, dfb1, null);
    }

    public static String a(String s1)
    {
        return String.format(Locale.US, "((%s LIKE '%s') OR (%s LIKE '%s') OR (%s LIKE '%s') OR (%s='%s'))", new Object[] {
            s1, "image/%", s1, "video/%", s1, "audio/%", s1, "application/ogg"
        });
    }

    public static String a(List list, long l1)
    {
        Context context = g.nS;
        if (list != null && list.size() == 1)
        {
            return (String)list.get(0);
        }
        list = g.a(context.getContentResolver(), Uri.parse((new StringBuilder(39)).append("content://mms/").append(l1).append("/addr").toString()), new String[] {
            "address", "charset"
        }, "type=137", null, null);
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        String s1;
        if (!list.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        s1 = dqq.a(list);
        list.close();
        return s1;
        list.close();
        return null;
        Exception exception;
        exception;
        list.close();
        throw exception;
    }

    public static String a(List list, String s1)
    {
        if (list != null && list.size() > 0)
        {
            StringBuilder stringbuilder = new StringBuilder();
            String s2 = s1;
            if (s1 != null)
            {
                s2 = ebz.k(s1);
            }
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                s1 = (String)list.next();
                if (s2 == null || !TextUtils.equals(s2, ebz.k(s1)))
                {
                    if (stringbuilder.length() > 0)
                    {
                        stringbuilder.append(",");
                    }
                    stringbuilder.append(s1);
                }
            } while (true);
            if (stringbuilder.length() > 0)
            {
                return stringbuilder.toString();
            }
        }
        return null;
    }

    public static String a(byte abyte0[], String s1)
    {
        if (abyte0 == null)
        {
            return null;
        }
        try
        {
            s1 = new String(abyte0, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            String s2 = String.valueOf(s1);
            ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s2).length() + 24)).append("MmsUtils.bytesToString: ").append(s2).toString(), s1);
            return new String(abyte0);
        }
        return s1;
    }

    private static String a(SmsMessage asmsmessage[])
    {
        int i1 = 0;
        if (asmsmessage.length == 1)
        {
            return c(asmsmessage[0].getDisplayMessageBody());
        }
        StringBuilder stringbuilder = new StringBuilder();
        int j1 = asmsmessage.length;
        while (i1 < j1) 
        {
            SmsMessage smsmessage = asmsmessage[i1];
            try
            {
                stringbuilder.append(smsmessage.getDisplayMessageBody());
            }
            catch (NullPointerException nullpointerexception) { }
            i1++;
        }
        return c(stringbuilder.toString());
    }

    public static List a(long l1)
    {
        if (l1 > 0L) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Cursor cursor;
        Object obj;
        obj = g.nS;
        cursor = ((Context) (obj)).getContentResolver().query(l, m, "_id=?", new String[] {
            String.valueOf(l1)
        }, null);
        if (cursor == null) goto _L1; else goto _L3
_L3:
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_86;
        }
        String s1 = cursor.getString(1);
        if (TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_86;
        }
        obj = c(((Context) (obj)), s1);
        cursor.close();
        return ((List) (obj));
        cursor.close();
        return null;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    public static void a(int i1, byte abyte0[])
    {
        Object obj;
        obj = new aco(abyte0);
        abyte0 = null;
        obj = ((aco) (obj)).a();
        abyte0 = ((byte []) (obj));
_L2:
        if (abyte0 == null)
        {
            ebw.g("Babel_SMS", "Invalid WAP push data");
            return;
        }
        break; /* Loop/switch isn't completed */
        RuntimeException runtimeexception;
        runtimeexception;
        ebw.e("Babel_SMS", "Invalid MMS WAP push", runtimeexception);
        if (true) goto _L2; else goto _L1
_L1:
        switch (abyte0.b())
        {
        default:
            return;

        case 130: 
            ebw.a("Babel_SMS", "Received MMS notification");
            abyte0 = (acf)abyte0;
            if (dqv.a().f())
            {
                byte abyte1[] = abyte0.d();
                if (61 == abyte1[abyte1.length - 1])
                {
                    byte abyte2[] = abyte0.g();
                    byte abyte3[] = new byte[abyte1.length + abyte2.length];
                    System.arraycopy(abyte1, 0, abyte3, 0, abyte1.length);
                    System.arraycopy(abyte2, 0, abyte3, abyte1.length, abyte2.length);
                    abyte0.a(abyte3);
                }
            }
            any.a(i1, abyte0);
            return;

        case 134: 
            ebw.a("Babel_SMS", "Received delivery report");
            return;

        case 136: 
            ebw.a("Babel_SMS", "Received read report");
            return;
        }
    }

    public static void a(long l1, long l2)
    {
        ContentResolver contentresolver = g.nS.getContentResolver();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("read", Integer.valueOf(1));
        String s1 = String.format(Locale.US, "%s=%d AND %s<=%d AND %s=0", new Object[] {
            "thread_id", Long.valueOf(l1), "date", Long.valueOf(l2), "read"
        });
        contentresolver.update(h, contentvalues, s1, null);
        s1 = String.format(Locale.US, "%s=%d AND %s<=%d AND %s=0", new Object[] {
            "thread_id", Long.valueOf(l1), "date", Long.valueOf(l2 / 1000L), "read"
        });
        contentresolver.update(e, contentvalues, s1, null);
    }

    private static void a(ach ach1, String s1)
    {
        acp acp1 = new acp();
        acp1.b("smil".getBytes());
        acp1.c("smil.xml".getBytes());
        acp1.e("application/smil".getBytes());
        acp1.a(s1.getBytes());
        ach1.b(acp1);
    }

    public static void a(Context context, boolean flag)
    {
        s = Boolean.valueOf(flag);
        if (flag || android.os.Build.VERSION.SDK_INT == 17)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        context = amp.a(context);
        Cursor cursor = context.query("apn", amp.a, null, null, null, null, null, null);
        if (cursor != null)
        {
            cursor.close();
        }
        return;
        Exception exception;
        exception;
        amp.b(context);
        return;
        context;
        throw context;
    }

    public static void a(Uri uri, boolean flag)
    {
        ContentResolver contentresolver = g.nS.getContentResolver();
        ContentValues contentvalues = new ContentValues();
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("read", Integer.valueOf(i1));
        contentresolver.update(uri, contentvalues, null, null);
    }

    public static void a(String s1, int i1, long l1)
    {
        if (s1 == null)
        {
            return;
        }
        s1 = Uri.parse(s1);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("status", Integer.valueOf(i1));
        if (g())
        {
            contentvalues.put("date_sent", Long.valueOf(l1));
        }
        g.nS.getContentResolver().update(s1, contentvalues, null, null);
    }

    public static void a(byte abyte0[], acd acd1, Context context)
    {
        if (!(acd1 instanceof acv))
        {
            ebw.g("Babel", "dumpPdu: not RetrieveConf");
            return;
        }
        if (!((chz)hgx.a(context, chz)).a("android.permission.WRITE_EXTERNAL_STORAGE"))
        {
            Toast.makeText(context, "You enabled SMS/MMS dump, but no storage permission. Please go to Settings to turn on storage permission", 1).show();
            return;
        }
        context = (acv)acd1;
        acd1 = String.valueOf("mmsdump-");
        context = String.valueOf(new String(context.h()));
        if (context.length() != 0)
        {
            acd1 = acd1.concat(context);
        } else
        {
            acd1 = new String(acd1);
        }
        acd1 = new File(Environment.getExternalStorageDirectory(), acd1);
        if (acd1.exists())
        {
            acd1.delete();
        }
        acd1 = new BufferedOutputStream(new FileOutputStream(acd1));
        acd1.write(abyte0);
        acd1.flush();
        try
        {
            acd1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            ebw.e("Babel", "MmsUtils: I/O error dumping pdu", abyte0);
        }
        return;
        abyte0;
        acd1.close();
        throw abyte0;
    }

    public static boolean a()
    {
        return android.os.Build.VERSION.SDK_INT >= 23;
    }

    public static boolean a(int i1, int j1)
    {
        return g.d(j1) && c() || g.g(j1) && dbq.C(i1);
    }

    public static boolean a(Context context)
    {
        if (s == null)
        {
            boolean flag1 = b(context);
            boolean flag = flag1;
            if (flag1)
            {
                flag = flag1;
                if (ebr.a())
                {
                    if (!((drw)hgx.a(context, drw)).b("use_local_apn_pref_key"))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                }
            }
            s = Boolean.valueOf(flag);
        }
        return g.a(s, false);
    }

    private static byte[] a(int i1, int j1, int k1, int l1, Uri uri, Context context)
    {
        byte abyte1[];
        try
        {
            abyte1 = ean.a(context.getContentResolver().openInputStream(uri));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            uri = String.valueOf(uri);
            ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(uri).length() + 41)).append("Could not open file corresponding to uri ").append(uri).toString(), context);
            abyte1 = null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            uri = String.valueOf(uri);
            ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(uri).length() + 27)).append("NPE trying to open the uri ").append(uri).toString(), context);
            abyte1 = null;
        }
        if (abyte1 != null) goto _L2; else goto _L1
_L1:
        if (c)
        {
            ebw.b("Babel_medialoader", "getResizedImageData: Could not get image bytes");
        }
        abyte1 = null;
_L11:
        return abyte1;
_L2:
        dzl dzl1;
        int i2;
        int j2;
        int k2;
        dzl1 = ean.a();
        i2 = 0;
        j2 = k1;
        k2 = j1;
_L12:
        if (i2 >= 4) goto _L4; else goto _L3
_L3:
        byte abyte0[];
        byte abyte2[];
        Object obj2;
        obj2 = null;
        uri = null;
        abyte2 = null;
        abyte0 = uri;
        context = obj2;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        abyte0 = uri;
        context = obj2;
        String s1 = String.valueOf("getResizedImageData: decode limit w=");
        abyte0 = uri;
        context = obj2;
        ebw.b("Babel_medialoader", (new StringBuilder(String.valueOf(s1).length() + 25)).append(s1).append(k2).append(" h=").append(j2).toString());
        abyte0 = uri;
        context = obj2;
        uri = dzl1.b(abyte1, k2, j2, i1);
        if (uri != null)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        abyte0 = uri;
        context = uri;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        abyte0 = uri;
        context = uri;
        ebw.b("Babel_medialoader", "getResizedImageData: got empty decoded bitmap");
        if (uri != null)
        {
            dzl1.a(uri);
        }
        return null;
        abyte0 = uri;
        context = uri;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_428;
        }
        abyte0 = uri;
        context = uri;
        int l2 = uri.getWidth();
        abyte0 = uri;
        context = uri;
        int i3 = uri.getHeight();
        abyte0 = uri;
        context = uri;
        ebw.b("Babel_medialoader", (new StringBuilder(56)).append("getResizedImageData: decoded w,h=").append(l2).append(",").append(i3).toString());
        l2 = uri.getWidth();
        i3 = uri.getHeight();
        if (l2 <= j1 && i3 <= k1) goto _L6; else goto _L5
_L10:
        double d1;
        double d2;
        d1 = Math.max(d1, d2);
        context = Bitmap.createScaledBitmap(uri, (int)((double)l2 / d1), (int)((double)i3 / d1), false);
_L17:
        if (context != null) goto _L8; else goto _L7
_L7:
        if (c)
        {
            ebw.b("Babel_medialoader", "getResizedImageData: got empty scaled bitmap");
        }
        if (uri != null)
        {
            dzl1.a(uri);
        }
        if (context != null && context != uri)
        {
            dzl1.a(context);
        }
        return null;
_L19:
        d1 = (double)l2 / (double)j1;
          goto _L9
_L21:
        d2 = (double)i3 / (double)k1;
          goto _L10
_L8:
        if (c)
        {
            l2 = context.getWidth();
            int j3 = context.getHeight();
            ebw.b("Babel_medialoader", (new StringBuilder(55)).append("getResizedImageData: scaled w,h=").append(l2).append(",").append(j3).toString());
        }
        abyte2 = ean.a(context, 95);
        if (abyte2 == null)
        {
            break MISSING_BLOCK_LABEL_648;
        }
        abyte0 = abyte2;
        if (abyte2.length <= l1)
        {
            break MISSING_BLOCK_LABEL_779;
        }
        l2 = (l1 * 95) / abyte2.length;
        if (l2 < 50)
        {
            l2 = 50;
        }
        if (c)
        {
            ebw.b("Babel_medialoader", (new StringBuilder(55)).append("getResizedImageData: compress(2) w/ quality=").append(l2).toString());
        }
        abyte2 = ean.a(context, l2);
        abyte0 = abyte2;
        if (l2 <= 50)
        {
            break MISSING_BLOCK_LABEL_779;
        }
        if (abyte2 == null)
        {
            break MISSING_BLOCK_LABEL_740;
        }
        abyte0 = abyte2;
        if (abyte2.length <= l1)
        {
            break MISSING_BLOCK_LABEL_779;
        }
        if (c)
        {
            ebw.b("Babel_medialoader", (new StringBuilder(55)).append("getResizedImageData: compress(2) w/ quality=50").toString());
        }
        abyte0 = ean.a(context, 50);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_837;
        }
        l2 = abyte0.length;
        if (l2 > l1)
        {
            break MISSING_BLOCK_LABEL_837;
        }
        if (uri != null)
        {
            dzl1.a(uri);
        }
        abyte1 = abyte0;
        if (context != null)
        {
            abyte1 = abyte0;
            if (context != uri)
            {
                dzl1.a(context);
                return abyte0;
            }
        }
          goto _L11
        if (uri != null)
        {
            dzl1.a(uri);
        }
        if (context != null && context != uri)
        {
            dzl1.a(context);
        }
_L13:
        k2 = (int)((double)k2 * 0.60000002384185791D);
        j2 = (int)((double)j2 * 0.60000002384185791D);
        i2++;
          goto _L12
        uri;
        uri = abyte0;
        context = abyte2;
_L16:
        ebw.f("Babel_SMS", "getResizedImageData - image too big (OutOfMemoryError), will try  with smaller scale factor");
        if (uri != null)
        {
            dzl1.a(uri);
        }
        if (context != null && context != uri)
        {
            dzl1.a(context);
        }
          goto _L13
        Object obj;
        obj;
        Object obj1 = null;
        uri = context;
        context = obj1;
_L15:
        if (uri != null)
        {
            dzl1.a(uri);
        }
        if (context != null && context != uri)
        {
            dzl1.a(context);
        }
        throw obj;
_L4:
        return null;
        obj;
        context = uri;
        continue; /* Loop/switch isn't completed */
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L15; else goto _L14
_L14:
        context;
        context = uri;
          goto _L16
        obj;
          goto _L16
_L6:
        context = uri;
          goto _L17
_L5:
        if (j1 != 0) goto _L19; else goto _L18
_L18:
        d1 = 1.0D;
_L9:
        if (k1 != 0) goto _L21; else goto _L20
_L20:
        d2 = 1.0D;
          goto _L10
    }

    public static byte[] a(String s1, String s2)
    {
        if (s1 == null)
        {
            return null;
        }
        try
        {
            s2 = s1.getBytes(s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s2)
        {
            String s3 = String.valueOf(s2);
            ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s3).length() + 24)).append("MmsUtils.stringToBytes: ").append(s3).toString(), s2);
            return s1.getBytes();
        }
        return s2;
    }

    public static long b(long l1)
    {
        return ((l1 + 1000L) - 1L) / 1000L;
    }

    public static Uri b()
    {
        return j;
    }

    public static String b(Context context, String s1)
    {
        if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        context = null;
_L4:
        return context;
_L2:
        if (d == null)
        {
            d = context.getResources().getStringArray(g.cO);
        }
        String as[] = d;
        int j1 = as.length;
        int i1 = 0;
        do
        {
            context = s1;
            if (i1 >= j1)
            {
                continue;
            }
            if (s1.equalsIgnoreCase(as[i1]))
            {
                return null;
            }
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String b(Uri uri)
    {
        Object obj = uri.getSchemeSpecificPart();
        int i1 = ((String) (obj)).indexOf('?');
        uri = ((Uri) (obj));
        if (i1 != -1)
        {
            uri = ((String) (obj)).substring(0, i1);
        }
        obj = new StringBuilder(uri.length());
        uri = uri.toCharArray();
        int j1 = uri.length;
        i1 = 0;
        while (i1 < j1) 
        {
            char c1 = uri[i1];
            int k1 = Character.digit(c1, 10);
            if (k1 != -1)
            {
                ((StringBuilder) (obj)).append(k1);
            } else
            {
                ((StringBuilder) (obj)).append(c1);
            }
            i1++;
        }
        return ((StringBuilder) (obj)).toString().replace(',', ';');
    }

    public static ArrayList b(String s1)
    {
        ArrayList arraylist;
        Object obj;
        int i1;
        obj = g.g(s1);
        arraylist = new ArrayList();
        s1 = null;
        obj = ((Iterable) (obj)).iterator();
        i1 = 0;
_L7:
        Object obj1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_158;
        }
        obj1 = (String)((Iterator) (obj)).next();
        i1;
        JVM INSTR tableswitch 0 3: default 76
    //                   0 85
    //                   1 101
    //                   2 109
    //                   3 129;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L8:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
        s1 = new drl();
        s1.a = ((String) (obj1));
          goto _L8
_L3:
        s1.b = ((String) (obj1));
          goto _L8
_L4:
        try
        {
            s1.c = Integer.parseInt(((String) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            s1.c = 0;
        }
          goto _L8
_L5:
        try
        {
            s1.d = Integer.parseInt(((String) (obj1)));
        }
        catch (Exception exception)
        {
            s1.d = 0;
        }
        arraylist.add(s1);
        i1 = -1;
          goto _L8
        return arraylist;
          goto _L8
    }

    public static boolean b(Context context)
    {
        try
        {
            context = g.a(context.getContentResolver(), j, r, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ebw.d("Babel_SMS", "Can't access system APN, using internal table", context);
            return false;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        context.close();
        return true;
    }

    public static int c(long l1)
    {
        ContentResolver contentresolver = g.nS.getContentResolver();
        String s1 = String.format(Locale.US, "%s AND (%s<=%d)", new Object[] {
            dry.a(), "date", Long.valueOf(l1)
        });
        int i1 = contentresolver.delete(h, s1, null);
        s1 = String.format(Locale.US, "%s AND (%s<=%d)", new Object[] {
            dry.b(), "date", Long.valueOf(l1 / 1000L)
        });
        return contentresolver.delete(e, s1, null) + (i1 + 0);
    }

    public static long c(Uri uri)
    {
        long l1 = -1L;
        if (uri != null)
        {
            try
            {
                l1 = ContentUris.parseId(uri);
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                return -1L;
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                return -1L;
            }
        }
        return l1;
    }

    private static String c(String s1)
    {
        if (s1 == null)
        {
            return "";
        } else
        {
            return s1.replace('\f', '\n');
        }
    }

    private static List c(Context context, String s1)
    {
        ArrayList arraylist;
        String as[];
        int i1;
        int j1;
        arraylist = new ArrayList();
        as = s1.split(" ");
        j1 = as.length;
        i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        s1 = as[i1];
        long l1 = Long.parseLong(s1);
        if (l1 >= 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            ebw.g("Babel_SMS", (new StringBuilder(54)).append("MmsUtils.getAddresses: invalid id ").append(l1).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            String s2 = String.valueOf(s1);
            ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s2).length() + 35)).append("MmsUtils.getAddresses: invalid id. ").append(s2).toString(), s1);
        }
_L4:
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            s1 = context.getContentResolver().query(ContentUris.withAppendedId(n, l1), null, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            ebw.e("Babel_SMS", (new StringBuilder(63)).append("MmsUtils.getAddresses: query failed for id ").append(l1).toString(), s1);
            s1 = null;
        }
        if (s1 == null) goto _L4; else goto _L3
_L3:
        if (s1.moveToFirst())
        {
            String s3 = s1.getString(0);
            if (!TextUtils.isEmpty(s3))
            {
                arraylist.add(s3);
            }
        }
        s1.close();
          goto _L4
        context;
        s1.close();
        throw context;
        return arraylist;
          goto _L4
    }

    public static boolean c()
    {
        drw drw1 = (drw)hgx.a(g.nS, drw);
        return dqv.a().u() && drw1.n() && !TextUtils.isEmpty(ebz.g());
    }

    public static void d(Uri uri)
    {
        ContentResolver contentresolver = g.nS.getContentResolver();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("seen", Integer.valueOf(1));
        contentresolver.update(uri, contentvalues, "seen != 1", null);
    }

    public static boolean d()
    {
        return android.os.Build.VERSION.SDK_INT >= 21 && g.a(g.nS, "babel_use_mms_api", true);
    }

    public static dqr e(Uri uri)
    {
        Object obj2;
        String s1;
        ContentResolver contentresolver;
        obj2 = null;
        s1 = null;
        contentresolver = g.nS.getContentResolver();
        uri = g.a(contentresolver, uri, dqr.a, null, null, null);
        if (uri == null) goto _L2; else goto _L1
_L1:
        Object obj = uri;
        if (!uri.moveToFirst()) goto _L2; else goto _L3
_L3:
        obj = uri;
        Object obj1 = dqr.a(uri);
_L15:
        obj = obj1;
        if (uri != null)
        {
            uri.close();
            obj = obj1;
        }
          goto _L4
        obj1;
        uri = null;
_L13:
        obj = uri;
        String s2 = String.valueOf(obj1);
        obj = uri;
        ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s2).length() + 30)).append("MmsLoader: query pdu failure: ").append(s2).toString(), ((Throwable) (obj1)));
        if (uri != null)
        {
            uri.close();
            obj = null;
        } else
        {
            obj = null;
        }
          goto _L4
        uri;
        obj = null;
_L12:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw uri;
_L4:
        if (obj == null)
        {
            return null;
        }
        s2 = String.format(Locale.US, "%s != '%s' AND %s = ?", new Object[] {
            "ct", "application/smil", "mid"
        });
        uri = s1;
        obj1 = obj2;
        obj2 = g.a(contentresolver, b, dqs.a, s2, new String[] {
            Long.toString(((dqr) (obj)).m)
        }, null);
        if (obj2 == null) goto _L6; else goto _L5
_L5:
        uri = ((Uri) (obj2));
        obj1 = obj2;
        if (!((Cursor) (obj2)).moveToNext()) goto _L6; else goto _L7
_L7:
        uri = ((Uri) (obj2));
        obj1 = obj2;
        ((dqr) (obj)).a(dqs.a(((Cursor) (obj2)), true));
        if (true) goto _L5; else goto _L8
_L8:
        obj2;
        obj1 = uri;
        s1 = String.valueOf(obj2);
        obj1 = uri;
        ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s1).length() + 32)).append("MmsLoader: query parts failure: ").append(s1).toString(), ((Throwable) (obj2)));
        if (uri != null)
        {
            uri.close();
        }
_L10:
        return ((dqr) (obj));
_L6:
        if (obj2 != null)
        {
            ((Cursor) (obj2)).close();
        }
        if (true) goto _L10; else goto _L9
_L9:
        uri;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw uri;
        uri;
        if (true) goto _L12; else goto _L11
_L11:
        obj1;
          goto _L13
_L2:
        obj1 = null;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public static boolean e()
    {
        drw drw1 = (drw)hgx.a(g.nS, drw);
        return drw1.g() && (drw1.h() || !((TelephonyManager)g.nS.getSystemService("phone")).isNetworkRoaming());
    }

    public static int f()
    {
        Object obj;
        ContentResolver contentresolver;
        long al[];
        int i1;
        obj = String.format(Locale.US, "%s AND (%s IN (SELECT %s FROM part WHERE %s))", new Object[] {
            dry.b(), "_id", "mid", a("ct")
        });
        contentresolver = g.nS.getContentResolver();
        obj = contentresolver.query(e, new String[] {
            "_id"
        }, ((String) (obj)), null, null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        al = new long[((Cursor) (obj)).getCount()];
        i1 = 0;
_L2:
        if (!((Cursor) (obj)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        al[i1] = ((Cursor) (obj)).getLong(0);
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        int j1;
        int i2;
        ((Cursor) (obj)).close();
        i2 = al.length;
        if (i2 <= 0)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        i1 = 0;
        j1 = 0;
_L4:
        String s1;
        int j2;
        if (i1 >= i2)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        j2 = Math.min(i1 + 128, i2) - i1;
        s1 = String.format(Locale.US, "%s IN %s", new Object[] {
            "_id", a(j2)
        });
        if (j2 > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = null;
_L6:
        int k1 = contentresolver.delete(e, s1, ((String []) (obj)));
        if (ebw.a("Babel_SMS", 3))
        {
            obj = String.valueOf(TextUtils.join(",", ((Object []) (obj))));
            ebw.d("Babel_SMS", (new StringBuilder(String.valueOf(obj).length() + 59)).append("deleteMediaMessages: deleting IDs = ").append(((String) (obj))).append(", deleted = ").append(k1).toString());
        }
        j1 += k1;
        i1 += 128;
        if (true) goto _L4; else goto _L3
        Exception exception;
        exception;
        ((Cursor) (obj)).close();
        throw exception;
_L3:
        String as[];
        int l1;
        as = new String[j2];
        l1 = 0;
_L7:
        obj = as;
        if (l1 >= j2) goto _L6; else goto _L5
_L5:
        as[l1] = Long.toString(al[i1 + l1]);
        l1++;
          goto _L7
          goto _L6
        return j1;
        return 0;
    }

    public static boolean g()
    {
        if (p != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        Cursor cursor1 = g.a(g.nS.getContentResolver(), h, o, null, null, "date_sent ASC LIMIT 1");
        Cursor cursor = cursor1;
        p = Boolean.valueOf(true);
        if (cursor1 != null)
        {
            cursor1.close();
        }
_L1:
        return g.a(p, false);
        SQLiteException sqliteexception;
        sqliteexception;
        cursor1 = null;
_L4:
        cursor = cursor1;
        ebw.d("Babel_SMS", "date_sent in sms table does not exist", sqliteexception);
        cursor = cursor1;
        p = Boolean.valueOf(false);
        if (cursor1 != null)
        {
            cursor1.close();
        }
          goto _L1
        Exception exception;
        exception;
        cursor = null;
_L3:
        if (cursor != null)
        {
            cursor.close();
        }
        throw exception;
        exception;
        if (true) goto _L3; else goto _L2
_L2:
        sqliteexception;
          goto _L4
    }

    public static ceu h()
    {
        if (q == null)
        {
            String s1 = g.nS.getResources().getString(l.gJ);
            q = g.a(g.nS, s1, s1, null);
        }
        return q;
    }

    public static boolean i()
    {
        drw drw1 = (drw)hgx.a(g.nS, drw);
        return ebr.a() && drw1.i();
    }

    public static boolean j()
    {
        drw drw1 = (drw)hgx.a(g.nS, drw);
        return ebr.a() && drw1.j();
    }

    static 
    {
        Object obj = ebw.r;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            obj = android.provider.Telephony.Mms.CONTENT_URI;
        } else
        {
            obj = Uri.parse("content://mms");
        }
        e = ((Uri) (obj));
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            obj = android.provider.Telephony.Mms.Inbox.CONTENT_URI;
        } else
        {
            obj = Uri.parse("content://mms/inbox");
        }
        f = ((Uri) (obj));
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            obj = android.provider.Telephony.Mms.Sent.CONTENT_URI;
        } else
        {
            obj = Uri.parse("content://mms/sent");
        }
        g = ((Uri) (obj));
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            obj = android.provider.Telephony.Sms.CONTENT_URI;
        } else
        {
            obj = Uri.parse("content://sms");
        }
        h = ((Uri) (obj));
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            obj = android.provider.Telephony.Sms.Sent.CONTENT_URI;
        } else
        {
            obj = Uri.parse("content://sms/sent");
        }
        i = ((Uri) (obj));
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            obj = android.provider.Telephony.Carriers.CONTENT_URI;
        } else
        {
            obj = Uri.parse("content://telephony/carriers");
        }
        j = ((Uri) (obj));
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            obj = android.provider.Telephony.Threads.CONTENT_URI;
        } else
        {
            obj = Uri.parse("content://mms-sms/conversations");
        }
        k = ((Uri) (obj));
        l = ((Uri) (obj)).buildUpon().appendQueryParameter("simple", "true").build();
    }
}
