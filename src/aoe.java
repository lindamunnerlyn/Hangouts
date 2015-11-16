// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class aoe
{

    private static final String A[] = {
        "conversation_id"
    };
    private static final String B[] = {
        "conversation_id"
    };
    public static final boolean a = false;
    static final String c[] = {
        "notification_level", "view"
    };
    private static final String g[] = {
        "gaia_id", "chat_id", "name", "first_name", "profile_photo_url", "packed_circle_ids"
    };
    private static final String h[] = {
        "_id", "gaia_id", "chat_id", "phone_id", "circle_id", "full_name", "first_name", "fallback_name", "profile_photo_url", "batch_gebi_tag", 
        "blocked", "participant_type"
    };
    private static final Random i = new Random();
    private static final String j[] = {
        "photo_id", "url", "file_name", "last_used"
    };
    private static final String k[] = {
        "album_id", "cover_photo_id", "title", "last_used"
    };
    private static String l;
    private static String m;
    private static String n;
    private static final String o[] = {
        "conversation_id"
    };
    private static final String p[] = {
        "latest_message_timestamp", "latest_message_expiration_timestamp", "snippet_type", "snippet_text", "snippet_author_chat_id", "snippet_image_url", "chat_watermark", "hangout_watermark"
    };
    private static final String q[] = {
        "gaia_id", "chat_id", "circle_id", "phone_id"
    };
    private static final String r[] = {
        "message_id", "conversation_id", "author_chat_id", "text", "status", "type", "timestamp", "expiration_timestamp", "local_url", "remote_url", 
        "image_id", "album_id", "stream_id", "attachment_content_type", "attachment_name", "latitude", "longitude", "address", "attachment_target_url", "transport_type", 
        "transport_phone", "sms_type", "width_pixels", "height_pixels", "mms_subject", "image_rotation", "new_conversation_name", "participant_keys", "forwarded_mms_url", "forwarded_mms_count", 
        "attachment_description", "attachment_target_url_description", "attachment_target_url_name", "call_media_type", "last_seen_timestamp"
    };
    private static final String s[] = {
        "local_url"
    };
    private static final String t[] = {
        "conversation_id", "self_watermark"
    };
    private static final String u;
    private static final String v[] = {
        "first_peak_scroll_time", "first_peak_scroll_to_message_timestamp", "second_peak_scroll_time", "second_peak_scroll_to_message_timestamp"
    };
    private static final String w[] = {
        "sort_timestamp"
    };
    private static final String x;
    private static final String y[] = {
        "timestamp"
    };
    private static final String z[] = {
        "conversation_type"
    };
    public final apd b;
    private final ani d;
    private final Context e;
    private int f;

    public aoe(Context context, int i1)
    {
        this(context, apa.a(context, i1).b(), i1);
    }

    public aoe(Context context, apd apd1, int i1)
    {
        e = context;
        d = dbf.e(i1);
        b = apd1;
    }

    private static String A()
    {
        aoe;
        JVM INSTR monitorenter ;
        String s1;
        if (m == null)
        {
            m = c(" WHERE conversation_id=? ", false);
        }
        s1 = m;
        aoe;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    private static String B()
    {
        aoe;
        JVM INSTR monitorenter ;
        String s1;
        if (n == null)
        {
            n = c(null, true);
        }
        s1 = n;
        aoe;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    private aoy C()
    {
        if (a)
        {
            Object obj = String.valueOf("getConversationScrollInfo: account=");
            String s1 = String.valueOf(d.a());
            if (s1.length() != 0)
            {
                obj = ((String) (obj)).concat(s1);
            } else
            {
                obj = new String(((String) (obj)));
            }
            ebw.b("Babel_db", ((String) (obj)));
        }
        obj = new aoy();
        obj.a = O("first_peak_scroll_time");
        obj.b = O("first_peak_scroll_to_conversation_timestamp");
        obj.c = O("second_peak_scroll_time");
        obj.d = O("second_peak_scroll_to_conversation_timestamp");
        return ((aoy) (obj));
    }

    private List D()
    {
        Object obj1 = new ArrayList();
        Object obj = b.a("sticker_photos", j, null, null, null);
_L2:
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!((Cursor) (obj)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cww cww1 = new cww();
        cww1.a = ((Cursor) (obj)).getString(0);
        cww1.b = ((Cursor) (obj)).getString(1);
        cww1.c = ((Cursor) (obj)).getString(2);
        cww1.d = ((Cursor) (obj)).getInt(3);
        ((List) (obj1)).add(cww1);
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
_L4:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
_L1:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return ((List) (obj1));
        obj;
        obj1 = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int a(aoe aoe1, String s1)
    {
        Cursor cursor;
        int i1;
        i1 = 0;
        cursor = aoe1.al(s1);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        i1 = 0;
_L11:
        if (!cursor.moveToNext()) goto _L4; else goto _L3
_L3:
        aoh aoh1;
        String s2;
        aoh1 = a(cursor);
        s2 = aoe1.a(aoh1);
        if (TextUtils.isEmpty(aoh1.t) || !TextUtils.equals(s2, aoh1.t)) goto _L6; else goto _L5
_L5:
        int j1 = 0;
          goto _L7
_L6:
        if (!aqc.d.b(aoh1.t)) goto _L9; else goto _L8
_L8:
        j1 = 0;
          goto _L7
_L9:
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("merge_key", s2);
        contentvalues.put("conversation_id", aoh1.s);
        aoe1.e().a("merge_keys", contentvalues);
        RealTimeChatService.b(aoh1.s, s2);
        j1 = 1;
          goto _L7
_L4:
        cursor.close();
_L2:
        if (i1 > 0)
        {
            aoe1.ap(s1);
        }
        return i1;
        aoe1;
        cursor.close();
        throw aoe1;
_L7:
        i1 += j1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private static int a(aoe aoe1, String s1, dme dme1)
    {
        HashSet hashset;
        apd apd1;
        int i1;
        hashset = null;
        apd1 = aoe1.e();
        Object obj;
        ContentValues contentvalues;
        String as[];
        String s2;
        Object obj1;
        long l1;
        if (TextUtils.isEmpty(s1))
        {
            s1 = apd1.a("participants", aox.a, aox.b, null, null);
        } else
        {
            s1 = apd1.a("conversation_participants_view", aox.a, aox.c, new String[] {
                s1
            }, null);
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_391;
        }
        contentvalues = new ContentValues();
        as = new String[1];
        i1 = 0;
_L1:
        do
        {
            if (!s1.moveToNext())
            {
                break MISSING_BLOCK_LABEL_265;
            }
            l1 = s1.getLong(0);
            obj1 = s1.getString(1);
            obj = s1.getString(2);
            s2 = s1.getString(3);
            obj1 = aoe1.a(dme1, ((String) (obj1)), ((String) (obj)), s2);
        } while (TextUtils.equals(((aov) (obj1)).a, ((CharSequence) (obj))) && TextUtils.equals(((aov) (obj1)).b, s2));
        contentvalues.clear();
        contentvalues.put("full_name", ((aov) (obj1)).a);
        contentvalues.put("profile_photo_url", ((aov) (obj1)).b);
        as[0] = String.valueOf(l1);
        i1 += apd1.a("participants", contentvalues, "_id=?", as);
        obj = hashset;
        if (hashset != null)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        obj = new HashSet();
        ((HashSet) (obj)).add(Long.valueOf(l1));
        hashset = ((HashSet) (obj));
          goto _L1
        aoe1;
        s1.close();
        throw aoe1;
        if (hashset == null)
        {
            break MISSING_BLOCK_LABEL_366;
        }
        dme1 = apd1.a("SELECT DISTINCT conversations.conversation_id  FROM conversations JOIN conversation_participants  WHERE conversation_participants.conversation_id=conversations.conversation_id  AND conversation_participants.participant_row_id IN (?); ", new String[] {
            TextUtils.join(",", hashset)
        });
        int j1;
        j1 = i1;
        if (dme1 == null)
        {
            break MISSING_BLOCK_LABEL_348;
        }
        j1 = i1;
        if (!dme1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_348;
        }
        j1 = i1 + dme1.getCount();
        boolean flag;
        do
        {
            any.b(aoe1, dme1.getString(0));
            flag = dme1.moveToNext();
        } while (flag);
        i1 = j1;
        if (dme1 == null)
        {
            break MISSING_BLOCK_LABEL_366;
        }
        dme1.close();
        i1 = j1;
        s1.close();
        return i1;
        aoe1;
        if (dme1 == null)
        {
            break MISSING_BLOCK_LABEL_386;
        }
        dme1.close();
        throw aoe1;
        return 0;
    }

    private int a(String s1, String s2, String s3, int i1)
    {
        Cursor cursor;
        boolean flag;
        int j1;
        if (a && !TextUtils.isEmpty(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.b(TextUtils.isEmpty(s3));
        if (TextUtils.isEmpty(s2)) goto _L2; else goto _L1
_L1:
        cursor = b.a("conversations", new String[] {
            s3
        }, "conversation_id=?", new String[] {
            s2
        }, null);
        if (cursor == null) goto _L4; else goto _L3
_L3:
        if (!cursor.moveToFirst() || cursor.isNull(0)) goto _L4; else goto _L5
_L5:
        i1 = cursor.getInt(0);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 45 + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s1).append(", conversationId ").append(s2).append(", query ").append(s3).append(" returns ").append(i1).toString());
        j1 = i1;
        if (cursor != null)
        {
            cursor.close();
            j1 = i1;
        }
_L7:
        return j1;
_L4:
        if (cursor != null)
        {
            cursor.close();
        }
_L2:
        j1 = i1;
        if (!flag) goto _L7; else goto _L6
_L6:
        ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 39 + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s1).append(", conversationId ").append(s2).append(", query ").append(s3).append(" has no result").toString());
        return i1;
        s1;
        cursor = null;
_L9:
        if (cursor != null)
        {
            cursor.close();
        }
        throw s1;
        s1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private int a(String s1, String s2, String s3, String s4, String s5, String s6)
    {
        int j1 = a(s2, s3, s4, s5, s6, true);
        if (j1 < 0) goto _L2; else goto _L1
_L1:
        s3 = cfa.a;
        s2 = Integer.toString(j1);
        s2 = b.a("conversation_participants", new String[] {
            "_id"
        }, "participant_row_id=? AND conversation_id=?", new String[] {
            s2, s1
        }, null);
        boolean flag = s2.moveToFirst();
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (s2 != null)
        {
            s2.close();
        }
        if (i1 != 0) goto _L2; else goto _L3
_L3:
        s2 = b.a("conversation_participants", new String[] {
            "MAX(sequence)"
        }, "conversation_id=?", new String[] {
            s1
        }, null);
        if (!s2.moveToFirst()) goto _L5; else goto _L4
_L4:
        i1 = s2.getInt(0);
_L10:
        if (s2 != null)
        {
            s2.close();
        }
        s2 = new ContentValues();
        s2.put("conversation_id", s1);
        if (s3 != cfa.a)
        {
            s2.put("participant_type", Integer.valueOf(s3.ordinal()));
        }
        s2.put("participant_row_id", Integer.valueOf(j1));
        s2.put("sequence", Integer.valueOf(i1 + 1));
        s2.put("active", Integer.valueOf(0));
        b.a("conversation_participants", s2);
_L2:
        return j1;
        s1;
        s2 = null;
_L8:
        if (s2 != null)
        {
            s2.close();
        }
        throw s1;
        s1;
        s2 = null;
_L7:
        if (s2 != null)
        {
            s2.close();
        }
        throw s1;
        s1;
        if (true) goto _L7; else goto _L6
_L6:
        s1;
        if (true) goto _L8; else goto _L5
_L5:
        i1 = 0;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private int a(String s1, String s2, String s3, String s4, String s5, boolean flag)
    {
        Object obj;
        int j1 = -1;
        l(s1, s2);
        String as[];
        int i1;
        if (!TextUtils.isEmpty(s1) && (TextUtils.isEmpty(s2) || TextUtils.equals(s2, s1)))
        {
            obj = "gaia_id=?";
            as = new String[1];
            as[0] = s1;
        } else
        if (!TextUtils.isEmpty(s2))
        {
            obj = "chat_id=?";
            as = new String[1];
            as[0] = s2;
        } else
        if (!TextUtils.isEmpty(s4))
        {
            obj = "circle_id=?";
            as = new String[1];
            as[0] = s4;
        } else
        if (!TextUtils.isEmpty(s3))
        {
            obj = "phone_id=?";
            as = new String[1];
            as[0] = s3;
        } else
        {
            return -1;
        }
        obj = b.a("participants_view", h, ((String) (obj)), as, null);
        i1 = j1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        i1 = j1;
        if (((Cursor) (obj)).moveToFirst())
        {
            i1 = ((Cursor) (obj)).getInt(0);
            a(((Cursor) (obj)), s5);
        }
        j1 = i1;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        i1 = j1;
        if (flag)
        {
            i1 = j1;
            if (j1 < 0)
            {
                obj = new ContentValues();
                ((ContentValues) (obj)).put("batch_gebi_tag", "-1");
                if (!TextUtils.isEmpty(s4))
                {
                    ((ContentValues) (obj)).put("circle_id", s4);
                    ((ContentValues) (obj)).put("participant_type", Integer.valueOf(cfa.c.ordinal()));
                } else
                {
                    if (!TextUtils.isEmpty(s1))
                    {
                        ((ContentValues) (obj)).put("gaia_id", s1);
                    }
                    if (!TextUtils.isEmpty(s2))
                    {
                        ((ContentValues) (obj)).put("chat_id", s2);
                    }
                    if (!TextUtils.isEmpty(s3))
                    {
                        ((ContentValues) (obj)).put("phone_id", s3);
                        ((ContentValues) (obj)).put("participant_type", Integer.valueOf(cfa.d.ordinal()));
                    } else
                    {
                        ((ContentValues) (obj)).put("participant_type", Integer.valueOf(cfa.b.ordinal()));
                    }
                }
                if (!TextUtils.isEmpty(s5))
                {
                    ((ContentValues) (obj)).put("fallback_name", s5);
                }
                j1 = (int)b.a("participants", ((ContentValues) (obj)));
                i1 = j1;
                if (j1 < 0)
                {
                    ebw.g("Babel_db", "insert failed");
                    i1 = j1;
                }
            }
        }
        return i1;
        s1;
        obj = null;
_L2:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw s1;
        s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static long a(long l1, int i1)
    {
        long l3 = System.currentTimeMillis() * 1000L;
        long l2 = l3;
        if (l3 <= l1)
        {
            l2 = l1 % (long)i1;
            if (l2 == 0L)
            {
                l2 = i1;
            } else
            {
                l2 = (long)i1 - l2;
            }
            l2 += l1;
        }
        return l2;
    }

    private static long a(aoy aoy1)
    {
        long l2;
        if (aoy1 == null)
        {
            l2 = 0L;
        } else
        {
            long l3 = dkz.c().d();
            long l1 = 0x7fffffffffffffffL;
            long l4 = System.currentTimeMillis();
            if (l4 < aoy1.a + 2L * l3)
            {
                l1 = aoy1.b;
            }
            l2 = l1;
            if (l4 < l3 * 2L + aoy1.c)
            {
                l2 = l1;
                if (l1 > aoy1.d)
                {
                    return aoy1.d;
                }
            }
        }
        return l2;
    }

    private long a(String s1, String s2, String s3, long l1)
    {
        Cursor cursor;
        boolean flag;
        long l2;
        if (a && !TextUtils.isEmpty(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.b(TextUtils.isEmpty(s3));
        if (TextUtils.isEmpty(s2)) goto _L2; else goto _L1
_L1:
        cursor = b.a("conversations", new String[] {
            s3
        }, "conversation_id=?", new String[] {
            s2
        }, null);
        if (cursor == null) goto _L4; else goto _L3
_L3:
        if (!cursor.moveToFirst() || cursor.isNull(0)) goto _L4; else goto _L5
_L5:
        l1 = cursor.getLong(0);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 54 + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s1).append(", conversationId ").append(s2).append(", query ").append(s3).append(" returns ").append(l1).toString());
        l2 = l1;
        if (cursor != null)
        {
            cursor.close();
            l2 = l1;
        }
_L7:
        return l2;
_L4:
        if (cursor != null)
        {
            cursor.close();
        }
_L2:
        l2 = l1;
        if (!flag) goto _L7; else goto _L6
_L6:
        ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 39 + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s1).append(", conversationId ").append(s2).append(", query ").append(s3).append(" has no result").toString());
        return l1;
        s1;
        cursor = null;
_L9:
        if (cursor != null)
        {
            cursor.close();
        }
        throw s1;
        s1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private Cursor a(String s1, String as[], int i1)
    {
label0:
        {
            String s2 = String.valueOf("SELECT conversation_id FROM conversation_participants_view WHERE active=1 GROUP BY conversation_id HAVING count(*) = ");
            int j1 = as.length;
            s2 = (new StringBuilder(String.valueOf(s2).length() + 11)).append(s2).append(j1).toString();
            String s3 = String.valueOf("SELECT DISTINCT conversation_id FROM conversation_participants_view WHERE active=1 AND conversation_id IN (");
            String s4 = String.valueOf("conversation_id");
            j1 = as.length;
            s2 = (new StringBuilder(String.valueOf(s3).length() + 48 + String.valueOf(s2).length() + String.valueOf(s1).length() + String.valueOf(s4).length())).append(s3).append(s2).append(") AND (").append(s1).append(") GROUP BY ").append(s4).append(" HAVING count(*) = ").append(j1).toString();
            if (i1 != 2)
            {
                s1 = s2;
                if (i1 != 3)
                {
                    break label0;
                }
            }
            s1 = String.valueOf("SELECT conversation_id FROM conversations WHERE conversation_id IN (");
            s3 = String.valueOf("transport_type");
            s4 = String.valueOf(String.valueOf(i1));
            s1 = (new StringBuilder(String.valueOf(s1).length() + 9 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s1).append(s2).append(") AND ").append(s3).append(" = ").append(s4).toString();
        }
        Cursor cursor = b.a(s1, as);
        if (a)
        {
            i1 = as.length;
            as = as[0];
            int k1 = cursor.getCount();
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 53 + String.valueOf(as).length())).append("queryMultiple ").append(i1).append("; selection ").append(s1).append(as).append(" ==> ").append(k1).toString());
        }
        return cursor;
    }

    private static aoh a(Cursor cursor)
    {
        boolean flag1 = true;
        aoh aoh1 = new aoh();
        aoh1.s = cursor.getString(20);
        String s1;
        boolean flag;
        if (cursor.getInt(0) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aoh1.a = flag;
        aoh1.b = cursor.getInt(1);
        aoh1.k = cursor.getInt(9);
        aoh1.q = cursor.getLong(16);
        aoh1.t = cursor.getString(17);
        aoh1.u = cursor.getLong(18);
        aoh1.r = cursor.getInt(19);
        s1 = cursor.getString(2);
        if (TextUtils.isEmpty(s1))
        {
            aoh1.d = null;
        } else
        {
            aoh1.d = s1;
        }
        aoh1.o = cursor.getString(13);
        if (cursor.getInt(3) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aoh1.e = flag;
        if (!cursor.isNull(4))
        {
            aoh1.f = cursor.getBlob(4);
        }
        aoh1.g = cursor.getLong(5);
        aoh1.i = cursor.getInt(6);
        aoh1.j = new cey(cursor.getString(7), cursor.getString(8));
        aoh1.n = cursor.getLong(10);
        if (cursor.getInt(14) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        aoh1.p = flag;
        aoh1.c = cursor.getInt(15);
        aoh1.l = cursor.getInt(11);
        aoh1.m = cursor.getInt(12);
        aoh1.h = b(cursor);
        return aoh1;
    }

    private aom a(aom aom1, aom aom2)
    {
        boolean flag = false;
        ContentValues contentvalues;
        int i1;
        if (aom1.a.startsWith("client_generated:") || aom1.d)
        {
            aom aom3 = aom2;
            aom2 = aom1;
            aom1 = aom3;
        } else
        {
            if (aom2.a.startsWith("client_generated:") || aom2.d)
            {
                flag = true;
            }
            gbh.a(flag);
        }
        if (a)
        {
            String s1 = aom2.a;
            String s2 = aom1.a;
            ao((new StringBuilder(String.valueOf(s1).length() + 60 + String.valueOf(s2).length())).append("moveMessagesFromClientGeneratedId: moving messages from ").append(s1).append(" to ").append(s2).toString());
        }
        a();
        contentvalues = new ContentValues();
        contentvalues.put("conversation_id", aom1.a);
        i1 = b.a("messages", contentvalues, "conversation_id=? AND status IN (?, ?, ?)", new String[] {
            aom2.a, Integer.toString(dqb.b.ordinal()), Integer.toString(dqb.d.ordinal()), Integer.toString(dqb.e.ordinal())
        });
        if (a)
        {
            ao((new StringBuilder(58)).append("moveMessagesFromClientGeneratedId updated ").append(i1).append(" rows").toString());
        }
        RealTimeChatService.i(d, aom2.a, aom1.a);
        C(aom2.a);
        b();
        c();
        any.d(this);
        return aom1;
        aom1;
        c();
        throw aom1;
    }

    private aov a(dme dme1, String s1, String s2, String s3)
    {
        Object obj = null;
        if (s1 != null)
        {
            obj = ebz.g(s1);
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            s1 = ((String) (obj));
        }
        obj = new aov(this);
        obj.a = s2;
        obj.b = s3;
        dme1 = a(s1, dme1);
        if (dme1 != null)
        {
            if (!TextUtils.isEmpty(dme1.c()))
            {
                obj.a = dme1.c();
            }
            if (!TextUtils.isEmpty(dme1.d()))
            {
                obj.b = dme1.d();
            }
        }
        return ((aov) (obj));
    }

    private static aoy a(aoy aoy1, long l1, long l2)
    {
        long l3 = dkz.c().d();
        aoy aoy2 = new aoy();
        if (l1 < l3 + aoy1.c)
        {
            if (l2 > aoy1.d)
            {
                return aoy1;
            }
            aoy2.a = aoy1.a;
            aoy2.b = aoy1.b;
            aoy2.c = l1;
            aoy2.d = l2;
        } else
        {
            aoy2.a = aoy1.c;
            aoy2.b = aoy1.d;
            aoy2.c = l1;
            aoy2.d = l2;
        }
        return aoy2;
    }

    public static bhj a(String s1, dme dme1)
    {
        fqo fqo1 = dme1.c(s1);
        if (fqo1 != null)
        {
            return bhj.a(fqo1);
        }
        s1 = dme1.b(s1);
        if (s1 != null)
        {
            Iterator iterator = s1.iterator();
            boolean flag = false;
            long l1 = -1L;
            dme1 = null;
            s1 = null;
            while (iterator.hasNext()) 
            {
                fqo fqo2 = (fqo)iterator.next();
                if (!TextUtils.isEmpty(fqo2.a()))
                {
                    Object obj;
                    if (s1 == null)
                    {
                        s1 = fqo2.a();
                    } else
                    if (!s1.equalsIgnoreCase(fqo2.a()))
                    {
                        s1 = String.valueOf(s1);
                        String s2 = String.valueOf(", ");
                        String s3 = String.valueOf(fqo2.a());
                        s1 = (new StringBuilder(String.valueOf(s1).length() + 0 + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s1).append(s2).append(s3).toString();
                        flag = true;
                    }
                    obj = dme1;
                    if (dme1 == null)
                    {
                        obj = dme1;
                        if (!TextUtils.isEmpty(fqo2.h()))
                        {
                            obj = fqo2.h();
                        }
                    }
                    if (l1 == -1L)
                    {
                        dme1 = fqo2.b().iterator();
                        if (dme1.hasNext())
                        {
                            l1 = g.a((Long)dme1.next(), 0L);
                        }
                    }
                    dme1 = ((dme) (obj));
                }
            }
            if (TextUtils.isEmpty(dme1) && l1 != -1L)
            {
                dme1 = dlw.a(Long.valueOf(l1));
            }
            if (flag)
            {
                dme1 = null;
            }
            if (!TextUtils.isEmpty(s1))
            {
                return new bhj(s1, null, dme1, null, null, null);
            }
        }
        return null;
    }

    private ceu a(Cursor cursor, String s1)
    {
        String s2 = cursor.getString(0);
        String s3 = cursor.getString(1);
        String s4 = cursor.getString(2);
        String s5 = cursor.getString(3);
        String s6 = cursor.getString(4);
        String s7 = cursor.getString(5);
        String s8 = cursor.getString(6);
        if (TextUtils.isEmpty(s1))
        {
            s1 = cursor.getString(7);
        }
        String s9 = cursor.getString(8);
        String s10 = cursor.getString(9);
        Boolean boolean1 = null;
        if (cursor.getInt(10) != 0)
        {
            boolean1 = Boolean.TRUE;
        }
        cursor = g.a(cfa.values()[cursor.getInt(11)], s3, s4, s6, s5, s7, s8, s1, s9, s10, boolean1, 0);
        ((aqs)hgx.a(e, aqs)).a(d).a(cursor, s2);
        return cursor;
    }

    private static cww a(List list, String s1)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            cww cww1 = (cww)list.next();
            if (cww1.a.equals(s1))
            {
                return cww1;
            }
        }

        return null;
    }

    public static String a(long l1)
    {
        String s1 = String.valueOf("client_generated:");
        return (new StringBuilder(String.valueOf(s1).length() + 20)).append(s1).append(l1).toString();
    }

    public static void a(Context context)
    {
        Iterator iterator = dbf.t().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ani ani1 = (ani)iterator.next();
            if (ani1.r())
            {
                aoe aoe1 = new aoe(context, ani1.h());
                a(context, ani1, true);
                a(aoe1, ((String) (null)));
                any.a(ani1.h());
            }
        } while (true);
    }

    private static void a(Context context, ani ani1, boolean flag)
    {
        ani1 = new aoe(context, ani1.h());
        Locale locale = Locale.US;
        if (flag)
        {
            context = "";
        } else
        {
            context = aqc.d.f;
        }
        context = String.format(locale, "update merge_keys set merge_key=\"%s\"||conversation_id;", new Object[] {
            context
        });
        ani1.e().a(context);
    }

    private void a(String s1, long l1, boolean flag)
    {
        long l2 = X(s1);
        ContentValues contentvalues;
        if (flag)
        {
            l1 = l2 | l1;
        } else
        {
            l1 = l2 & (-1L ^ l1);
        }
        contentvalues = new ContentValues();
        contentvalues.put("is_pending_leave", Long.valueOf(l1));
        b.a("conversations", contentvalues, "conversation_id=?", new String[] {
            s1
        });
    }

    private void a(String s1, cey cey1, cfa cfa1, boolean flag)
    {
        ContentValues contentvalues;
        boolean flag1;
        contentvalues = new ContentValues();
        contentvalues.put("conversation_id", s1);
        if (cfa1 != cfa.a)
        {
            contentvalues.put("participant_type", Integer.valueOf(cfa1.ordinal()));
        }
        flag1 = false;
        long l1 = a(cey1.a, cey1.b, null, ((String) (null)), ((String) (null)), false);
        if (l1 == -1L)
        {
            return;
        }
        if (TextUtils.isEmpty(cey1.a)) goto _L2; else goto _L1
_L1:
        String s2 = "gaia_id=? AND conversation_id=?";
        cfa1 = new String[2];
        cfa1[0] = cey1.a;
        cfa1[1] = s1;
        cey1 = s2;
_L14:
        cfa1 = b.a("conversation_participants_view", new String[] {
            "_id"
        }, cey1, cfa1, null);
        cey1 = cfa1;
        if (cfa1.moveToFirst())
        {
            flag1 = true;
        }
        cey1 = cfa1;
        cfa1.close();
        if (flag1) goto _L4; else goto _L3
_L3:
        cfa1 = b.a("conversation_participants", new String[] {
            "MAX(sequence)"
        }, "conversation_id=?", new String[] {
            s1
        }, null);
        cey1 = cfa1;
        if (!cfa1.moveToFirst()) goto _L6; else goto _L5
_L5:
        cey1 = cfa1;
        int i1 = cfa1.getInt(0);
_L12:
        cey1 = cfa1;
        contentvalues.put("sequence", Integer.valueOf(i1 + 1));
        if (cfa1 != null)
        {
            cfa1.close();
        }
        contentvalues.put("participant_row_id", Long.valueOf(l1));
        if (!flag1)
        {
            String s3;
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            contentvalues.put("active", Integer.valueOf(i1));
            b.a("conversation_participants", contentvalues);
            return;
        } else
        {
            b.a("conversation_participants", contentvalues, "participant_row_id=? AND conversation_id=?", new String[] {
                String.valueOf(l1), s1
            });
            return;
        }
_L2:
        if (TextUtils.isEmpty(cey1.b)) goto _L8; else goto _L7
_L7:
        s3 = "chat_id=? AND conversation_id=?";
        cfa1 = new String[2];
        cfa1[0] = cey1.b;
        cfa1[1] = s1;
        cey1 = s3;
        continue; /* Loop/switch isn't completed */
        s1;
        cey1 = null;
_L10:
        if (cey1 != null)
        {
            cey1.close();
        }
        throw s1;
_L8:
        if (TextUtils.isEmpty(null))
        {
            break; /* Loop/switch isn't completed */
        }
        cey1 = "phone_id=? AND conversation_id=?";
        cfa1 = new String[2];
        cfa1[0] = null;
        cfa1[1] = s1;
        continue; /* Loop/switch isn't completed */
        s1;
        continue; /* Loop/switch isn't completed */
        s1;
        cey1 = null;
        if (true) goto _L10; else goto _L9
_L9:
        break; /* Loop/switch isn't completed */
_L6:
        i1 = 0;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = 0;
        cfa1 = null;
        if (true) goto _L12; else goto _L11
_L11:
        return;
        if (true) goto _L14; else goto _L13
_L13:
    }

    private void a(String s1, String s2, long l1, long l2, String s3)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s2).append(" conversationid: ").append(s1);
        stringbuilder.append(" old ").append(s3).append(": ").append(Long.toString(l1));
        stringbuilder.append(" new ").append(s3).append(": ").append(Long.toString(l2));
        g.a(d.h(), 2697, stringbuilder.toString());
    }

    private void a(String s1, String s2, ContentValues contentvalues)
    {
        int i1 = 0;
        if (!s1.equals(s2))
        {
            contentvalues.put("conversation_id", s2);
        }
        b.a("conversations", contentvalues, "conversation_id=?", new String[] {
            s1
        });
        s1 = new ContentValues();
        String as[] = c;
        for (int j1 = as.length; i1 < j1; i1++)
        {
            String s4 = as[i1];
            if (contentvalues.containsKey(s4))
            {
                s1.put(s4, contentvalues.getAsInteger(s4));
            }
        }

        if (s1.size() == 0)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        s2 = ai(s2);
        if (s2.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        b.a();
        String s3;
        for (contentvalues = s2.iterator(); contentvalues.hasNext(); b.a("conversations", s1, "conversation_id=?", new String[] {
    s3
}))
        {
            s3 = (String)contentvalues.next();
        }

        break MISSING_BLOCK_LABEL_225;
        s1;
        b.c();
        for (s2 = s2.iterator(); s2.hasNext(); any.a(d))
        {
            s2.next();
        }

        break MISSING_BLOCK_LABEL_272;
        b.b();
        b.c();
        for (s1 = s2.iterator(); s1.hasNext(); any.a(d))
        {
            s1.next();
        }

        break MISSING_BLOCK_LABEL_274;
        throw s1;
    }

    private void a(String s1, String s2, String s3, String s4, String s5)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(s2, s4);
        contentvalues.put(s3, s5);
        b.a(s1, contentvalues, (new StringBuilder(String.valueOf(s2).length() + 8 + String.valueOf(s3).length())).append(s2).append("=? OR ").append(s3).append("=?").toString(), new String[] {
            s4, s5
        });
    }

    public static boolean a(dfd dfd1)
    {
        return dfd1 == dfd.e;
    }

    public static boolean a(String s1)
    {
        return s1.startsWith("client_generated:");
    }

    private boolean a(String s1, long l1, long l2, int i1, cey cey1, 
            String s2, String s3, long l3, dqb dqb1, String s4, String s5, 
            int j1, int k1)
    {
        aoo aoo1 = n(s1);
        if (aoo1.a > l1) goto _L2; else goto _L1
_L1:
        String s6;
        s6 = s2;
        if (s2 != null)
        {
            s6 = s2;
            if (s2.length() > 500)
            {
                s6 = s2.substring(0, 500);
            }
        }
        if (a)
        {
            s2 = String.valueOf("updateLatestEvent with conversationId=");
            String s7 = String.valueOf(cey1);
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s2).length() + 164 + String.valueOf(s1).length() + String.valueOf(s7).length() + String.valueOf(s6).length() + String.valueOf(s3).length())).append(s2).append(s1).append(" timestamp=").append(l1).append(" expirationTimestamp").append(l2).append(" type=").append(i1).append(" authorId=").append(s7).append(" text=").append(s6).append(" imageUrl=").append(s3).append(" smsType=").append(j1).append(" voicemailDuration=").append(k1).toString());
        }
        if (cey1 != null)
        {
            cey1 = cey1.b;
        } else
        {
            cey1 = null;
        }
        s2 = new ContentValues();
        s2.put("latest_message_timestamp", Long.valueOf(l1));
        if (i1 != 1 && i1 != 8 && i1 != 10 && i1 != 11 && l1 > aoo1.g)
        {
            s2.put("has_chat_notifications", Integer.valueOf(1));
        }
        if (l2 > 0L)
        {
            s2.put("latest_message_expiration_timestamp", Long.valueOf(l2));
        } else
        {
            s2.putNull("latest_message_expiration_timestamp");
        }
        s2.put("snippet_type", Integer.valueOf(i1));
        s2.put("snippet_message_row_id", Long.valueOf(l3));
        s2.put("snippet_status", Integer.valueOf(dqb1.ordinal()));
        s2.put("snippet_sms_type", Integer.valueOf(j1));
        i1;
        JVM INSTR tableswitch 1 13: default 456
    //                   1 662
    //                   2 556
    //                   3 504
    //                   4 760
    //                   5 812
    //                   6 456
    //                   7 712
    //                   8 864
    //                   9 608
    //                   10 456
    //                   11 864
    //                   12 921
    //                   13 504;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L3 _L9 _L10 _L11 _L3 _L10 _L12 _L6
_L3:
        b.a("conversations", s2, "conversation_id=?", new String[] {
            String.valueOf(s1)
        });
        any.d(this);
        return true;
_L6:
        s2.put("snippet_author_chat_id", cey1);
        s2.put("snippet_image_url", s3);
        s2.putNull("snippet_text");
        s2.putNull("snippet_new_conversation_name");
        s2.putNull("snippet_participant_keys");
        s2.putNull("snippet_voicemail_duration");
        continue; /* Loop/switch isn't completed */
_L5:
        s2.put("snippet_author_chat_id", cey1);
        s2.put("snippet_text", s6);
        s2.putNull("snippet_image_url");
        s2.putNull("snippet_new_conversation_name");
        s2.putNull("snippet_participant_keys");
        s2.putNull("snippet_voicemail_duration");
        continue; /* Loop/switch isn't completed */
_L11:
        s2.put("snippet_author_chat_id", cey1);
        s2.put("snippet_text", s6);
        s2.put("snippet_image_url", s3);
        s2.putNull("snippet_new_conversation_name");
        s2.putNull("snippet_participant_keys");
        s2.putNull("snippet_voicemail_duration");
        continue; /* Loop/switch isn't completed */
_L4:
        s2.put("snippet_author_chat_id", cey1);
        s2.putNull("snippet_text");
        s2.putNull("snippet_image_url");
        s2.putNull("snippet_new_conversation_name");
        s2.putNull("snippet_participant_keys");
        s2.putNull("snippet_voicemail_duration");
        continue; /* Loop/switch isn't completed */
_L9:
        s2.putNull("snippet_author_chat_id");
        s2.putNull("snippet_text");
        s2.putNull("snippet_image_url");
        s2.putNull("snippet_new_conversation_name");
        s2.putNull("snippet_participant_keys");
        s2.putNull("snippet_voicemail_duration");
        continue; /* Loop/switch isn't completed */
_L7:
        s2.put("snippet_author_chat_id", cey1);
        s2.putNull("snippet_text");
        s2.putNull("snippet_image_url");
        s2.putNull("snippet_new_conversation_name");
        s2.put("snippet_participant_keys", s5);
        s2.putNull("snippet_voicemail_duration");
        continue; /* Loop/switch isn't completed */
_L8:
        s2.put("snippet_author_chat_id", cey1);
        s2.put("snippet_new_conversation_name", s4);
        s2.putNull("snippet_text");
        s2.putNull("snippet_image_url");
        s2.putNull("snippet_participant_keys");
        s2.putNull("snippet_voicemail_duration");
        continue; /* Loop/switch isn't completed */
_L10:
        s2.put("previous_latest_timestamp", Long.valueOf(aoo1.a));
        s2.putNull("snippet_image_url");
        s2.putNull("snippet_author_chat_id");
        s2.putNull("snippet_new_conversation_name");
        s2.putNull("snippet_participant_keys");
        s2.putNull("snippet_voicemail_duration");
        continue; /* Loop/switch isn't completed */
_L12:
        s2.put("snippet_author_chat_id", cey1);
        s2.put("snippet_text", s6);
        s2.putNull("snippet_image_url");
        s2.putNull("snippet_new_conversation_name");
        s2.putNull("snippet_participant_keys");
        s2.put("snippet_voicemail_duration", Integer.valueOf(k1));
        if (true) goto _L3; else goto _L2
_L2:
        if (a)
        {
            s1 = String.valueOf("updateLatestMessage skipped. currentLatestMessageTimestamp=");
            l2 = aoo1.a;
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 61)).append(s1).append(l2).append(" passed in timestamp=").append(l1).toString());
        }
        return false;
    }

    private static boolean a(List list, cey cey1)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            cey cey2 = (cey)list.next();
            if (!TextUtils.isEmpty(cey2.a) && !TextUtils.isEmpty(cey1.a) && cey2.a.equals(cey1.a))
            {
                return true;
            }
        }

        return false;
    }

    private boolean ak(String s1)
    {
        s1 = b.a("conversations", new String[] {
            "conversation_id"
        }, "conversation_id=?", new String[] {
            s1
        }, null);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        boolean flag = s1.moveToFirst();
        if (flag)
        {
            if (s1 != null)
            {
                s1.close();
            }
            return true;
        }
        if (s1 != null)
        {
            s1.close();
        }
        return false;
        Exception exception;
        exception;
        s1 = null;
_L2:
        if (s1 != null)
        {
            s1.close();
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private Cursor al(String s1)
    {
label0:
        {
            Cursor cursor;
label1:
            {
                if (TextUtils.isEmpty(s1))
                {
                    break label0;
                }
                Cursor cursor1 = b.a(z(), new String[] {
                    s1
                });
                if (cursor1 != null)
                {
                    cursor = cursor1;
                    if (cursor1.getCount() != 0)
                    {
                        break label1;
                    }
                }
                if (cursor1 != null)
                {
                    cursor1.close();
                }
                cursor = b.a(A(), new String[] {
                    s1
                });
            }
            return cursor;
        }
        return b.a(B(), null);
    }

    private static String am(String s1)
    {
        while (s1 == null || "_sms_only_account".equals(s1) || s1.length() < 6) 
        {
            return s1;
        }
        return s1.substring(s1.length() - 6);
    }

    private aoy an(String s1)
    {
        Object obj;
        obj = null;
        if (a)
        {
            String s2 = String.valueOf("getMessageScrollInfo: conversationId=");
            String s3 = d.a();
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s2).length() + 9 + String.valueOf(s1).length() + String.valueOf(s3).length())).append(s2).append(s1).append(" account=").append(s3).toString());
        }
        Cursor cursor = b.a("conversations", v, "conversation_id=?", new String[] {
            String.valueOf(s1)
        }, null);
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_187;
        }
        s1 = new aoy();
        s1.a = cursor.getLong(0);
        s1.b = cursor.getLong(1);
        s1.c = cursor.getLong(2);
        s1.d = cursor.getLong(3);
        if (cursor != null)
        {
            cursor.close();
        }
        return s1;
        if (cursor != null)
        {
            cursor.close();
        }
        obj = String.valueOf("Not able to get message scroll info for conversationId=");
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s1 = ((String) (obj)).concat(s1);
        } else
        {
            s1 = new String(((String) (obj)));
        }
        ebw.f("Babel_db", s1);
        return null;
        s1;
_L2:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw s1;
        s1;
        obj = cursor;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void ao(String s1)
    {
        String s2 = String.valueOf("[EsConversationsHelper] ");
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s1 = s2.concat(s1);
        } else
        {
            s1 = new String(s2);
        }
        ebw.b("Babel_db", s1);
    }

    private void ap(String s1)
    {
        b.a();
        if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        s1 = b.a("conversations JOIN merge_keys ON (conversations.conversation_id=merge_keys.conversation_id)", aoq.a, "conversation_type=1", null, null);
_L11:
        if (s1 == null) goto _L4; else goto _L3
_L3:
        Object obj = null;
_L7:
        if (!s1.moveToNext()) goto _L4; else goto _L5
_L5:
        String s2;
        String s3;
        String s4;
        s2 = s1.getString(0);
        s3 = s1.getString(1);
        s4 = s1.getString(2);
        if (s3 == null && s4 == null) goto _L7; else goto _L6
_L6:
        if (obj != null) goto _L9; else goto _L8
_L8:
        Object obj1 = new ContentValues();
_L12:
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        ((ContentValues) (obj1)).put("chat_ringtone_uri", s3);
        if (s4 == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        ((ContentValues) (obj1)).put("hangout_ringtone_uri", s4);
        obj = obj1;
        if (((ContentValues) (obj1)).size() <= 0) goto _L7; else goto _L10
_L10:
        b.a("conversations", ((ContentValues) (obj1)), "conversation_id IN (SELECT conversation_id FROM merge_keys WHERE merge_key=?)", new String[] {
            s2
        });
        obj = obj1;
          goto _L7
        obj1;
        obj = s1;
        s1 = ((String) (obj1));
_L13:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        b.c();
        throw s1;
_L2:
        s1 = b.a("conversations JOIN merge_keys ON (conversations.conversation_id=merge_keys.conversation_id)", aoq.a, "conversation_type=1 AND conversations.conversation_id=?", new String[] {
            s1
        }, null);
          goto _L11
_L9:
        ((ContentValues) (obj)).clear();
        obj1 = obj;
          goto _L12
_L4:
        b.b();
        if (s1 != null)
        {
            s1.close();
        }
        b.c();
        return;
        s1;
        obj = null;
          goto _L13
    }

    private boolean aq(String s1)
    {
        b.a();
        ContentValues contentvalues;
        int i1;
        contentvalues = new ContentValues();
        contentvalues.put("last_used", Long.valueOf(System.currentTimeMillis()));
        i1 = b.a("sticker_photos", contentvalues, "photo_id=?", new String[] {
            s1
        });
        s1 = b.a("sticker_photos", new String[] {
            "album_id"
        }, "photo_id=?", new String[] {
            s1
        }, null);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        if (s1.moveToFirst() && s1.getString(0) != null)
        {
            contentvalues.clear();
            contentvalues.put("last_used", Long.valueOf(System.currentTimeMillis()));
            b.a("sticker_albums", contentvalues, "album_id=?", new String[] {
                s1.getString(0)
            });
        }
        b.b();
        Exception exception;
        if (s1 != null)
        {
            s1.close();
        }
        b.c();
        return i1 == 1;
        exception;
        s1 = null;
_L2:
        if (s1 != null)
        {
            s1.close();
        }
        b.c();
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static int b(aoe aoe1, String s1)
    {
        dme dme1 = dme.a();
        int i1 = a(aoe1, s1, dme1);
        dme1.b();
        return i1;
        aoe1;
        dme1.b();
        throw aoe1;
    }

    private static ContentValues b(cyw cyw1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("status", Integer.valueOf(cyw1.k));
        contentvalues.put("notification_level", Integer.valueOf(cyw1.j));
        contentvalues.put("conversation_type", Integer.valueOf(cyw1.a));
        if (cyw1.a())
        {
            contentvalues.put("sort_timestamp", Long.valueOf(cyw1.s));
        }
        if (!TextUtils.isEmpty(cyw1.b))
        {
            contentvalues.put("name", cyw1.b);
        } else
        {
            contentvalues.putNull("name");
        }
        contentvalues.put("metadata_present", Integer.valueOf(1));
        contentvalues.put("is_draft", Integer.valueOf(0));
        contentvalues.put("conversation_hash", cyw1.t);
        contentvalues.put("otr_status", Integer.valueOf(cyw1.p));
        contentvalues.put("otr_toggle", Integer.valueOf(cyw1.q));
        contentvalues.put("is_temporary", Boolean.valueOf(cyw1.w));
        contentvalues.put("inviter_affinity", Integer.valueOf(cyw1.u));
        if (cyw1.l != null && cyw1.l.length > 0)
        {
            contentvalues.put("view", Integer.valueOf(cyw1.l[0]));
        } else
        {
            contentvalues.putNull("view");
        }
        cyw1 = cyw1.m;
        if (cyw1 != null)
        {
            contentvalues.put("inviter_gaia_id", ((cey) (cyw1)).a);
            contentvalues.put("inviter_chat_id", ((cey) (cyw1)).b);
        }
        return contentvalues;
    }

    private Cursor b(String s1, cey cey1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            l(cey1.a, cey1.b);
            String s2;
            if (!TextUtils.isEmpty(cey1.a))
            {
                s2 = cey1.a;
                cey1 = "gaia_id";
            } else
            if (!TextUtils.isEmpty(cey1.b))
            {
                s2 = cey1.b;
                cey1 = "chat_id";
            } else
            {
                s2 = null;
                cey1 = null;
            }
            if (!TextUtils.isEmpty(cey1))
            {
                apd apd1 = b;
                cey1 = String.valueOf(cey1).concat("=?");
                return apd1.a("participants_view", new String[] {
                    s1
                }, cey1, new String[] {
                    s2
                }, null);
            }
        }
        return null;
    }

    private String b(String s1, String s2, String s3)
    {
        Cursor cursor;
        String s4;
        boolean flag;
        s4 = null;
        if (a && !TextUtils.isEmpty(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.b(TextUtils.isEmpty(s3));
        if (TextUtils.isEmpty(s2))
        {
            break MISSING_BLOCK_LABEL_213;
        }
        cursor = b.a("conversations", new String[] {
            s3
        }, "conversation_id=?", new String[] {
            s2
        }, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_201;
        }
        s4 = cursor.getString(0);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 34 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s1).append(", conversationId ").append(s2).append(", query ").append(s3).append(" returns ").append(s4).toString());
        if (cursor != null)
        {
            cursor.close();
        }
        return s4;
        if (cursor != null)
        {
            cursor.close();
        }
        if (flag)
        {
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 49 + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s1).append(", conversationId ").append(s2).append(", query ").append(s3).append(" returns null (no match)").toString());
        }
        return null;
        s1;
        s2 = s4;
_L2:
        if (s2 != null)
        {
            s2.close();
        }
        throw s1;
        s1;
        s2 = cursor;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static List b(Cursor cursor)
    {
        ArrayList arraylist;
        List list;
        List list1;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        List list9;
        int i1;
        arraylist = new ArrayList();
        if (cursor.getColumnCount() == 21)
        {
            return arraylist;
        }
        list = EsProvider.c(cursor.getString(21));
        list1 = EsProvider.c(cursor.getString(22));
        list2 = EsProvider.c(cursor.getString(23));
        list3 = EsProvider.c(cursor.getString(24));
        list4 = EsProvider.c(cursor.getString(26));
        list5 = EsProvider.c(cursor.getString(25));
        list6 = EsProvider.c(cursor.getString(27));
        list7 = EsProvider.c(cursor.getString(28));
        list8 = EsProvider.c(cursor.getString(29));
        list9 = EsProvider.c(cursor.getString(30));
        cursor = EsProvider.c(cursor.getString(31));
        i1 = 0;
_L2:
        if (i1 >= list.size())
        {
            break; /* Loop/switch isn't completed */
        }
        if (Integer.parseInt((String)list7.get(i1)) != 1)
        {
            break MISSING_BLOCK_LABEL_335;
        }
        cfa cfa1 = cfa.values()[Integer.parseInt((String)list6.get(i1))];
        arraylist.add(g.a(cfa1, (String)list.get(i1), (String)list1.get(i1), (String)list3.get(i1), (String)list2.get(i1), (String)list4.get(i1), (String)list8.get(i1), (String)list5.get(i1), (String)list9.get(i1), (String)cursor.get(i1), Boolean.valueOf(false), 0));
_L3:
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        return arraylist;
        NumberFormatException numberformatexception;
        numberformatexception;
          goto _L3
    }

    public static void b(Context context)
    {
        Iterator iterator = dbf.t().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ani ani1 = (ani)iterator.next();
            if (ani1.r())
            {
                a(context, ani1, false);
                any.a(ani1.h());
            }
        } while (true);
    }

    private boolean b(cey cey1, String s1)
    {
        String s4 = null;
        if (TextUtils.isEmpty(cey1.a)) goto _L2; else goto _L1
_L1:
        if (TextUtils.equals(cey1.a, cey1.b)) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = b;
        String s2 = cey1.a;
        String s5 = cey1.b;
        obj = ((apd) (obj)).a("participants_view", new String[] {
            "_id", "batch_gebi_tag", "chat_id", "gaia_id", "phone_id"
        }, "gaia_id=? OR chat_id=?", new String[] {
            s2, s5
        }, null);
_L11:
        if (!((Cursor) (obj)).moveToFirst()) goto _L6; else goto _L5
_L5:
        s4 = ((Cursor) (obj)).getString(0);
        String s3;
        boolean flag;
        boolean flag1;
        if (((Cursor) (obj)).getString(1) == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s3 = ((Cursor) (obj)).getString(2);
        flag1 = true;
_L9:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        if (!flag)
        {
            obj = new ContentValues();
            ((ContentValues) (obj)).put("batch_gebi_tag", s1);
            if (!TextUtils.isEmpty(cey1.b) && TextUtils.isEmpty(s3))
            {
                ((ContentValues) (obj)).put("chat_id", cey1.b);
            }
            if (!TextUtils.isEmpty(cey1.a))
            {
                ((ContentValues) (obj)).put("gaia_id", cey1.a);
            }
            if (!flag1)
            {
                if (b.a("participants", ((ContentValues) (obj))) < 1L)
                {
                    ebw.g("Babel_db", "insert failed");
                }
            } else
            if (b.a("participants", ((ContentValues) (obj)), "_id=?", new String[] {
    s4
}) <= 0)
            {
                ebw.g("Babel_db", "update failed on rowid lookup");
            }
            return true;
        } else
        {
            return false;
        }
_L4:
        obj = b;
        s3 = cey1.a;
        obj = ((apd) (obj)).a("participants_view", new String[] {
            "_id", "batch_gebi_tag", "chat_id", "gaia_id", "phone_id"
        }, "gaia_id=?", new String[] {
            s3
        }, null);
        continue; /* Loop/switch isn't completed */
_L2:
        if (TextUtils.isEmpty(cey1.b))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = b;
        s3 = cey1.b;
        obj = ((apd) (obj)).a("participants_view", new String[] {
            "_id", "batch_gebi_tag", "chat_id"
        }, "chat_id=?", new String[] {
            s3
        }, null);
        continue; /* Loop/switch isn't completed */
        cey1;
        obj = null;
_L7:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw cey1;
        cey1;
        if (true) goto _L7; else goto _L6
_L6:
        s3 = null;
        flag = false;
        flag1 = false;
        if (true) goto _L9; else goto _L8
_L8:
        obj = null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public static boolean b(String s1)
    {
        return s1.startsWith("client_generated:sms:");
    }

    private static aom c(Cursor cursor)
    {
        boolean flag = true;
        String s1 = cursor.getString(0);
        byte abyte0[];
        int i1;
        if (cursor.isNull(1))
        {
            abyte0 = null;
        } else
        {
            abyte0 = cursor.getBlob(1);
        }
        i1 = cursor.getInt(2);
        if (cursor.getInt(3) != 1)
        {
            flag = false;
        }
        return new aom(s1, abyte0, i1, flag);
    }

    public static Long c(String s1)
    {
        String s2 = s1.replace("client_generated:", "");
        Object obj = s2;
        if (s2.startsWith("sms:"))
        {
            obj = s2.replace("sms:", "");
        }
        try
        {
            obj = Long.valueOf(((String) (obj)));
        }
        catch (NumberFormatException numberformatexception)
        {
            s1 = String.valueOf(s1);
            if (s1.length() != 0)
            {
                s1 = "Malformed client-generated-id: ".concat(s1);
            } else
            {
                s1 = new String("Malformed client-generated-id: ");
            }
            ebw.g("Babel_db", s1);
            gbh.a("Malformed client-generated-id");
            return null;
        }
        return ((Long) (obj));
    }

    public static String c(Context context)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int ai1[] = dbf.z();
        int j1 = ai1.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            stringbuilder.append(ai1[i1]).append("|");
        }

        stringbuilder.append(((ecs)hgx.a(context, ecs)).c());
        return stringbuilder.toString();
    }

    private String c(cey cey1)
    {
        Object obj1;
        obj1 = null;
        if (a)
        {
            String s1 = String.valueOf(cey1);
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 41)).append("queryParticipantFirstName, participantId=").append(s1).toString());
        }
        cey1 = b("first_name", cey1);
        if (cey1 == null) goto _L2; else goto _L1
_L1:
        if (!cey1.moveToFirst()) goto _L2; else goto _L3
_L3:
        Object obj = cey1.getString(0);
        obj1 = obj;
        if (cey1 != null)
        {
            cey1.close();
            obj1 = obj;
        }
_L5:
        return ((String) (obj1));
_L2:
        if (cey1 == null) goto _L5; else goto _L4
_L4:
        cey1.close();
        return null;
        cey1;
        obj1 = null;
        obj = cey1;
_L7:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
        obj;
        obj1 = cey1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static String c(String s1, boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("SELECT ");
        for (int i1 = 0; i1 < aoi.a.length && (flag || i1 != 21); i1++)
        {
            if (i1 > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(aoi.a[i1]);
        }

        stringbuilder.append(" FROM ");
        stringbuilder.append("conversations");
        stringbuilder.append(' ');
        if (flag)
        {
            stringbuilder.append(" join conversation_participants_view using (conversation_id) ");
        }
        if (!TextUtils.isEmpty(s1))
        {
            stringbuilder.append(s1);
        }
        stringbuilder.append(" GROUP BY conversation_id ");
        stringbuilder.append(";");
        return stringbuilder.toString();
    }

    private void c(int i1)
    {
        String s1 = EsProvider.a(i1);
        ank.b(e, f().h(), s1);
    }

    private int d(cey cey1)
    {
        cey cey2;
        if (a)
        {
            String s1 = String.valueOf(cey1);
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 41)).append("queryParticipantIdBlocked, participantId=").append(s1).toString());
        }
        cey2 = null;
        cey1 = b("blocked", cey1);
        if (cey1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        cey2 = cey1;
        if (!cey1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_94;
        }
        cey2 = cey1;
        int i1 = cey1.getInt(0);
        if (cey1 != null)
        {
            cey1.close();
        }
        return i1;
        if (cey1 != null)
        {
            cey1.close();
        }
        return -1;
        cey1;
        if (cey2 != null)
        {
            cey2.close();
        }
        throw cey1;
    }

    public static long d(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return 0L;
        } else
        {
            return g.a(c(s1), 0L);
        }
    }

    private aos d(Cursor cursor)
    {
        dqc dqc1 = dqc.values()[cursor.getInt(5)];
        dqb dqb1 = dqb.values()[cursor.getInt(4)];
        String s1 = cursor.getString(3);
        switch (aof.a[dqc1.ordinal()])
        {
        default:
            s1 = g.a(dqc1, d, dqb1, null, cursor.getString(2), cursor.getString(26), cursor.getString(27), cursor.getInt(33), true);
            // fall through

        case 1: // '\001'
        case 2: // '\002'
            return new aos(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), s1, dqb1, dqc1, cursor.getLong(6), cursor.getLong(7), cursor.getString(8), cursor.getString(9), cursor.getString(10), cursor.getString(11), cursor.getString(12), cursor.getString(13), cursor.getString(14), cursor.getDouble(15), cursor.getDouble(16), cursor.getString(17), cursor.getString(18), cursor.getInt(19), cursor.getString(20), cursor.getInt(21), cursor.getInt(22), cursor.getInt(23), cursor.getString(24), cursor.getInt(25), cursor.getString(26), cursor.getString(27), cursor.getString(28), cursor.getInt(29), cursor.getString(32), cursor.getString(31), cursor.getString(30), cursor.getLong(34));
        }
    }

    private List d(List list)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ceu ceu1 = (ceu)iterator.next();
            if (!TextUtils.isEmpty(ceu1.d))
            {
                String s1 = String.valueOf(ceu1.d);
                if (s1.length() != 0)
                {
                    s1 = "participant.circleId not empty. Value = ".concat(s1);
                } else
                {
                    s1 = new String("participant.circleId not empty. Value = ");
                }
                ebw.g("Babel", s1);
                gbh.a("participant.circleId not empty.");
            }
            if (!d.b().a(ceu1.b))
            {
                arraylist.add(ceu1);
            }
        } while (true);
        gbh.a(Integer.valueOf(list.size() - 1), Integer.valueOf(arraylist.size()));
        return arraylist;
    }

    public static void d(Context context)
    {
        ebw.a("Babel", "refreshContactsDerivedData");
        int ai1[] = dbf.e();
        int j1 = ai1.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            int k1 = ai1[i1];
            if (dbf.e(k1) != null)
            {
                aoe aoe1 = new aoe(context, k1);
                dme.d();
                long l2 = System.currentTimeMillis();
                k1 = b(aoe1, ((String) (null)));
                long l3 = System.currentTimeMillis();
                int l1 = a(aoe1, ((String) (null)));
                long l4 = System.currentTimeMillis();
                ebw.a("Babel", (new StringBuilder(77)).append("refreshContactsDerivedData timing ").append(l3 - l2).append(" & ").append(l4 - l3).toString());
                if (k1 + 0 + l1 > 0)
                {
                    any.d(aoe1);
                }
            } else
            {
                String s1 = String.valueOf("Can not find account in BabelAccountManager. smsAccountId: ");
                ebw.f("Babel", (new StringBuilder(String.valueOf(s1).length() + 11)).append(s1).append(k1).toString());
            }
            i1++;
        }
    }

    private static void e(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (cww)list.next();
            if (((cww) (obj)).c != null)
            {
                obj = new File(((cww) (obj)).c);
                if (((File) (obj)).exists())
                {
                    ((File) (obj)).delete();
                }
            }
        } while (true);
    }

    private void f(String s1, int i1)
    {
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 74)).append("setConversationInviteDisposition, conversationId=").append(s1).append(", disposition=").append(i1).toString());
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("disposition", Integer.valueOf(i1));
        b.a("conversations", contentvalues, "conversation_id=?", new String[] {
            s1
        });
        any.d(this);
    }

    public static String g()
    {
        String s1 = String.valueOf("client_generated:");
        long l1 = Math.abs(i.nextLong());
        return (new StringBuilder(String.valueOf(s1).length() + 20)).append(s1).append(l1).toString();
    }

    public static String h()
    {
        String s1 = String.valueOf("client_generated:sms:");
        long l1 = Math.abs(i.nextLong());
        return (new StringBuilder(String.valueOf(s1).length() + 20)).append(s1).append(l1).toString();
    }

    private List k(String s1, String s2)
    {
        Object obj = new ArrayList();
        s1 = b.a("messages_view", r, String.valueOf(s1).concat("=? "), new String[] {
            s2
        }, null);
        while (s1.moveToNext()) 
        {
            ((ArrayList) (obj)).add(d(s1));
        }
          goto _L1
        obj;
        s2 = s1;
        s1 = ((String) (obj));
_L3:
        if (s2 != null)
        {
            s2.close();
        }
        throw s1;
_L1:
        if (s1 != null)
        {
            s1.close();
        }
        return ((List) (obj));
        s1;
        s2 = null;
        if (true) goto _L3; else goto _L2
_L2:
    }

    private void l(String s1, String s2)
    {
        String s3;
        String s4;
        int k1;
        s3 = null;
        s4 = null;
        k1 = 0;
        if (!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2) && !TextUtils.equals(s1, s2)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = b.a("participants", h, "gaia_id=?", new String[] {
            s1
        }, null);
        Cursor cursor = b.a("participants", h, "chat_id=?", new String[] {
            s2
        }, null);
        boolean flag1;
        boolean flag2;
        flag1 = ((Cursor) (obj)).moveToFirst();
        flag2 = cursor.moveToFirst();
        if (!flag1 && !flag2)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        if (!flag1 || !flag2)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag3 = TextUtils.equals(((Cursor) (obj)).getString(0), cursor.getString(0));
        if (!flag3)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag = true;
_L4:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        if (cursor != null)
        {
            cursor.close();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        flag = false;
          goto _L4
        a("conversations", "snippet_author_gaia_id", "snippet_author_chat_id", s1, s2);
        a("conversations", "inviter_gaia_id", "inviter_chat_id", s1, s2);
        a("dismissed_contacts", "gaia_id", "chat_id", s1, s2);
        a("messages", "author_gaia_id", "author_chat_id", s1, s2);
        a("suggested_contacts", "gaia_id", "chat_id", s1, s2);
        ContentValues contentvalues;
        int j1;
        int i1;
        if (flag1 && !flag2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        s3 = s4;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        s3 = s4;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        s3 = ((Cursor) (obj)).getString(0);
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        s4 = ((Cursor) (obj)).getString(0);
_L12:
        contentvalues = new ContentValues();
        if (TextUtils.isEmpty(s3)) goto _L8; else goto _L7
_L7:
        contentvalues.put("participant_row_id", s4);
        k1 = b.a("conversation_participants", contentvalues, "participant_row_id=?", new String[] {
            s3
        });
        contentvalues.clear();
        contentvalues.putNull("gaia_id");
        contentvalues.putNull("chat_id");
        j1 = b.a("participants", contentvalues, "_id=?", new String[] {
            s3
        });
        contentvalues.clear();
_L15:
        if (i1 == 0) goto _L10; else goto _L9
_L9:
        contentvalues.put("chat_id", s2);
        contentvalues.put("participant_type", Integer.valueOf(cfa.d.ordinal()));
        contentvalues.put("phone_id", s2);
_L13:
        i1 = b.a("participants", contentvalues, "_id=?", new String[] {
            s4
        });
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(134)).append("offnetwork gaia fixed ").append(k1).append(" conversation rows, ").append(j1).append(" participant(s) were deleted, ").append(i1).append(" participant(s) were updated.").toString());
        }
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        if (cursor == null) goto _L1; else goto _L11
_L11:
        cursor.close();
        return;
_L6:
        s4 = cursor.getString(0);
          goto _L12
_L10:
        contentvalues.put("gaia_id", s1);
          goto _L13
        s1;
        s2 = cursor;
_L14:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        if (s2 != null)
        {
            s2.close();
        }
        throw s1;
        s1;
        s2 = null;
        obj = s3;
        continue; /* Loop/switch isn't completed */
        s1;
        s2 = null;
        if (true) goto _L14; else goto _L8
_L8:
        j1 = 0;
          goto _L15
    }

    private long o(String s1, long l1)
    {
        return ank.a(e, f().h(), s1, l1);
    }

    private static String z()
    {
        aoe;
        JVM INSTR monitorenter ;
        String s1;
        if (l == null)
        {
            l = c(" WHERE conversation_id=? ", true);
        }
        s1 = l;
        aoe;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public int A(String s1)
    {
        return a("getConversationOtrStatus", s1, "otr_status", 1);
    }

    public void B(String s1)
    {
        if (a)
        {
            String s2 = String.valueOf(s1);
            if (s2.length() != 0)
            {
                s2 = "removeConversationFromDatabase:".concat(s2);
            } else
            {
                s2 = new String("removeConversationFromDatabase:");
            }
            ebw.b("Babel_db", s2);
        }
        if (b.a("conversations", "conversation_id=?", new String[] {
    s1
}) > 0)
        {
            any.d(this);
        }
    }

    public void C(String s1)
    {
        if (a)
        {
            String s2 = String.valueOf(s1);
            if (s2.length() != 0)
            {
                s2 = "deleteConversation:".concat(s2);
            } else
            {
                s2 = new String("deleteConversation:");
            }
            ebw.b("Babel_db", s2);
        }
        b.a("conversations", "conversation_id=?", new String[] {
            s1
        });
        RealTimeChatService.a(s1, f());
    }

    public void D(String s1)
    {
        if (a)
        {
            String s2 = String.valueOf(s1);
            if (s2.length() != 0)
            {
                s2 = "deleteMessagesFromConversation, conversationId=".concat(s2);
            } else
            {
                s2 = new String("deleteMessagesFromConversation, conversationId=");
            }
            ebw.b("Babel_db", s2);
        }
        b.a("messages", "conversation_id=?", new String[] {
            s1
        });
    }

    public void E(String s1)
    {
        if (a)
        {
            Object obj = String.valueOf(s1);
            if (((String) (obj)).length() != 0)
            {
                obj = "ensureLocalParticipantExists, conversationId=".concat(((String) (obj)));
            } else
            {
                obj = new String("ensureLocalParticipantExists, conversationId=");
            }
            ebw.b("Babel_db", ((String) (obj)));
        }
        obj = f();
        a(s1, g.a(((ani) (obj)).b(), ((ani) (obj)).c(), ((ani) (obj)).c(), null, ((ani) (obj)).x(), null));
    }

    public boolean F(String s1)
    {
        if (TextUtils.isEmpty(null)) goto _L2; else goto _L1
_L1:
        s1 = b.a("blocked_people", new String[] {
            "_id"
        }, "gaia_id=?", new String[] {
            null
        }, null);
_L10:
        if (s1 == null) goto _L4; else goto _L3
_L3:
        boolean flag = s1.moveToFirst();
        if (!flag) goto _L4; else goto _L5
_L5:
        flag = true;
_L8:
        if (s1 != null)
        {
            s1.close();
        }
        return flag;
_L2:
        if (TextUtils.isEmpty(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = b.a("blocked_people", new String[] {
            "_id"
        }, "chat_id=?", new String[] {
            s1
        }, null);
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        s1 = null;
_L6:
        if (s1 != null)
        {
            s1.close();
        }
        throw exception;
        exception;
        if (true) goto _L6; else goto _L4
_L4:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
        s1 = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void G(String s1)
    {
        ebw.a("Babel_db", "deleteDismissedContact");
        b.a("dismissed_contacts", "gaia_id=?", new String[] {
            s1
        });
        e.getContentResolver().notifyChange(EsProvider.l, null);
    }

    public ceu H(String s1)
    {
        Object obj1 = null;
        if (a)
        {
            Object obj = String.valueOf(s1);
            if (((String) (obj)).length() != 0)
            {
                obj = "cacheParticipantRow for: ".concat(((String) (obj)));
            } else
            {
                obj = new String("cacheParticipantRow for: ");
            }
            ebw.b("Babel_db", ((String) (obj)));
        }
        s1 = b.a("participants_view", h, "_id=?", new String[] {
            s1
        }, null);
        obj = obj1;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        obj = obj1;
        if (s1.moveToNext())
        {
            obj = a(s1, ((String) (null)));
        }
        if (s1 != null)
        {
            s1.close();
        }
        return ((ceu) (obj));
        Exception exception;
        exception;
        s1 = null;
_L2:
        if (s1 != null)
        {
            s1.close();
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void I(String s1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("active", Integer.valueOf(0));
        b.a("conversation_participants", contentvalues, u, new String[] {
            s1, String.valueOf(cfa.c.ordinal())
        });
    }

    public List J(String s1)
    {
        Object obj;
        ArrayList arraylist;
        String s2;
        Object obj1;
        boolean flag;
        if (a)
        {
            obj = String.valueOf(s1);
            String s3;
            String s5;
            if (((String) (obj)).length() != 0)
            {
                obj = "queryParticipantIdFirstNames ConversationId: ".concat(((String) (obj)));
            } else
            {
                obj = new String("queryParticipantIdFirstNames ConversationId: ");
            }
            ebw.b("Babel_db", ((String) (obj)));
        }
        arraylist = new ArrayList();
        obj = b;
        s1 = String.valueOf(s1);
        obj = ((apd) (obj)).a("conversation_participants_view", new String[] {
            "gaia_id", "chat_id", "circle_id", "first_name", "full_name", "fallback_name", "profile_photo_url", "participant_type", "phone_id", "in_users_domain"
        }, "conversation_id=? AND active=1", new String[] {
            s1
        }, "sequence ASC");
_L5:
        if (!((Cursor) (obj)).moveToNext()) goto _L2; else goto _L1
_L1:
        s3 = ((Cursor) (obj)).getString(3);
        s1 = ((Cursor) (obj)).getString(6);
        obj1 = cfa.values()[((Cursor) (obj)).getInt(7)];
        s2 = ((Cursor) (obj)).getString(4);
        if (obj1 != cfa.b) goto _L4; else goto _L3
_L3:
        obj1 = new cey(((Cursor) (obj)).getString(0), ((Cursor) (obj)).getString(1));
        s5 = ((Cursor) (obj)).getString(5);
        if (((Cursor) (obj)).getInt(9) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s1 = g.a(((cey) (obj1)), s2, s3, s5, s1, null);
        s1.y = flag;
        arraylist.add(s1);
          goto _L5
        s1;
_L9:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw s1;
_L4:
        if (obj1 != cfa.c) goto _L7; else goto _L6
_L6:
        arraylist.add(g.b(((Cursor) (obj)).getString(2), s2));
          goto _L5
_L7:
        if (obj1 != cfa.d) goto _L5; else goto _L8
_L8:
        String s4 = ((Cursor) (obj)).getString(8);
        arraylist.add(g.a(e, s4, s2, s1));
          goto _L5
_L2:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return arraylist;
        s1;
        obj = null;
          goto _L9
    }

    public List K(String s1)
    {
        Object obj;
        if (a)
        {
            obj = String.valueOf(s1);
            android.text.TextUtils.SimpleStringSplitter simplestringsplitter;
            if (((String) (obj)).length() != 0)
            {
                obj = "queryInvitees: ".concat(((String) (obj)));
            } else
            {
                obj = new String("queryInvitees: ");
            }
            ebw.b("Babel_db", ((String) (obj)));
        }
        obj = new ArrayList();
        simplestringsplitter = new android.text.TextUtils.SimpleStringSplitter('|');
        simplestringsplitter.setString(s1);
        for (s1 = simplestringsplitter.iterator(); s1.hasNext(); ((List) (obj)).add(daf.a(H((String)s1.next())))) { }
        return ((List) (obj));
    }

    public eaz L(String s1)
    {
        Object obj;
        if (a)
        {
            obj = String.valueOf(s1);
            Exception exception;
            if (((String) (obj)).length() != 0)
            {
                obj = "getActiveConversationParticipants ConversationId: ".concat(((String) (obj)));
            } else
            {
                obj = new String("getActiveConversationParticipants ConversationId: ");
            }
            ebw.b("Babel_db", ((String) (obj)));
        }
        obj = new eaz();
        s1 = b.a("conversation_participants_view", new String[] {
            "gaia_id", "chat_id", "phone_id"
        }, "conversation_id=? AND active=?", new String[] {
            s1, "1"
        }, null);
        while (s1.moveToNext()) 
        {
            ((eaz) (obj)).add(new cey(s1.getString(0), s1.getString(1)));
        }
          goto _L1
        exception;
        obj = s1;
        s1 = exception;
_L3:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw s1;
_L1:
        if (s1 != null)
        {
            s1.close();
        }
        return ((eaz) (obj));
        s1;
        obj = null;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public void M(String s1)
    {
        ebw.a("Babel_db", "deleteSuggestedEntity");
        ceu ceu1 = N(s1);
        b.a("suggested_contacts", "gaia_id=?", new String[] {
            s1
        });
        if (ceu1 != null)
        {
            a(s1, ceu1.e, ceu1.h);
        }
        ((bzt)hgx.a(e, bzt)).a(f().h());
        e.getContentResolver().notifyChange(EsProvider.i, null);
    }

    public ceu N(String s1)
    {
        Object obj;
        obj = null;
        if (a)
        {
            ebw.b("Babel_db", "getSuggestedEntityByGaiaId");
        }
        Cursor cursor = b.a("suggested_contacts", g, "gaia_id=?", new String[] {
            s1
        }, null);
        s1 = obj;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        s1 = obj;
        if (cursor.moveToNext())
        {
            s1 = g.a(new cey(cursor.getString(0), cursor.getString(1)), cursor.getString(2), cursor.getString(3), null, cursor.getString(4), cursor.getString(5));
        }
        if (cursor != null)
        {
            cursor.close();
        }
        return s1;
        s1;
        cursor = null;
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
        throw s1;
        s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public long O(String s1)
    {
        return o(s1, 0L);
    }

    public long P(String s1)
    {
        return b(s1, 1);
    }

    public aok Q(String s1)
    {
        Object obj1 = null;
        if (a)
        {
            Object obj = String.valueOf(s1);
            if (((String) (obj)).length() != 0)
            {
                obj = "getTimestamps, conversationId=".concat(((String) (obj)));
            } else
            {
                obj = new String("getTimestamps, conversationId=");
            }
            ebw.b("Babel_db", ((String) (obj)));
        }
        obj = b;
        s1 = String.valueOf(s1);
        s1 = ((apd) (obj)).a("conversations", new String[] {
            "sort_timestamp", "self_watermark"
        }, "conversation_id=?", new String[] {
            s1
        }, null);
        obj = obj1;
        if (s1.moveToFirst())
        {
            obj = new aok(s1.getLong(0), s1.getLong(1));
        }
        if (s1 != null)
        {
            s1.close();
        }
        return ((aok) (obj));
        Exception exception;
        exception;
        s1 = null;
_L2:
        if (s1 != null)
        {
            s1.close();
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public long R(String s1)
    {
        return a("getSortTimestamp", s1, "sort_timestamp", 0L);
    }

    public long S(String s1)
    {
        return a(an(s1));
    }

    public int T(String s1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("notified_for_failure", Integer.valueOf(1));
        if (TextUtils.isEmpty(s1))
        {
            return b.a("messages", contentvalues, "notified_for_failure=?", new String[] {
                "0"
            });
        } else
        {
            return b.a("messages", contentvalues, "notified_for_failure=? AND conversation_id=?", new String[] {
                "0", s1
            });
        }
    }

    public void U(String s1)
    {
        ContentValues contentvalues;
        contentvalues = new ContentValues();
        b.a();
        contentvalues.put("alert_status", Integer.valueOf(2));
        b.a("messages", contentvalues, "conversation_id=? AND alert_status=?", new String[] {
            s1, "1"
        });
        contentvalues.clear();
        contentvalues.put("alert_status", Integer.valueOf(4));
        b.a("messages", contentvalues, "conversation_id=? AND alert_status=?", new String[] {
            s1, "3"
        });
        b.b();
        b.c();
        return;
        s1;
        b.c();
        throw s1;
    }

    public void V(String s1)
    {
        if (a)
        {
            Object obj = String.valueOf(s1);
            if (((String) (obj)).length() != 0)
            {
                obj = "confirmConversationInvite, conversationId=".concat(((String) (obj)));
            } else
            {
                obj = new String("confirmConversationInvite, conversationId=");
            }
            ebw.b("Babel_db", ((String) (obj)));
        }
        a();
        obj = new ContentValues();
        ((ContentValues) (obj)).put("status", Integer.valueOf(2));
        ((ContentValues) (obj)).put("disposition", Integer.valueOf(0));
        ((ContentValues) (obj)).put("notification_level", Integer.valueOf(30));
        b.a("conversations", ((ContentValues) (obj)), "conversation_id=?", new String[] {
            s1
        });
        any.a(f().h());
        b();
        c();
        return;
        s1;
        c();
        throw s1;
    }

    public String W(String s1)
    {
        String s2;
        Cursor cursor;
        s2 = null;
        cursor = e().a("conversations", z, "conversation_id=?", new String[] {
            s1
        }, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToFirst() || cursor.getInt(0) != 1) goto _L2; else goto _L3
_L3:
        Object obj;
        obj = J(s1);
        s1 = f().b();
        obj = ((List) (obj)).iterator();
_L6:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L4
_L4:
        cey cey1 = ((ceu)((Iterator) (obj)).next()).b;
        if (s1.equals(cey1)) goto _L6; else goto _L5
_L5:
        s2 = cey1.a;
        s1 = s2;
        if (cursor != null)
        {
            cursor.close();
            s1 = s2;
        }
_L8:
        return s1;
_L2:
        s1 = s2;
        if (cursor == null) goto _L8; else goto _L7
_L7:
        cursor.close();
        return null;
        s1;
        if (cursor != null)
        {
            cursor.close();
        }
        throw s1;
    }

    public long X(String s1)
    {
        return a("getConversationPendingStatus", s1, "is_pending_leave", 0L);
    }

    public boolean Y(String s1)
    {
        s1 = b.a("conversations", new String[] {
            "is_pending_leave"
        }, "conversation_id=?", new String[] {
            s1
        }, null);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        long l1;
        if (!s1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        l1 = s1.getLong(0);
        boolean flag;
        if ((l1 & 3L) != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (s1 != null)
        {
            s1.close();
        }
        return flag;
        if (s1 != null)
        {
            s1.close();
        }
        return false;
        Exception exception;
        exception;
        s1 = null;
_L2:
        if (s1 != null)
        {
            s1.close();
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String Z(String s1)
    {
        return b("getSmsServiceCenter", s1, "sms_service_center");
    }

    public int a(String s1, dqc dqc1)
    {
        if (a)
        {
            String s2 = String.valueOf(dqc1);
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 53 + String.valueOf(s2).length())).append("deleteMessagesFromConversation, conversationId=").append(s1).append(" type=").append(s2).toString());
        }
        return b.a("messages", "conversation_id=? AND type=?", new String[] {
            s1, String.valueOf(dqc1.ordinal())
        });
    }

    public long a(int i1)
    {
        Object obj;
        Object obj1;
        ebw.a("Babel_db", "queryLoadConversationsBefore");
        obj1 = "conversation_id NOT LIKE 'client_generated:%' AND sort_timestamp> 0 AND transport_type!=3";
        obj = obj1;
        i1;
        JVM INSTR tableswitch 1 4: default 165
    //                   1 48
    //                   2 118
    //                   3 170
    //                   4 125;
           goto _L1 _L2 _L3 _L4 _L5
_L2:
        obj1 = b.a("conversations", new String[] {
            "MIN(sort_timestamp)"
        }, ((String) (obj)), null, null);
        if (!((Cursor) (obj1)).moveToFirst()) goto _L7; else goto _L6
_L6:
        long l1 = ((Cursor) (obj1)).getLong(0);
        long l2 = l1;
        if (l1 == 0L)
        {
            l2 = -1L;
        }
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return l2;
_L3:
        obj = "conversation_id NOT LIKE 'client_generated:%' AND sort_timestamp> 0 AND transport_type!=3 AND view=2";
        continue; /* Loop/switch isn't completed */
_L5:
        obj = "conversation_id NOT LIKE 'client_generated:%' AND sort_timestamp> 0 AND transport_type!=3 AND view=1 AND status=1 AND inviter_affinity=2";
        continue; /* Loop/switch isn't completed */
_L7:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return -1L;
        obj;
        obj1 = null;
_L8:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
        obj;
        if (true) goto _L8; else goto _L1
_L1:
        obj = obj1;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = "conversation_id NOT LIKE 'client_generated:%' AND sort_timestamp> 0 AND transport_type!=3 AND view=1 AND status=1 AND inviter_affinity=1";
        if (true) goto _L2; else goto _L9
_L9:
    }

    public long a(ContentValues contentvalues)
    {
        if (a)
        {
            ebw.b("Babel_db", "insertMmsNotification");
        }
        b.a();
        long l1;
        l1 = b.a("mms_notification_inds", contentvalues);
        b.b();
        b.c();
        return l1;
        contentvalues;
        b.c();
        throw contentvalues;
    }

    public long a(aol aol1)
    {
        int i1 = aol1.f;
        long l1 = aol1.d;
        ebw.c("Babel", (new StringBuilder(69)).append("Creating suggestion type: ").append(i1).append(" timestamp: ").append(l1).toString());
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("conversation_id", aol1.a);
        contentvalues.put("event_id", aol1.b);
        contentvalues.put("suggestion_id", aol1.c);
        contentvalues.put("timestamp", Long.valueOf(aol1.d));
        contentvalues.put("expiration_time_usec", Long.valueOf(aol1.e));
        contentvalues.put("type", Integer.valueOf(aol1.f));
        contentvalues.put("gem_asset_url", aol1.g);
        contentvalues.put("gem_horizontal_alignment", Integer.valueOf(aol1.h));
        contentvalues.put("matched_message_substring", aol1.i);
        l1 = b.a("event_suggestions", contentvalues);
        if (l1 > -1L)
        {
            any.e(this, aol1.a);
        }
        return l1;
    }

    public long a(aor aor1)
    {
        Object obj2;
        Long long1;
label0:
        {
label1:
            {
                if (a)
                {
                    String s1 = aor1.c;
                    String s2 = String.valueOf(aor1.f);
                    String s5 = aor1.a;
                    ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 68 + String.valueOf(s2).length() + String.valueOf(s5).length())).append("createMessage, conversationId ").append(s1).append(", senderId=").append(s2).append(", messageClientGeneratedId=").append(s5).toString());
                }
                long1 = g(aor1.c, aor1.a);
                Object obj = null;
                Object obj1 = f(aor1.c, aor1.a);
                if (long1 != null && obj1 != null)
                {
                    if (a)
                    {
                        obj = String.valueOf("createMessage called for a message already in the database. message id: ");
                        obj1 = aor1.a;
                        String s6 = aor1.c;
                        int i1 = aor1.x;
                        ebw.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 52 + String.valueOf(obj1).length() + String.valueOf(s6).length())).append(((String) (obj))).append(((String) (obj1))).append(" conversationId: ").append(s6).append(" new notification level ").append(i1).toString());
                    }
                    if (aor1.x > 10)
                    {
                        obj = new ContentValues();
                        ((ContentValues) (obj)).put("notification_level", Integer.valueOf(aor1.x));
                        if (aor1.R > 0L)
                        {
                            ((ContentValues) (obj)).put("last_seen_timestamp", Long.valueOf(aor1.R));
                        }
                        b.a("messages", ((ContentValues) (obj)), "_id=?", new String[] {
                            long1.toString()
                        });
                    }
                    return g.a(long1, 0L);
                }
                if (aor1.b != null)
                {
                    obj = g(aor1.c, aor1.b);
                    if (obj != null)
                    {
                        if (a || ebw.a("Babel", 3))
                        {
                            obj1 = aor1.c;
                            String s7 = aor1.a;
                            ebw.d("Babel", (new StringBuilder(String.valueOf(obj1).length() + 75 + String.valueOf(s7).length())).append("createMessage found clientGeneratedId ").append(((String) (obj1))).append(", messageId ").append(s7).append(" -- fixing up the message").toString());
                        }
                        obj1 = f(aor1.c, aor1.b);
                        if (obj1 != null)
                        {
                            a(aor1.c, aor1.i, g.a(((Long) (obj1)), 0L));
                        }
                    }
                }
                obj2 = aor1.c;
                obj1 = obj2;
                if (!ak(((String) (obj2))))
                {
                    if (!((String) (obj2)).startsWith("client_generated:"))
                    {
                        break label1;
                    }
                    obj2 = RealTimeChatService.a(((String) (obj2)));
                    if (obj2 == null || !ak(((String) (obj2))))
                    {
                        obj = aor1.c;
                        aor1 = aor1.a;
                        ebw.g("Babel_db", (new StringBuilder(String.valueOf(obj).length() + 70 + String.valueOf(aor1).length())).append("Messaging: skip message because conversation doesn't exist:").append(((String) (obj))).append(" messageId:").append(aor1).toString());
                        gbh.a("Messaging: skip message because conversation doesn't exist isClientGeneratedId=true");
                        return -1L;
                    }
                    obj1 = obj2;
                    if (a)
                    {
                        obj1 = aor1.c;
                        ebw.b("Babel_db", (new StringBuilder(String.valueOf(obj1).length() + 43 + String.valueOf(obj2).length())).append("Messaging: conversationId changed from ").append(((String) (obj1))).append(" to ").append(((String) (obj2))).toString());
                        obj1 = obj2;
                    }
                }
                int j1;
                if (a && aor1.b != null)
                {
                    obj2 = String.valueOf(aor1.a);
                    if (((String) (obj2)).length() != 0)
                    {
                        obj2 = "Messaging: saving message:".concat(((String) (obj2)));
                    } else
                    {
                        obj2 = new String("Messaging: saving message:");
                    }
                    ebw.b("Babel_db", ((String) (obj2)));
                }
                obj2 = new ContentValues();
                ((ContentValues) (obj2)).put("message_id", aor1.a);
                ((ContentValues) (obj2)).put("conversation_id", ((String) (obj1)));
                if (aor1.f != null)
                {
                    ((ContentValues) (obj2)).put("author_chat_id", aor1.f.b);
                    ((ContentValues) (obj2)).put("author_gaia_id", aor1.f.a);
                }
                ((ContentValues) (obj2)).put("text", aor1.g);
                ((ContentValues) (obj2)).put("status", Integer.valueOf(aor1.h));
                ((ContentValues) (obj2)).put("notification_level", Integer.valueOf(aor1.x));
                if (aor1.w)
                {
                    j1 = dqc.b.ordinal();
                } else
                {
                    j1 = dqc.c.ordinal();
                }
                ((ContentValues) (obj2)).put("type", Integer.valueOf(j1));
                ((ContentValues) (obj2)).put("transport_type", Integer.valueOf(aor1.d));
                ((ContentValues) (obj2)).put("transport_phone", aor1.e);
                ((ContentValues) (obj2)).put("timestamp", Long.valueOf(aor1.i));
                ((ContentValues) (obj2)).put("width_pixels", Integer.valueOf(aor1.A));
                ((ContentValues) (obj2)).put("height_pixels", Integer.valueOf(aor1.B));
                ((ContentValues) (obj2)).put("image_id", aor1.j);
                ((ContentValues) (obj2)).put("album_id", aor1.l);
                ((ContentValues) (obj2)).put("image_rotation", Integer.valueOf(aor1.m));
                if (!TextUtils.isEmpty(aor1.j))
                {
                    obj1 = aj(aor1.j);
                    if (obj1 != null)
                    {
                        if (((cww) (obj1)).c != null)
                        {
                            obj1 = String.valueOf(((cww) (obj1)).c);
                            if (((String) (obj1)).length() != 0)
                            {
                                obj1 = "file://".concat(((String) (obj1)));
                            } else
                            {
                                obj1 = new String("file://");
                            }
                            ((ContentValues) (obj2)).put("local_url", ((String) (obj1)));
                        } else
                        {
                            String s3 = String.valueOf(aor1.j);
                            if (s3.length() != 0)
                            {
                                s3 = "sticker://".concat(s3);
                            } else
                            {
                                s3 = new String("sticker://");
                            }
                            ((ContentValues) (obj2)).put("local_url", s3);
                        }
                    } else
                    if (!TextUtils.isEmpty(aor1.k) && aor1.k.equals(g.a(e, "babel_stickers_account_id", "108618507921641169817")))
                    {
                        String s4 = String.valueOf(aor1.j);
                        if (s4.length() != 0)
                        {
                            s4 = "sticker://".concat(s4);
                        } else
                        {
                            s4 = new String("sticker://");
                        }
                        ((ContentValues) (obj2)).put("local_url", s4);
                    }
                }
                if (aor1.n != null)
                {
                    if (aor1.n.startsWith("content://"))
                    {
                        ((ContentValues) (obj2)).put("local_url", aor1.n);
                    } else
                    {
                        ((ContentValues) (obj2)).put("remote_url", aor1.n);
                    }
                }
                ((ContentValues) (obj2)).put("attachment_name", aor1.o);
                ((ContentValues) (obj2)).put("attachment_description", aor1.p);
                ((ContentValues) (obj2)).put("attachment_target_url", aor1.t);
                ((ContentValues) (obj2)).put("attachment_target_url_name", aor1.u);
                ((ContentValues) (obj2)).put("attachment_target_url_description", aor1.v);
                ((ContentValues) (obj2)).put("attachment_content_type", aor1.C);
                ((ContentValues) (obj2)).put("latitude", Double.valueOf(aor1.q));
                ((ContentValues) (obj2)).put("longitude", Double.valueOf(aor1.r));
                ((ContentValues) (obj2)).put("address", aor1.s);
                if (aor1.y > 0L)
                {
                    ((ContentValues) (obj2)).put("expiration_timestamp", Long.valueOf(aor1.y));
                }
                ((ContentValues) (obj2)).put("off_the_record", Boolean.valueOf(aor1.z));
                if (aor1.D != null)
                {
                    ((ContentValues) (obj2)).put("external_ids", aor1.D);
                }
                ((ContentValues) (obj2)).put("sms_timestamp_sent", Long.valueOf(aor1.E));
                ((ContentValues) (obj2)).put("sms_priority", Integer.valueOf(aor1.F));
                ((ContentValues) (obj2)).put("sms_message_size", Long.valueOf(aor1.G));
                ((ContentValues) (obj2)).put("mms_subject", aor1.H);
                if (aor1.I != null)
                {
                    ((ContentValues) (obj2)).put("sms_raw_sender", aor1.I);
                }
                if (aor1.J != null)
                {
                    ((ContentValues) (obj2)).put("sms_raw_recipients", aor1.J);
                }
                ((ContentValues) (obj2)).put("persisted", Boolean.valueOf(aor1.K));
                ((ContentValues) (obj2)).put("sms_message_status", Integer.valueOf(aor1.L));
                ((ContentValues) (obj2)).put("sms_type", Integer.valueOf(aor1.M));
                ((ContentValues) (obj2)).put("forwarded_mms_url", aor1.N);
                ((ContentValues) (obj2)).put("forwarded_mms_count", Integer.valueOf(aor1.O));
                ((ContentValues) (obj2)).put("sending_error", Integer.valueOf(aor1.P));
                ((ContentValues) (obj2)).put("voicemail_length", Integer.valueOf(aor1.Q));
                if (aor1.R > 0L)
                {
                    ((ContentValues) (obj2)).put("last_seen_timestamp", Long.valueOf(aor1.R));
                }
                if (obj != null)
                {
                    b.a("messages", ((ContentValues) (obj2)), "_id=?", new String[] {
                        ((Long) (obj)).toString()
                    });
                    return g.a(((Long) (obj)), 0L);
                }
                break label0;
            }
            obj = aor1.c;
            aor1 = aor1.a;
            ebw.g("Babel_db", (new StringBuilder(String.valueOf(obj).length() + 70 + String.valueOf(aor1).length())).append("Messaging: skip message because conversation doesn't exist:").append(((String) (obj))).append(" messageId:").append(aor1).toString());
            gbh.a("Messaging: skip message because conversation doesn't exist isClientGeneratedId=false");
            return -1L;
        }
        if (long1 != null)
        {
            b.a("messages", ((ContentValues) (obj2)), "_id=?", new String[] {
                long1.toString()
            });
            return g.a(long1, 0L);
        } else
        {
            return b.a("messages", ((ContentValues) (obj2)));
        }
    }

    public long a(aot aot1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("conversation_id", aot1.a);
        contentvalues.put("message_id", aot1.b);
        contentvalues.put("url", aot1.c);
        contentvalues.put("content_type", aot1.d);
        contentvalues.put("width", Integer.valueOf(aot1.e));
        contentvalues.put("height", Integer.valueOf(aot1.f));
        return b.a("multipart_attachments", contentvalues);
    }

    public long a(String s1, String s2, dqb dqb1, cey cey1, dqc dqc1, long l1, 
            long l2, int i1, String s3, String s4)
    {
        return a(s1, s2, dqb1, cey1, dqc1, l1, l2, 0L, i1, s3, s4, 0, ((String) (null)));
    }

    public long a(String s1, String s2, dqb dqb1, cey cey1, dqc dqc1, long l1, 
            long l2, long l3, int i1, String s3, String s4, 
            int j1, String s5)
    {
        if (a)
        {
            String s6 = String.valueOf(dqc1);
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 68 + String.valueOf(s6).length())).append("insertSystemMessage: conversationId=").append(s1).append("; type ").append(s6).append("; ts ").append(l1).toString());
        }
        Long long1 = g(s1, s2);
        Object obj = long1;
        if (long1 == null)
        {
            obj = new ContentValues();
            ((ContentValues) (obj)).put("message_id", s2);
            ((ContentValues) (obj)).put("conversation_id", s1);
            ((ContentValues) (obj)).put("author_chat_id", cey1.b);
            ((ContentValues) (obj)).put("author_gaia_id", cey1.a);
            ((ContentValues) (obj)).put("status", Integer.valueOf(dqb1.ordinal()));
            ((ContentValues) (obj)).put("type", Integer.valueOf(dqc1.ordinal()));
            ((ContentValues) (obj)).put("timestamp", Long.valueOf(l1));
            if (l2 > 0L)
            {
                ((ContentValues) (obj)).put("expiration_timestamp", Long.valueOf(l2));
            }
            if (l3 > 0L)
            {
                ((ContentValues) (obj)).put("delete_after_read_timetamp", Long.valueOf(l3));
            }
            ((ContentValues) (obj)).put("notification_level", Integer.valueOf(i1));
            if (s3 != null)
            {
                ((ContentValues) (obj)).put("new_conversation_name", s3);
            }
            if (s4 != null)
            {
                ((ContentValues) (obj)).put("participant_keys", s4);
            }
            ((ContentValues) (obj)).put("call_media_type", Integer.valueOf(j1));
            if (!TextUtils.isEmpty(s5))
            {
                ((ContentValues) (obj)).put("text", s5);
            }
            obj = Long.valueOf(b.a("messages", ((ContentValues) (obj))));
        }
        return g.a(((Long) (obj)), 0L);
    }

    public Cursor a(String s1, dqb dqb1, String as[])
    {
        return b.a("messages", as, "conversation_id = ? AND status = ?", new String[] {
            s1, String.valueOf(dqb1.ordinal())
        }, "timestamp ASC");
    }

    public aop a(String s1, String s2, String s3, String s4)
    {
        ArrayList arraylist;
        if (a)
        {
            ao((new StringBuilder(String.valueOf(s1).length() + 38 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append("getExistingMergedConversationId ").append(s1).append(", ").append(s2).append(", ").append(s3).append(", ").append(s4).toString());
        }
        arraylist = new ArrayList();
        if (!TextUtils.isEmpty(s2))
        {
            arraylist.add(s2);
        }
        if (!TextUtils.isEmpty(s3))
        {
            arraylist.add(s3);
        }
        if (!TextUtils.isEmpty(s4))
        {
            arraylist.add(s4);
        }
        arraylist.add(s1);
        arraylist.size();
        JVM INSTR tableswitch 2 4: default 196
    //                   2 288
    //                   3 281
    //                   4 274;
           goto _L1 _L2 _L3 _L4
_L1:
        s1 = "conversation_id=?";
_L6:
        s3 = b.a("conversations", aon.a, s1, (String[])arraylist.toArray(new String[arraylist.size()]), null);
        if (s3.moveToFirst())
        {
            break; /* Loop/switch isn't completed */
        }
        if (a)
        {
            ao("getExistingMergedConversationId didn't find any matches");
        }
        s1 = new aop(null, false);
        s3.close();
        return s1;
_L4:
        s1 = "conversation_id IN (?, ?, ?, ?)";
        continue; /* Loop/switch isn't completed */
_L3:
        s1 = "conversation_id IN (?, ?, ?)";
        continue; /* Loop/switch isn't completed */
_L2:
        s1 = "conversation_id IN (?, ?)";
        if (true) goto _L6; else goto _L5
_L5:
        s2 = c(s3);
        if (!a)
        {
            break MISSING_BLOCK_LABEL_455;
        }
        s1 = String.valueOf(((aom) (s2)).a);
        if (s1.length() == 0) goto _L8; else goto _L7
_L7:
        s1 = "getExistingMergedConversationId found match ".concat(s1);
_L16:
        ao(s1);
        break MISSING_BLOCK_LABEL_455;
_L15:
        if (!s3.moveToNext()) goto _L10; else goto _L9
_L9:
        s4 = c(s3);
        if (!a) goto _L12; else goto _L11
_L11:
        s2 = String.valueOf(((aom) (s4)).a);
        if (s2.length() == 0) goto _L14; else goto _L13
_L13:
        s2 = "getExistingMergedConversationId found another conversation ".concat(s2);
_L17:
        ao(s2);
_L12:
        s1 = a(((aom) (s1)), ((aom) (s4)));
        boolean flag = true;
          goto _L15
_L8:
        s1 = new String("getExistingMergedConversationId found match ");
          goto _L16
        s1;
        s3.close();
        throw s1;
_L14:
        s2 = new String("getExistingMergedConversationId found another conversation ");
          goto _L17
_L10:
        s1 = new aop(s1, flag);
        s3.close();
        return s1;
        flag = false;
        s1 = s2;
          goto _L15
    }

    public aou a(cey cey1, boolean flag, int i1)
    {
        Object obj;
        obj = null;
        if (a)
        {
            String s1 = String.valueOf(cey1);
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 41)).append("queryOneToOneConversation, participantId ").append(s1).toString());
        }
        if (cey1 != null)
        {
            l(cey1.a, cey1.b);
        }
        Object obj1;
        String as[];
        obj1 = (new StringBuilder("select conversations.conversation_id")).append(", sort_timestamp, view").append(", transport_type, (select merge_key FROM merge_keys WHERE merge_keys.conversation_id=conversations.conversation_id) as merge_key ").append(" FROM conversations,conversation_participants_view").append(" WHERE conversation_participants_view.conversation_id").append("=conversations.conversation_id");
        as = new String[3];
        ((StringBuilder) (obj1)).append(" AND conversation_type=?");
        as[0] = "1";
        ((StringBuilder) (obj1)).append(" AND transport_type=?");
        as[1] = String.valueOf(i1);
        ((StringBuilder) (obj1)).append(" AND ");
        if (cey1 == null) goto _L2; else goto _L1
_L1:
        if (TextUtils.isEmpty(cey1.a)) goto _L2; else goto _L3
_L3:
        ((StringBuilder) (obj1)).append("gaia_id=?");
        as[2] = cey1.a;
_L9:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        ((StringBuilder) (obj1)).append(" AND is_temporary = 1");
        cey1 = b.a(((StringBuilder) (obj1)).toString(), as);
        if (!cey1.moveToFirst()) goto _L5; else goto _L4
_L4:
        obj1 = new aou();
        do
        {
            obj = cey1.getString(0);
            if (TextUtils.isEmpty(((aou) (obj1)).a) || ((aou) (obj1)).a.startsWith("client_generated:") && !((String) (obj)).startsWith("client_generated:"))
            {
                obj1.a = ((String) (obj));
                obj1.c = cey1.getLong(1);
                obj1.d = cey1.getInt(2);
                obj1.e = cey1.getInt(3);
                obj1.b = cey1.getString(4);
            }
            flag = cey1.moveToNext();
        } while (flag);
        obj = obj1;
        if (cey1 != null)
        {
            cey1.close();
            obj = obj1;
        }
_L11:
        return ((aou) (obj));
_L2:
        if (cey1 == null) goto _L7; else goto _L6
_L6:
        if (TextUtils.isEmpty(cey1.b)) goto _L7; else goto _L8
_L8:
        ((StringBuilder) (obj1)).append("chat_id=?");
        as[2] = cey1.b;
          goto _L9
        cey1;
        obj1 = null;
        obj = cey1;
_L12:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
_L7:
        cey1 = String.valueOf(cey1);
        ebw.g("Babel_db", (new StringBuilder(String.valueOf(cey1).length() + 23)).append("participantId is empty:").append(cey1).toString());
        gbh.a("participantId is empty");
        return null;
_L5:
        if (cey1 == null) goto _L11; else goto _L10
_L10:
        cey1.close();
        return null;
        obj;
        obj1 = cey1;
          goto _L12
    }

    public ceu a(dac dac1)
    {
        Object obj;
        obj = null;
        if (a)
        {
            String s1 = String.valueOf(dac1);
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 26)).append("getParticipantEntity for: ").append(s1).toString());
        }
        if (TextUtils.isEmpty(dac1.a)) goto _L2; else goto _L1
_L1:
        dac1 = b.a("participants_view", h, "gaia_id=?", new String[] {
            dac1.a
        }, null);
_L6:
        ceu ceu1;
        ceu1 = obj;
        if (dac1 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        ceu1 = obj;
        if (dac1.moveToNext())
        {
            ceu1 = a(((Cursor) (dac1)), ((String) (null)));
        }
        if (dac1 != null)
        {
            dac1.close();
        }
        return ceu1;
_L2:
        if (!TextUtils.isEmpty(dac1.b))
        {
            dac1 = b.a("participants_view", h, "chat_id=?", new String[] {
                dac1.b
            }, null);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_185;
        Exception exception;
        exception;
        dac1 = null;
_L4:
        if (dac1 != null)
        {
            dac1.close();
        }
        throw exception;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
        dac1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public String a(int i1, int j1, long l1, String s1, int k1)
    {
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(89)).append("insertConversation: conversationType=").append(i1).append(", temporaryTimestamp=").append(l1).toString());
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("conversation_type", Integer.valueOf(i1));
        contentvalues.put("is_pending_leave", Integer.valueOf(0));
        contentvalues.put("conversation_id", s1);
        contentvalues.put("status", Integer.valueOf(2));
        contentvalues.put("view", Integer.valueOf(k1));
        contentvalues.put("is_draft", Integer.valueOf(1));
        contentvalues.put("has_oldest_message", Integer.valueOf(1));
        contentvalues.put("call_media_type", Integer.valueOf(0));
        contentvalues.put("notification_level", Integer.valueOf(30));
        contentvalues.put("disposition", Integer.valueOf(3));
        contentvalues.put("transport_type", Integer.valueOf(j1));
        contentvalues.put("otr_status", Integer.valueOf(2));
        contentvalues.put("sort_timestamp", Long.valueOf(l1));
        b.a("conversations", contentvalues);
        return s1;
    }

    public String a(aoh aoh1)
    {
        String s2;
        s2 = aqc.e.a(aoh1.s);
        break MISSING_BLOCK_LABEL_11;
        String s1;
        cey cey1;
        int i1;
        while (true) 
        {
            do
            {
                return s2;
            } while (!((drw)hgx.a(e, drw)).b() || aoh1.b != 1 || aoh1.k == 1);
            if (aqc.d.b(aoh1.t))
            {
                return aoh1.t;
            }
            cey1 = f().b();
            Iterator iterator1 = aoh1.h.iterator();
            s1 = s2;
            i1 = 0;
label0:
            do
            {
label1:
                {
                    Object obj;
                    do
                    {
                        if (!iterator1.hasNext())
                        {
                            break label1;
                        }
                        obj = (ceu)iterator1.next();
                    } while (cey1.a(((ceu) (obj)).b));
                    i1++;
                    if (d(((ceu) (obj)).b) == 1)
                    {
                        break label0;
                    }
                    obj = a(((ceu) (obj)).b, ((ceu) (obj)).c);
                    if (obj != null)
                    {
                        s1 = ((String) (obj));
                    }
                }
            } while (true);
        }
        if (i1 > 1)
        {
            ebw.g("Babel", (new StringBuilder(65)).append("computeMergeKeyForConversation with > 1 participants: ").append(i1).toString());
            int j1 = aoh1.c;
            String s3 = aoh1.s;
            boolean flag = f().s();
            boolean flag1 = f().q();
            ebw.g("Babel", (new StringBuilder(String.valueOf(s3).length() + 79)).append("conv transport: ").append(j1).append("; id: ").append(s3).append("; isCarrierSms: ").append(flag).append("; isCarrierSmsOnly: ").append(flag1).toString());
            s3 = am(cey1.a);
            String s5 = am(cey1.b);
            ebw.g("Babel", (new StringBuilder(String.valueOf(s3).length() + 19 + String.valueOf(s5).length())).append("self gaia: ").append(s3).append("; chat: ").append(s5).toString());
            String s4;
            String s6;
            Object obj1;
            for (aoh1 = aoh1.h.iterator(); aoh1.hasNext(); ebw.g("Babel", (new StringBuilder(String.valueOf(s4).length() + 23 + String.valueOf(s6).length() + String.valueOf(obj1).length())).append("gaia: ").append(s4).append("; chat: ").append(s6).append("; phone: ").append(((String) (obj1))).toString()))
            {
                obj1 = (ceu)aoh1.next();
                s4 = am(((ceu) (obj1)).b());
                s6 = am(((ceu) (obj1)).c());
                obj1 = am(((ceu) (obj1)).c);
            }

            aoh1 = (gms)hgx.a(e, gms);
            String s7;
            int k1;
            for (Iterator iterator = aoh1.a().iterator(); iterator.hasNext(); ebw.g("Babel", (new StringBuilder(String.valueOf(s7).length() + 18)).append("Acct ").append(k1).append(": ").append(s7).toString()))
            {
                k1 = g.a((Integer)iterator.next(), -1);
                s7 = am(aoh1.a(k1).b("gaia_id"));
            }

            gbh.a((new StringBuilder(53)).append("participant count (not including self) is ").append(i1).toString());
        }
        return s1;
    }

    public String a(cey cey1)
    {
        Object obj1;
        obj1 = null;
        if (a)
        {
            String s1 = String.valueOf(cey1);
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 40)).append("queryParticipantFullName, participantId=").append(s1).toString());
        }
        cey1 = b("full_name", cey1);
        if (cey1 == null) goto _L2; else goto _L1
_L1:
        if (!cey1.moveToFirst()) goto _L2; else goto _L3
_L3:
        Object obj = cey1.getString(0);
        obj1 = obj;
        if (cey1 != null)
        {
            cey1.close();
            obj1 = obj;
        }
_L5:
        return ((String) (obj1));
_L2:
        if (cey1 == null) goto _L5; else goto _L4
_L4:
        cey1.close();
        return null;
        cey1;
        obj1 = null;
        obj = cey1;
_L7:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
        obj;
        obj1 = cey1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public String a(cey cey1, String s1)
    {
        Object obj;
        dme dme1;
        obj = null;
        dme1 = dme.a();
        if (TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        bhj bhj1 = b(s1, dme1);
        if (bhj1 == null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        if (d.q()) goto _L4; else goto _L3
_L3:
        cey1 = bhj1.b();
_L13:
        if (!TextUtils.isEmpty(cey1)) goto _L6; else goto _L5
_L5:
        long l1 = bhj1.a();
_L12:
        s1 = ebz.l(s1);
_L9:
        if (TextUtils.isEmpty(cey1)) goto _L8; else goto _L7
_L7:
        cey1 = aqc.b.a(cey1);
_L10:
        dme1.b();
        return cey1;
_L2:
        cey1 = cey1.a;
        l1 = -1L;
        s1 = null;
          goto _L9
_L8:
        if (l1 == -1L)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        cey1 = aqc.a.a(String.valueOf(l1));
          goto _L10
        cey1 = obj;
        if (TextUtils.isEmpty(s1)) goto _L10; else goto _L11
_L11:
        cey1 = aqc.c.a(s1);
          goto _L10
        cey1;
        dme1.b();
        throw cey1;
_L6:
        l1 = -1L;
          goto _L12
_L4:
        cey1 = null;
          goto _L13
        l1 = -1L;
        cey1 = null;
          goto _L12
    }

    public String a(String s1, List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        long l1;
        for (list = list.iterator(); list.hasNext(); stringbuilder.append(l1))
        {
            cey cey1 = (cey)list.next();
            l1 = a(s1, cey1.a, cey1.b, ((String) (null)), ((String) (null)), ((String) (null)));
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append('|');
            }
        }

        return stringbuilder.toString();
    }

    public String a(List list, int i1)
    {
        Cursor cursor;
        int j1 = 0;
        int k1 = list.size();
        StringBuilder stringbuilder = new StringBuilder();
        String as[] = new String[k1 + 1];
        k1 = list.size() - 1;
        while (k1 >= -1) 
        {
            cey cey1;
            Object obj;
            if (k1 == -1)
            {
                cey1 = d.b();
                obj = null;
            } else
            {
                obj = (ceu)list.get(k1);
                cey1 = ((ceu) (obj)).b;
                obj = ((ceu) (obj)).f();
            }
            if (j1 > 0)
            {
                stringbuilder.append(" OR ");
            }
            if (cey1 != null && !TextUtils.isEmpty(cey1.b))
            {
                stringbuilder.append("chat_id=?");
                int l1 = j1 + 1;
                as[j1] = cey1.b;
                j1 = l1;
            } else
            if (cey1 != null && !TextUtils.isEmpty(((CharSequence) (obj))))
            {
                stringbuilder.append("phone_id=?");
                int i2 = j1 + 1;
                as[j1] = ((String) (obj));
                j1 = i2;
            }
            k1--;
        }
        cursor = a(stringbuilder.toString(), as, i1);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        String s1;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_306;
        }
        s1 = cursor.getString(0);
        if (!a) goto _L2; else goto _L1
_L1:
        list = String.valueOf(s1);
        if (list.length() == 0)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        list = "queryGroupPhoneConversation found conversation ".concat(list);
_L3:
        ebw.b("Babel_db", list);
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
        return s1;
        list = new String("queryGroupPhoneConversation found conversation ");
          goto _L3
        list;
        if (cursor != null)
        {
            cursor.close();
        }
        throw list;
        if (cursor != null)
        {
            cursor.close();
        }
        return null;
    }

    public List a(int i1, int j1)
    {
        Object obj;
        Object obj1;
        if (a)
        {
            obj = String.valueOf(ebw.b(d.a()));
            Exception exception;
            if (((String) (obj)).length() != 0)
            {
                obj = "getConversationTimestamps: account=".concat(((String) (obj)));
            } else
            {
                obj = new String("getConversationTimestamps: account=");
            }
            ebw.b("Babel_db", ((String) (obj)));
        }
        obj = "transport_type!=3";
        if (j1 == -1) goto _L2; else goto _L1
_L1:
        if (j1 != 1) goto _L4; else goto _L3
_L3:
        obj = String.valueOf("status");
        obj1 = String.valueOf("inviter_affinity");
        obj = (new StringBuilder(String.valueOf("transport_type!=3").length() + 14 + String.valueOf(obj).length() + String.valueOf(obj1).length())).append("transport_type!=3").append(" AND ").append(((String) (obj))).append("=? AND ").append(((String) (obj1))).append("=?").toString();
        obj1 = new String[2];
        obj1[0] = String.valueOf(j1);
        obj1[1] = "1";
_L8:
        obj = b.a("conversations", w, ((String) (obj)), ((String []) (obj1)), null, null, "sort_timestamp DESC", String.valueOf(i1));
        obj1 = new ArrayList();
        for (; ((Cursor) (obj)).moveToNext(); ((List) (obj1)).add(Long.valueOf(((Cursor) (obj)).getLong(0)))) { }
          goto _L5
        exception;
        obj1 = obj;
        obj = exception;
_L6:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
_L4:
        obj = String.valueOf("status");
        obj = (new StringBuilder(String.valueOf("transport_type!=3").length() + 7 + String.valueOf(obj).length())).append("transport_type!=3").append(" AND ").append(((String) (obj))).append("=?").toString();
        obj1 = new String[1];
        obj1[0] = String.valueOf(j1);
        continue; /* Loop/switch isn't completed */
        obj;
        obj1 = null;
        if (true) goto _L6; else goto _L5
_L5:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return ((List) (obj1));
_L2:
        obj1 = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public List a(String s1, cey cey1)
    {
        gbh.b(cey1);
        gbh.b(cey1.a);
        Cursor cursor = b.a("conversation_participants_view", cex.a, "conversation_id=? AND gaia_id!=?", new String[] {
            s1, cey1.a
        }, null);
        ArrayList arraylist = new ArrayList();
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToNext()) goto _L2; else goto _L3
_L3:
        if (cursor != null) goto _L5; else goto _L4
_L4:
        s1 = null;
_L8:
        arraylist.add(s1);
          goto _L1
        s1;
        cey1 = cursor;
_L11:
        if (cey1 != null)
        {
            cey1.close();
        }
        throw s1;
_L5:
        cfa cfa1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        cfa1 = cfa.values()[cursor.getInt(8)];
        s2 = cursor.getString(1);
        s3 = cursor.getString(2);
        s4 = cursor.getString(3);
        s5 = cursor.getString(10);
        s6 = cursor.getString(4);
        s7 = cursor.getString(5);
        if (!TextUtils.isEmpty(null)) goto _L7; else goto _L6
_L6:
        s1 = cursor.getString(6);
_L9:
        String s8;
        String s9;
        s8 = cursor.getString(7);
        s9 = cursor.getString(11);
        if (cursor.getInt(9) == 0)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        cey1 = Boolean.TRUE;
_L10:
        s1 = g.a(cfa1, s2, s3, s4, s5, s6, s7, s1, s8, s9, cey1, 0);
          goto _L8
_L7:
        s1 = null;
          goto _L9
        cey1 = null;
          goto _L10
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
        return arraylist;
        s1;
        cey1 = null;
          goto _L11
    }

    public List a(boolean flag)
    {
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = new ArrayList();
        Cursor cursor = b.a("sticker_albums", k, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToNext()) goto _L2; else goto _L3
_L3:
        obj1 = new cwv();
        obj1.a = cursor.getString(0);
        obj1.b = cursor.getString(2);
        obj1.d = cursor.getInt(3);
        if (!flag) goto _L5; else goto _L4
_L4:
        obj1.e = new ArrayList();
        Object obj = b.a("sticker_photos", j, "album_id=?", new String[] {
            ((cwv) (obj1)).a
        }, null, null, null, null);
_L9:
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        cww cww1;
        if (!((Cursor) (obj)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cww1 = new cww();
        cww1.a = ((Cursor) (obj)).getString(0);
        cww1.b = ((Cursor) (obj)).getString(1);
        cww1.c = ((Cursor) (obj)).getString(2);
        cww1.d = ((Cursor) (obj)).getInt(3);
        if (!cww1.a.equals(cursor.getString(1))) goto _L7; else goto _L6
_L6:
        obj1.c = cww1;
_L11:
        ((cwv) (obj1)).e.add(cww1);
        if (true) goto _L9; else goto _L8
        obj2;
        obj1 = obj;
        obj = obj2;
_L14:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        ((Cursor) (obj1)).close();
        throw obj;
        obj;
        obj1 = cursor;
_L13:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
_L7:
        if (((cwv) (obj1)).c != null || cursor.getString(1) != null) goto _L11; else goto _L10
_L10:
        obj1.c = cww1;
          goto _L11
_L8:
        if (obj == null) goto _L5; else goto _L12
_L12:
        ((Cursor) (obj)).close();
_L5:
        ((List) (obj2)).add(obj1);
          goto _L1
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
        return ((List) (obj2));
        obj;
          goto _L13
        obj;
        obj1 = null;
          goto _L14
    }

    public void a()
    {
        b.a();
        f = f + 1;
    }

    public void a(int i1, int j1, long l1, String s1)
    {
        long l2;
        if (a)
        {
            ebw.d("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 127)).append("updateConversationOtrStatus, conversationId=").append(s1).append(", otrStatus=").append(i1).append(", otrToggle=").append(j1).append(", eventTimestamp=").append(l1).toString());
        }
        l2 = y(s1);
        if (l1 < l2) goto _L2; else goto _L1
_L1:
        ContentValues contentvalues;
        contentvalues = new ContentValues();
        contentvalues.put("otr_status", Integer.valueOf(i1));
        contentvalues.put("otr_toggle", Integer.valueOf(j1));
        contentvalues.put("last_otr_modification_time", Long.valueOf(l1));
        if (b.a("conversations", contentvalues, "conversation_id=?", new String[] {
            s1
        }) <= 0) goto _L4; else goto _L3
_L3:
        any.d(this);
_L6:
        return;
_L4:
        ebw.g("Babel_db", "updateConversationOtrState: failed to update database");
        return;
_L2:
        if (a)
        {
            ebw.d("Babel_db", (new StringBuilder(64)).append("dropping OTR update: ").append(l1).append(" < ").append(l2).toString());
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(int i1, long l1, String s1)
    {
        a();
        int k1;
        long l2;
        if (a)
        {
            String s2 = String.valueOf("updateConversationCallMediaType, conversationId ");
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s2).length() + 71 + String.valueOf(s1).length())).append(s2).append(s1).append(", callMediaType=").append(i1).append(", hangoutEventTimestamp=").append(l1).toString());
        }
        k1 = a("getCallMediaType", s1, "call_media_type", 0);
        l2 = a("getLastHangoutEventTime", s1, "last_hangout_event_time", -1L);
        int j1;
        j1 = i1;
        ContentValues contentvalues;
        if (i1 == -1)
        {
            if (k1 == 0)
            {
                j1 = 1;
            } else
            {
                j1 = k1;
            }
        }
          goto _L1
_L11:
        if (l1 < l2) goto _L3; else goto _L2
_L2:
        contentvalues = new ContentValues();
        contentvalues.put("call_media_type", Integer.valueOf(j1));
        if (l1 > n(s1).h)
        {
            contentvalues.put("has_video_notifications", Integer.valueOf(1));
        }
        if (i1 == k1)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        contentvalues.put("last_hangout_event_time", Long.valueOf(l1));
        b.a("conversations", contentvalues, "conversation_id=?", new String[] {
            s1
        });
        i1 = 1;
_L5:
        b();
        c();
        if (i1 != 0)
        {
            any.a(d);
        }
        return;
_L7:
        i1 = 0;
          goto _L4
_L9:
        k1 = 0;
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = 0;
          goto _L5
        s1;
        c();
        throw s1;
_L1:
        if (k1 == 0) goto _L7; else goto _L6
_L6:
        i1 = 1;
_L4:
        if (j1 == 0) goto _L9; else goto _L8
_L8:
        k1 = 1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public void a(long l1, int i1, int j1)
    {
        long l2 = l1;
        if (l1 == -2L)
        {
            l2 = l1;
            if (j1 > 0)
            {
                l2 = -3L;
            }
        }
        String s1 = EsProvider.a(i1);
        ank.b(e, f().h(), s1, l2);
    }

    public void a(long l1, int i1, long l2)
    {
        ContentValues contentvalues;
        contentvalues = new ContentValues();
        b.a();
        String s1;
        apd apd1;
        contentvalues.put("sms_message_status", Integer.valueOf(i1));
        contentvalues.put("sms_timestamp_sent", Long.valueOf(l2));
        apd1 = b;
        s1 = String.valueOf("_id=");
        String s2 = String.valueOf(String.valueOf(l1));
        if (s2.length() == 0)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        s1 = s1.concat(s2);
_L1:
        apd1.a("messages", contentvalues, s1, null);
        b.b();
        b.c();
        return;
        s1 = new String(s1);
          goto _L1
        Exception exception;
        exception;
        b.c();
        throw exception;
    }

    public void a(long l1, long l2)
    {
        if (a)
        {
            String s1 = String.valueOf("updateConversationScrollTime: scrollTime=");
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 70)).append(s1).append(l1).append(" scrollToConverationTimestamp=").append(l2).toString());
        }
        a();
        aoy aoy1;
        aoy aoy2;
        aoy1 = C();
        aoy2 = a(aoy1, l1, l2);
        if (aoy2 == aoy1)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        if (aoy2.a != aoy1.a)
        {
            g("first_peak_scroll_time", aoy2.a);
        }
        if (aoy2.b != aoy1.b)
        {
            g("first_peak_scroll_to_conversation_timestamp", aoy2.b);
        }
        if (aoy2.c != aoy1.c)
        {
            g("second_peak_scroll_time", aoy2.c);
        }
        if (aoy2.d != aoy1.d)
        {
            g("second_peak_scroll_to_conversation_timestamp", aoy2.d);
        }
        b();
        c();
        return;
        Exception exception;
        exception;
        c();
        throw exception;
    }

    public void a(long l1, dqb dqb1, long l2)
    {
        if (a)
        {
            String s1 = String.valueOf(dqb1);
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 94)).append("setMessageStatusTimestamp: messageRowId=").append(l1).append(", status=").append(s1).append(", ts=").append(l2).toString());
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("status", Integer.valueOf(dqb1.ordinal()));
        if (l2 >= 0L)
        {
            contentvalues.put("timestamp", Long.valueOf(l2));
        }
        if (dqb1 == dqb.b)
        {
            contentvalues.put("notified_for_failure", Integer.valueOf(0));
        }
        apd apd1 = b;
        dqb1 = String.valueOf("_id=");
        String s2 = String.valueOf(String.valueOf(l1));
        if (s2.length() != 0)
        {
            dqb1 = dqb1.concat(s2);
        } else
        {
            dqb1 = new String(dqb1);
        }
        apd1.a("messages", contentvalues, dqb1, null);
    }

    public void a(ani ani1, String s1, String s2, long l1, long l2, 
            int i1)
    {
        dfb dfb1 = new dfb();
        ArrayList arraylist = new ArrayList();
        cey cey1 = cey.a(s1);
        Iterator iterator = J(s2).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ceu ceu1 = (ceu)iterator.next();
            arraylist.add(ceu1.b);
            if (ceu1.b.a.equalsIgnoreCase(s1))
            {
                cey1 = ceu1.b;
            }
        } while (true);
        long l3;
        if (A(s2) == 1)
        {
            l3 = l2 + TimeUnit.DAYS.toMicros(1L);
        } else
        {
            l3 = 0L;
        }
        s1 = a(s2, ((List) (arraylist)));
        a(s2, String.valueOf(l1), dqb.e, cey1, dqc.h, l2, l3, i1, null, s1);
        if (i1 == 20)
        {
            dfb1.a(l2);
        } else
        {
            dfb1.f();
        }
        cej.a(e, ani1.h(), dfb1.g());
    }

    public void a(crv crv1)
    {
        if (ebw.a("Babel_db", 3))
        {
            String s1 = String.valueOf(crv1.a);
            ebw.c("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 42)).append("updateParticipantData  for participantId: ").append(s1).toString());
        }
        int i1 = a(crv1.a.a, crv1.a.b, crv1.b, ((String) (null)), crv1.c, true);
        if (i1 >= 0)
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("fallback_name", crv1.c);
            if (crv1.b != null)
            {
                contentvalues.put("participant_type", Integer.valueOf(cfa.d.ordinal()));
                contentvalues.put("phone_id", crv1.b);
            }
            b.a("participants", contentvalues, "_id=?", new String[] {
                Integer.toString(i1)
            });
            return;
        } else
        {
            String s2 = String.valueOf(crv1.a.toString());
            crv1 = crv1.c;
            ebw.g("Babel_db", (new StringBuilder(String.valueOf(s2).length() + 64 + String.valueOf(crv1).length())).append("updateParticipantData did not find db row for ").append(s2).append(" and fallbackName=").append(crv1).toString());
            gbh.a("updateParticipantData did not find db row");
            return;
        }
    }

    public void a(cxt cxt1)
    {
        Object obj4 = null;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        ContentValues contentvalues;
        int i1;
        boolean flag;
        if (a)
        {
            obj = String.valueOf(cxt1.k());
            String s1;
            String as[];
            if (((String) (obj)).length() != 0)
            {
                obj = "finalizeMessageFromResponse, conversationId ".concat(((String) (obj)));
            } else
            {
                obj = new String("finalizeMessageFromResponse, conversationId ");
            }
            ebw.b("Babel_db", ((String) (obj)));
        }
        s1 = cxt1.k();
        contentvalues = new ContentValues();
        contentvalues.put("message_id", cxt1.m());
        contentvalues.put("status", Integer.valueOf(dqb.e.ordinal()));
        contentvalues.put("type", Integer.valueOf(dqc.b.ordinal()));
        contentvalues.put("timestamp", Long.valueOf(cxt1.d));
        if (cxt1.c.b == 6)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            contentvalues.put("off_the_record", Boolean.valueOf(true));
        }
        if (i1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        contentvalues.put("persisted", Boolean.valueOf(flag));
        if (cxt1.n() > 0L)
        {
            contentvalues.put("expiration_timestamp", Long.valueOf(cxt1.n()));
        } else
        {
            contentvalues.putNull("expiration_timestamp");
        }
        if (cxt1.o().length > 0)
        {
            obj1 = cxt1.o()[0];
            contentvalues.put("image_id", ((String) (obj1)));
        } else
        {
            obj1 = null;
        }
        if (cxt1.p().length > 0)
        {
            contentvalues.put("album_id", cxt1.p()[0]);
        }
        if (cxt1.r().length > 0)
        {
            contentvalues.put("stream_id", cxt1.r()[0]);
        }
        as = new String[2];
        as[0] = String.valueOf(cxt1.l());
        as[1] = s1;
        if (cxt1.o().length <= 0) goto _L2; else goto _L1
_L1:
        obj = cxt1.q()[0];
        if (obj1 != null)
        {
            obj3 = aj(((String) (obj1)));
            if (obj3 != null)
            {
                aq(((String) (obj1)));
                if (((cww) (obj3)).c != null)
                {
                    obj = String.valueOf(((cww) (obj3)).c);
                    if (((String) (obj)).length() != 0)
                    {
                        obj = "file://".concat(((String) (obj)));
                    } else
                    {
                        obj = new String("file://");
                    }
                    obj1 = obj;
                    obj2 = obj;
                } else
                {
                    obj1 = String.valueOf(obj1);
                    if (((String) (obj1)).length() != 0)
                    {
                        obj2 = "sticker://".concat(((String) (obj1)));
                        obj1 = obj;
                    } else
                    {
                        obj2 = new String("sticker://");
                        obj1 = obj;
                    }
                }
                contentvalues.put("local_url", ((String) (obj2)));
                obj = obj1;
                obj1 = obj3;
            } else
            {
                obj1 = obj3;
            }
        } else
        {
            obj1 = null;
        }
        contentvalues.put("remote_url", ((String) (obj)));
        obj2 = obj;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_512;
        }
        obj2 = obj;
        if (cxt1.s())
        {
            break MISSING_BLOCK_LABEL_512;
        }
        obj1 = obj4;
        obj3 = b.a("messages", s, "message_id=? AND conversation_id=?", as, null);
        obj1 = obj3;
        if (!((Cursor) (obj3)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_494;
        }
        obj1 = obj3;
        obj2 = ((Cursor) (obj3)).getString(0);
        obj1 = obj3;
        if (TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            break MISSING_BLOCK_LABEL_494;
        }
        obj1 = obj3;
        obj2 = Uri.parse(((String) (obj2)));
        obj1 = obj3;
        if (!TextUtils.equals(((Uri) (obj2)).getAuthority(), EsProvider.a))
        {
            break MISSING_BLOCK_LABEL_494;
        }
        obj1 = obj3;
        e.getContentResolver().delete(((Uri) (obj2)), null, null);
        obj2 = obj;
        if (obj3 != null)
        {
            ((Cursor) (obj3)).close();
            obj2 = obj;
        }
_L4:
        if (a)
        {
            obj = String.valueOf(String.valueOf(cxt1.l()));
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 30 + String.valueOf(obj).length())).append("finalizeMessageFromResponse: ").append(s1).append(" ").append(((String) (obj))).toString());
        }
        if (b.a("messages", contentvalues, "message_id=? AND conversation_id=?", as) == 0)
        {
            as[0] = String.valueOf(cxt1.m());
            if (b.a("messages", contentvalues, "message_id=? AND conversation_id=?", as) == 0)
            {
                obj = cxt1.l();
                cxt1 = cxt1.m();
                ebw.g("Babel_db", (new StringBuilder(String.valueOf(obj).length() + 68 + String.valueOf(cxt1).length())).append("Failed to update the given message with client id: ").append(((String) (obj))).append(" and message id: ").append(cxt1).toString());
                gbh.a("Failed to update the given message with client id");
            }
        }
        if (obj2 != null)
        {
            contentvalues.clear();
            contentvalues.put("snippet_image_url", ((String) (obj2)));
            i1 = b.a("conversations", contentvalues, "conversation_id=?", new String[] {
                s1
            });
            if (i1 != 1)
            {
                ebw.g("Babel", (new StringBuilder(String.valueOf(s1).length() + 84)).append("couldn't update remote url for conversation; got count ").append(i1).append(" for conversation ").append(s1).toString());
                gbh.a("couldn't update remote url for conversation");
            }
        }
        return;
        cxt1;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw cxt1;
_L2:
        obj2 = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(cyw cyw1)
    {
        if (a)
        {
            String s1 = String.valueOf("insertNewConversation -- conversationId: ");
            String s2 = cyw1.c;
            String s3 = cyw1.b;
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 8 + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s1).append(s2).append(", name: ").append(s3).toString());
        }
        ContentValues contentvalues = b(cyw1);
        if (!cyw1.a())
        {
            contentvalues.put("sort_timestamp", Long.valueOf(cyw1.r));
        }
        contentvalues.put("is_pending_leave", Integer.valueOf(0));
        contentvalues.put("conversation_id", cyw1.c);
        b.a("conversations", contentvalues);
    }

    public void a(dme dme1, ceu ceu1)
    {
        dme1 = a(dme1, ceu1.c, ceu1.e, ceu1.h);
        ceu1.a(((aov) (dme1)).a, ((aov) (dme1)).b);
    }

    public void a(String s1, int i1)
    {
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 78)).append("setConversationNotificationLevel, conversationId=").append(s1).append("notificationLevel=").append(i1).toString());
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("notification_level", Integer.valueOf(i1));
        b.a("conversations", contentvalues, "conversation_id=?", new String[] {
            s1
        });
        any.d(this);
    }

    public void a(String s1, int i1, cyw cyw1)
    {
        if (a)
        {
            Object obj = cyw1.c;
            Object obj1;
            boolean flag;
            if (!s1.equals(cyw1.c))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj1 = cyw1.b;
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 85 + String.valueOf(obj).length() + String.valueOf(obj1).length())).append("updateExistingConversation -- currentId: ").append(s1).append(", conversationId: ").append(((String) (obj))).append(", is_new_id: ").append(flag).append(", name: ").append(((String) (obj1))).toString());
        }
        obj = b(cyw1);
        if (i1 == 2 && cyw1.k == 1)
        {
            ((ContentValues) (obj)).put("status", Integer.valueOf(2));
        }
        if (!s1.equals(cyw1.c))
        {
            ((ContentValues) (obj)).put("conversation_id", cyw1.c);
            obj1 = g(s1, s1);
            if (obj1 != null)
            {
                f(g.a(((Long) (obj1)), 0L));
            }
        }
        if (cyw1.k != 1)
        {
            ((ContentValues) (obj)).put("disposition", Integer.valueOf(0));
        }
        a(s1, cyw1.c, ((ContentValues) (obj)));
    }

    public void a(String s1, long l1)
    {
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 81)).append("insertPlaceholderConversation: conversationId=").append(s1).append(" seenTimestamp=").append(l1).toString());
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("conversation_id", s1);
        contentvalues.put("is_pending_leave", Integer.valueOf(0));
        contentvalues.put("metadata_present", Integer.valueOf(0));
        contentvalues.put("chat_watermark", Long.valueOf(l1));
        contentvalues.put("hangout_watermark", Long.valueOf(l1));
        b.a("conversations", contentvalues);
    }

    public void a(String s1, long l1, long l2)
    {
        Object obj;
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 105)).append("setTimestampsForPendingSentMessages, conversationId=").append(s1).append(", ts=").append(l1).append(", orgTs=").append(l2).toString());
        }
        obj = new ContentValues();
        apd apd1 = b;
        String s2 = String.valueOf("conversation_id=? AND (status=");
        int i1 = dqb.c.ordinal();
        String s3 = String.valueOf("timestamp");
        String s4 = String.valueOf("timestamp");
        s2 = (new StringBuilder(String.valueOf(s2).length() + 26 + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s2).append(i1).append(") AND ").append(s3).append(">? AND ").append(s4).append("<?").toString();
        s1 = apd1.a("messages", new String[] {
            "_id"
        }, s2, new String[] {
            s1, String.valueOf(l2), String.valueOf(l1)
        }, "timestamp ASC");
        ((ContentValues) (obj)).clear();
_L3:
        if (!s1.moveToNext()) goto _L2; else goto _L1
_L1:
        l1++;
        ((ContentValues) (obj)).put("timestamp", Long.valueOf(l1));
        b.a("messages", ((ContentValues) (obj)), "_id=?", new String[] {
            String.valueOf(s1.getLong(0))
        });
          goto _L3
        Exception exception;
        exception;
        obj = s1;
        s1 = exception;
_L5:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw s1;
_L2:
        if (s1 != null)
        {
            s1.close();
        }
        return;
        s1;
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void a(String s1, long l1, long l2, long l3)
    {
        long l4 = m(s1);
        if (l4 == l1)
        {
            if (a)
            {
                ebw.b("Babel_db", (new StringBuilder(105)).append("updateLatestMessageTimestamp. Local timestamp ").append(l1).append(". Server timestamp ").append(l2).toString());
            }
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("latest_message_timestamp", Long.valueOf(l2));
            if (l3 > 0L)
            {
                contentvalues.put("latest_message_expiration_timestamp", Long.valueOf(l3));
            } else
            {
                contentvalues.putNull("latest_message_expiration_timestamp");
            }
            b.a("conversations", contentvalues, "conversation_id=?", new String[] {
                String.valueOf(s1)
            });
        } else
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(133)).append("updateLatestMessageTimestamp skipped. Local timestamp for message ").append(l1).append(". Latest message timestamp ").append(l4).toString());
            return;
        }
    }

    public void a(String s1, long l1, cey cey1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("conversation_type", Integer.valueOf(1));
        contentvalues.put("is_pending_leave", Integer.valueOf(0));
        contentvalues.put("conversation_id", s1);
        contentvalues.put("has_persistent_events", Boolean.valueOf(false));
        contentvalues.put("status", Integer.valueOf(2));
        contentvalues.put("view", Integer.valueOf(1));
        contentvalues.put("is_draft", Integer.valueOf(0));
        contentvalues.put("has_oldest_message", Integer.valueOf(0));
        contentvalues.put("call_media_type", Integer.valueOf(0));
        contentvalues.put("notification_level", Integer.valueOf(30));
        contentvalues.put("disposition", Integer.valueOf(0));
        contentvalues.put("otr_status", Integer.valueOf(2));
        contentvalues.put("otr_toggle", Boolean.valueOf(false));
        contentvalues.put("is_temporary", Boolean.valueOf(true));
        contentvalues.putNull("name");
        contentvalues.put("inviter_gaia_id", cey1.a);
        contentvalues.put("inviter_chat_id", cey1.b);
        contentvalues.put("sort_timestamp", Long.valueOf(l1));
        b.a("conversations", contentvalues);
    }

    public void a(String s1, long l1, boolean flag, String s2)
    {
        long l2;
        long l3;
        long l4;
        l2 = 0L;
        l3 = 0L;
        l4 = 0L;
        Object obj = b.a("conversations", new String[] {
            "self_watermark", "chat_watermark", "hangout_watermark", "has_chat_notifications", "has_video_notifications", "latest_message_timestamp"
        }, "conversation_id=?", new String[] {
            s1
        }, null);
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_855;
        }
        if (!((Cursor) (obj)).isNull(0))
        {
            l2 = ((Cursor) (obj)).getLong(0);
        }
        if (!((Cursor) (obj)).isNull(1))
        {
            l3 = ((Cursor) (obj)).getLong(1);
        }
        if (!((Cursor) (obj)).isNull(2))
        {
            l4 = ((Cursor) (obj)).getLong(2);
        }
        if (((Cursor) (obj)).isNull(3)) goto _L2; else goto _L1
_L1:
        int i1 = ((Cursor) (obj)).getInt(3);
_L10:
        if (((Cursor) (obj)).isNull(4)) goto _L4; else goto _L3
_L3:
        int j1 = ((Cursor) (obj)).getInt(4);
_L9:
        if (((Cursor) (obj)).isNull(5)) goto _L6; else goto _L5
_L5:
        int k1 = ((Cursor) (obj)).getInt(5);
        long l5;
        l5 = k1;
        long l6 = l4;
        l4 = l3;
        l3 = l2;
        l2 = l6;
_L8:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 337)).append("setSelfWatermarkTimestamp, conversationId: ").append(s1).append(", watermarkTimestamp: ").append(l1).append(", currentSelfWatermark: ").append(l3).append(", currentChatWatermark: ").append(l4).append(", currentHangoutWatermark: ").append(l2).append(", hasChatNotifications: ").append(i1).append(", hasVideoNotifications: ").append(j1).append(", latestMessageTimestamp: ").append(l5).toString());
        }
        long l7 = l3;
        if (l3 == 0x3fffffffffffffffL)
        {
            l7 = 0L;
        }
        int i2;
        if (l4 == 0x3fffffffffffffffL)
        {
            l3 = 0L;
        } else
        {
            l3 = l4;
        }
        if (l2 == 0x3fffffffffffffffL)
        {
            l2 = 0L;
        }
        i2 = d.h();
        if (l1 > l7 || l1 > l3 || l1 > l2)
        {
            obj = new ContentValues();
            boolean flag1 = dbq.s(i2);
            if (l1 > l7)
            {
                ((ContentValues) (obj)).put("self_watermark", Long.valueOf(l1));
                if (flag1)
                {
                    a(s1, s2, l7, l1, "selfwatermark");
                }
            }
            j1 = 0;
            i1 = j1;
            if (l1 > l3)
            {
                ((ContentValues) (obj)).put("chat_watermark", Long.valueOf(l1));
                if (flag1)
                {
                    a(s1, s2, l3, l1, "seenchatwatermark");
                }
                i1 = j1;
                if (l5 > l1)
                {
                    j1 = 1;
                    i1 = j1;
                    if (flag1)
                    {
                        StringBuilder stringbuilder = new StringBuilder();
                        stringbuilder.append(s2).append(" conversationid: ").append(s1);
                        stringbuilder.append("hasChatNotifications=1 latestMessageTs: ").append(Long.toString(l5));
                        stringbuilder.append(" watermarkTs: ").append(Long.toString(l1));
                        g.a(i2, 2697, stringbuilder.toString());
                        i1 = j1;
                    }
                }
            }
            ((ContentValues) (obj)).put("has_chat_notifications", Integer.valueOf(i1));
            j1 = 0;
            i1 = j1;
            if (l1 > l2)
            {
                ((ContentValues) (obj)).put("hangout_watermark", Long.valueOf(l1));
                i1 = j1;
                if (l5 > l1)
                {
                    i1 = 1;
                }
            }
            ((ContentValues) (obj)).put("has_video_notifications", Integer.valueOf(i1));
            b.a("conversations", ((ContentValues) (obj)), "conversation_id=?", new String[] {
                s1
            });
            if (!flag)
            {
                i1 = b.a("messages", "delete_after_read_timetamp<?", new String[] {
                    String.valueOf(l1)
                });
                ebw.c("Babel", (new StringBuilder(104)).append("Deleted ").append(i1).append(" messages whose deleteAfterRead timestamp is too old. Watermark: ").append(l1).toString());
            }
        }
        return;
        s1;
        s2 = null;
_L7:
        if (s2 != null)
        {
            s2.close();
        }
        throw s1;
        s1;
        s2 = ((String) (obj));
        if (true) goto _L7; else goto _L6
_L6:
        l5 = l4;
        l4 = l3;
        long l8 = 0L;
        l3 = l2;
        l2 = l5;
        l5 = l8;
          goto _L8
_L4:
        j1 = 0;
          goto _L9
_L2:
        i1 = 0;
          goto _L10
        j1 = 0;
        l2 = 0L;
        l3 = 0L;
        l4 = 0L;
        l5 = 0L;
        i1 = 0;
          goto _L8
    }

    public void a(String s1, aim aim1)
    {
        if (a)
        {
            String s2 = String.valueOf(aim1.b());
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 53 + String.valueOf(s2).length())).append("insertCircleParticipant ConversationId: ").append(s1).append(", circle id: ").append(s2).toString());
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("conversation_id", s1);
        contentvalues.put("participant_type", Integer.valueOf(cfa.c.ordinal()));
        contentvalues.put("active", Integer.valueOf(1));
        contentvalues.put("participant_row_id", Integer.valueOf(a(((String) (null)), null, null, aim1.b(), aim1.d(), true)));
        b.a("conversation_participants", contentvalues);
    }

    public void a(String s1, ContentValues contentvalues)
    {
        if (b.a("presence", contentvalues, "gaia_id=?", new String[] {
    s1
}) <= 0)
        {
            contentvalues.put("gaia_id", s1);
            if ((int)b.a("presence", contentvalues) < 0)
            {
                ebw.g("Babel_db", "update failed");
            }
        }
    }

    public void a(String s1, ceu ceu1)
    {
        a(ceu1, false);
        a(s1, ceu1.b, cfa.a, true);
    }

    public void a(String s1, cey cey1, boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("active", Integer.valueOf(i1));
        if (cey1 != null && !TextUtils.isEmpty(cey1.a))
        {
            apd apd1 = b;
            String s2 = String.valueOf("participant_row_id=");
            String s4 = String.valueOf("conversation_id");
            apd1.a("conversation_participants", contentvalues, (new StringBuilder(String.valueOf(s2).length() + 7 + String.valueOf("(SELECT _id FROM conversation_participants_view WHERE gaia_id=? AND conversation_id=?)").length() + String.valueOf(s4).length())).append(s2).append("(SELECT _id FROM conversation_participants_view WHERE gaia_id=? AND conversation_id=?)").append(" AND ").append(s4).append("=?").toString(), new String[] {
                cey1.a, s1, s1
            });
        } else
        if (cey1 != null && !TextUtils.isEmpty(cey1.b))
        {
            apd apd2 = b;
            String s3 = String.valueOf("participant_row_id=");
            String s5 = String.valueOf("conversation_id");
            apd2.a("conversation_participants", contentvalues, (new StringBuilder(String.valueOf(s3).length() + 7 + String.valueOf("(SELECT _id FROM conversation_participants_view WHERE chat_id=? AND conversation_id=?)").length() + String.valueOf(s5).length())).append(s3).append("(SELECT _id FROM conversation_participants_view WHERE chat_id=? AND conversation_id=?)").append(" AND ").append(s5).append("=?").toString(), new String[] {
                cey1.b, s1, s1
            });
            return;
        }
    }

    public void a(String s1, cry cry1, List list)
    {
        if (a)
        {
            String s2 = String.valueOf("updateDeliveryMediums, conversationId ");
            String s3 = String.valueOf(cry1);
            list = cry.a(list);
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s2).length() + 47 + String.valueOf(s1).length() + String.valueOf(s3).length() + String.valueOf(list).length())).append(s2).append(s1).append(", default delivery medium=").append(s3).append(", deliveryMediumList=").append(list).toString());
        }
        if (cry1 == null)
        {
            return;
        }
        list = new ContentValues();
        b.a();
        list.put("transport_type", Integer.valueOf(cry1.a));
        list.put("default_transport_phone", cry1.b);
        b.a("conversations", list, "conversation_id=?", new String[] {
            s1
        });
        b.b();
        b.c();
        return;
        s1;
        b.c();
        throw s1;
    }

    public void a(String s1, dfb dfb1)
    {
        aoh aoh1;
        String s2;
        ContentValues contentvalues;
        aoh1 = f(s1);
        if (aoh1 == null)
        {
            return;
        }
        s2 = g();
        contentvalues = new ContentValues();
        contentvalues.put("disposition", Integer.valueOf(3));
        a();
        a(s1, s2, contentvalues);
        contentvalues = new ContentValues();
        contentvalues.put("status", Integer.valueOf(dqb.b.ordinal()));
        b.a("messages", contentvalues, "conversation_id=? AND status=?", new String[] {
            s2, Integer.toString(dqb.c.ordinal())
        });
        b();
        c();
        any.d(this);
        RealTimeChatService.i(d, s1, s2);
        dfb1.a(new ctv(s2, aoh1.b, aoh1.d, d(aoh1.h)));
        return;
        s1;
        c();
        throw s1;
    }

    public void a(String s1, dqb dqb1, dqb dqb2)
    {
        if (a)
        {
            String s2 = String.valueOf(dqb1);
            String s3 = String.valueOf(dqb2);
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 56 + String.valueOf(s2).length() + String.valueOf(s3).length())).append("setMessageStatus: conversationId=").append(s1).append(" fromStatus=").append(s2).append("; toStatus=").append(s3).toString());
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("status", Integer.valueOf(dqb2.ordinal()));
        if (dqb2 == dqb.c)
        {
            contentvalues.put("notified_for_failure", Integer.valueOf(0));
        }
        if (dqb1 == dqb.a)
        {
            dqb2 = "conversation_id=?";
            dqb1 = new String[1];
            dqb1[0] = s1;
        } else
        {
            dqb2 = "conversation_id=? AND status=?";
            String as[] = new String[2];
            as[0] = s1;
            as[1] = String.valueOf(dqb1);
            dqb1 = as;
        }
        b.a("messages", contentvalues, dqb2, dqb1);
        any.d(this, s1);
    }

    public void a(String s1, Boolean boolean1)
    {
        if (a)
        {
            String s2 = String.valueOf("updateConversationHasPersistentEvents, conversationId ");
            String s3 = String.valueOf(boolean1);
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s2).length() + 22 + String.valueOf(s1).length() + String.valueOf(s3).length())).append(s2).append(s1).append(", hasPersistentEvents=").append(s3).toString());
        }
        ContentValues contentvalues = new ContentValues();
        byte byte0;
        if (boolean1 == null)
        {
            byte0 = -1;
        } else
        if (g.a(boolean1, false))
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        contentvalues.put("has_persistent_events", Integer.valueOf(byte0));
        b.a("conversations", contentvalues, "conversation_id=?", new String[] {
            s1
        });
    }

    public void a(String s1, Long long1)
    {
        if (a)
        {
            String s2 = String.valueOf(long1);
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 58 + String.valueOf(s2).length())).append("deleteMessagesFromConversationBefore, conversationId=").append(s1).append(", ts=").append(s2).toString());
        }
        StringBuilder stringbuilder = new StringBuilder("conversation_id");
        stringbuilder.append("= ? AND ");
        stringbuilder.append("timestamp");
        stringbuilder.append("< ?");
        stringbuilder.append(" AND ");
        stringbuilder.append("persisted");
        stringbuilder.append(" = 1");
        b.a("messages", stringbuilder.toString(), new String[] {
            s1, String.valueOf(long1)
        });
    }

    public void a(String s1, String s2, long l1)
    {
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 50 + String.valueOf(s2).length())).append("updateStreamUrlForPhotoId, photoId = ").append(s1).append(", streamUrl =").append(s2).toString());
        }
        b.a();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("stream_url", s2);
        contentvalues.put("stream_expiration", Long.valueOf(l1));
        b.a("messages", contentvalues, "image_id=?", new String[] {
            s1
        });
        b.b();
        b.c();
        return;
        s1;
        b.c();
        throw s1;
    }

    public void a(String s1, String s2, Uri uri, long l1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("status", Integer.valueOf(dqb.e.ordinal()));
        contentvalues.put("type", Integer.valueOf(dqc.b.ordinal()));
        if (uri != null)
        {
            contentvalues.put("external_ids", g.a(new String[] {
                uri.toString()
            }));
        }
        if (l1 > 0L)
        {
            contentvalues.put("sms_message_size", Long.valueOf(l1));
        }
        s2 = String.valueOf(s2);
        b.a("messages", contentvalues, "message_id=? AND conversation_id=?", new String[] {
            s2, s1
        });
    }

    public void a(String s1, String s2, dqb dqb1, int i1)
    {
        Object obj = String.valueOf(dqb1);
        obj = (new StringBuilder(String.valueOf(s1).length() + 56 + String.valueOf(s2).length() + String.valueOf(obj).length())).append("setMessageStatusSent: conversationId=").append(s1).append(" messageId=").append(s2).append(" status=").append(((String) (obj))).toString();
        if (dqb1 == dqb.d)
        {
            ebw.e("Babel_db", ((String) (obj)));
        } else
        if (a)
        {
            ebw.b("Babel_db", ((String) (obj)));
        }
        obj = new ContentValues();
        ((ContentValues) (obj)).put("status", Integer.valueOf(dqb1.ordinal()));
        if (dqb1 == dqb.d)
        {
            ((ContentValues) (obj)).put("sending_error", Integer.valueOf(i1));
            ((ContentValues) (obj)).put("notified_for_failure", Integer.valueOf(0));
            cej.c(e, d.h());
        } else
        {
            ((ContentValues) (obj)).put("sending_error", Integer.valueOf(0));
        }
        i1 = b.a("messages", ((ContentValues) (obj)), "conversation_id=? AND message_id=?", new String[] {
            s1, s2
        });
        if (i1 != 1)
        {
            obj = String.valueOf(dqb1);
            ebw.g("Babel", (new StringBuilder(String.valueOf(obj).length() + 72 + String.valueOf(s1).length() + String.valueOf(s2).length())).append("!!!!! failed to set message status to ").append(((String) (obj))).append(" for ").append(s1).append(" ").append(s2).append("; updateCount == ").append(i1).toString());
        }
        any.d(this, s1);
        if (dqb1 == dqb.d || dqb1 == dqb.e)
        {
            any.d(this);
            any.d(this, s1);
        }
    }

    public void a(String s1, String s2, String s3)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("gaia_id", s1);
        contentvalues.put("chat_id", null);
        contentvalues.put("name", s2);
        contentvalues.put("profile_photo_url", s3);
        b.a("dismissed_contacts", contentvalues);
        e.getContentResolver().notifyChange(EsProvider.l, null);
    }

    public void a(String s1, String s2, String s3, String s4, int i1, String s5, String s6)
    {
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 111 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length())).append("setDraft conversationId: ").append(s1).append(" draft: ").append(s2).append(" subject: ").append(s3).append(" attachmentUrl: ").append(s4).append(" photoRotation: ").append(i1).append(" picasaId: ").append(s5).append(" contentType: ").append(s6).toString());
        }
        ContentValues contentvalues = new ContentValues();
        if (s2 == null)
        {
            s2 = "";
        }
        contentvalues.put("draft", s2);
        if (s3 == null)
        {
            s3 = "";
        }
        contentvalues.put("draft_subject", s3);
        if (s4 == null)
        {
            s4 = "";
        }
        contentvalues.put("draft_attachment_url", s4);
        contentvalues.put("draft_photo_rotation", Integer.valueOf(i1));
        if (s5 == null)
        {
            s5 = "";
        }
        contentvalues.put("draft_picasa_id", s5);
        if (s6 == null)
        {
            s6 = "";
        }
        contentvalues.put("draft_content_type", s6);
        b.a("conversations", contentvalues, "conversation_id=?", new String[] {
            s1
        });
        any.a(d.h());
    }

    public void a(String s1, String s2, boolean flag)
    {
        int i1 = 1;
        ContentValues contentvalues;
        if (!TextUtils.isEmpty(s1))
        {
            s2 = "gaia_id=?";
            String as[] = new String[1];
            as[0] = s1;
            s1 = as;
        } else
        if (!TextUtils.isEmpty(s2))
        {
            String s3 = "chat_id=?";
            s1 = new String[1];
            s1[0] = s2;
            s2 = s3;
        } else
        {
            ebw.g("Babel_db", "setUserBlocked without a valid gaiaId or chatId");
            return;
        }
        contentvalues = new ContentValues();
        if (!flag)
        {
            i1 = 0;
        }
        contentvalues.put("blocked", Integer.valueOf(i1));
        b.a("participants", contentvalues, s2, s1);
        e.getContentResolver().notifyChange(EsProvider.k, null);
        s1 = EsProvider.a(f());
        e.getContentResolver().notifyChange(s1, null);
    }

    public void a(String s1, boolean flag)
    {
        if (a)
        {
            String s2 = String.valueOf("updateConversationIsTemporary, conversationId ");
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s2).length() + 19 + String.valueOf(s1).length())).append(s2).append(s1).append(", isTemporary=").append(flag).toString());
        }
        ContentValues contentvalues = new ContentValues();
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("is_temporary", Integer.valueOf(i1));
        b.a("conversations", contentvalues, "conversation_id=?", new String[] {
            s1
        });
    }

    public void a(String s1, byte abyte0[], long l1)
    {
        if (a)
        {
            String s2 = String.valueOf(Arrays.toString(abyte0));
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 80 + String.valueOf(s2).length())).append("setContinuationToken: conversationId=").append(s1).append(" token ").append(s2).append(" eventTimestamp ").append(l1).toString());
        }
        ContentValues contentvalues = new ContentValues();
        int i1;
        if (abyte0 == null)
        {
            contentvalues.putNull("continuation_token");
        } else
        {
            contentvalues.put("continuation_token", abyte0);
        }
        contentvalues.put("continuation_event_timestamp", Long.valueOf(l1));
        if (abyte0 == null && l1 == 0L)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("has_oldest_message", Integer.valueOf(i1));
        b.a("conversations", contentvalues, "conversation_id=?", new String[] {
            s1
        });
        any.e(this);
    }

    public void a(HashSet hashset)
    {
        HashSet hashset1;
        Iterator iterator;
        hashset1 = new HashSet();
        iterator = hashset.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String as[];
        cey cey1;
        cey1 = (cey)iterator.next();
        if (TextUtils.isEmpty(cey1.a))
        {
            continue; /* Loop/switch isn't completed */
        }
        hashset = "gaia_id=?";
        as = new String[1];
        as[0] = cey1.a;
_L5:
        hashset = b.a("conversation_participants_view", o, hashset, as, null);
        boolean flag;
        if (hashset.moveToFirst())
        {
            do
            {
                hashset1.add(hashset.getString(0));
                flag = hashset.moveToNext();
            } while (flag);
        }
        if (hashset != null)
        {
            hashset.close();
        }
        continue; /* Loop/switch isn't completed */
        if (TextUtils.isEmpty(cey1.b)) goto _L4; else goto _L3
_L3:
        hashset = "chat_id=?";
        as = new String[1];
        as[0] = cey1.b;
          goto _L5
        Exception exception;
        exception;
        hashset = null;
_L7:
        if (hashset != null)
        {
            hashset.close();
        }
        throw exception;
_L2:
        for (hashset = hashset1.iterator(); hashset.hasNext(); any.a(d))
        {
            any.b(this, (String)hashset.next());
        }

        return;
        exception;
        if (true) goto _L7; else goto _L6
_L6:
        if (true) goto _L4; else goto _L8
_L8:
    }

    public void a(List list)
    {
        b.a();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            czc czc1 = (czc)list.next();
            if (a)
            {
                String s1 = czc1.a;
                String s2 = czc1.b;
                long l1 = czc1.c;
                ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 77 + String.valueOf(s2).length())).append("markEventObserved, conversationId=").append(s1).append(", messageId=").append(s2).append(" timestamp=").append(l1).toString());
            }
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("message_id", czc1.b);
            contentvalues.put("conversation_id", czc1.a);
            contentvalues.put("last_seen_timestamp", Long.valueOf(czc1.c));
            if (b.a("messages", contentvalues, "message_id=? AND conversation_id=?", new String[] {
    czc1.b, czc1.a
}) == 0)
            {
                b.a("messages", contentvalues);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_224;
        list;
        b.c();
        throw list;
        b.b();
        b.c();
        return;
    }

    public void a(List list, List list1, String s1)
    {
        gz gz1;
        gz gz2;
        ArrayList arraylist;
        ArrayList arraylist1;
        gz1 = new gz();
        crv crv1;
        for (list1 = list1.iterator(); list1.hasNext(); gz1.put(crv1.a, crv1))
        {
            crv1 = (crv)list1.next();
        }

        arraylist1 = new ArrayList();
        arraylist = new ArrayList();
        gz2 = new gz();
        list1 = b.a("conversation_participants_view", new String[] {
            "gaia_id", "chat_id", "active", "invitation_status"
        }, "conversation_id=?", new String[] {
            s1
        }, null);
        if (!list1.moveToFirst()) goto _L2; else goto _L1
_L1:
        cey cey1 = new cey(list1.getString(0), list1.getString(1));
        boolean flag;
        boolean flag1;
        if (list1.getInt(2) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        if (a(list, cey1)) goto _L4; else goto _L5
_L5:
        arraylist1.add(cey1);
_L7:
        if (gz1.containsKey(cey1) && list1.getInt(3) != ((crv)gz1.get(cey1)).d)
        {
            gz2.put(cey1, Integer.valueOf(((crv)gz1.get(cey1)).d));
        }
        flag1 = list1.moveToNext();
        if (flag1) goto _L1; else goto _L2
_L4:
        if (flag) goto _L7; else goto _L6
_L6:
        if (!a(list, cey1)) goto _L7; else goto _L8
_L8:
        arraylist.add(cey1);
          goto _L7
        list;
_L10:
        if (list1 != null)
        {
            list1.close();
        }
        throw list;
_L2:
        if (list1 != null)
        {
            list1.close();
        }
        for (list = arraylist1.iterator(); list.hasNext(); a(s1, (cey)list.next(), false)) { }
        for (list = arraylist.iterator(); list.hasNext(); a(s1, (cey)list.next(), true)) { }
        list = gz2.entrySet().iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)list.next();
            list1 = (cey)((java.util.Map.Entry) (obj)).getKey();
            int i1 = g.a((Integer)((java.util.Map.Entry) (obj)).getValue(), 0);
            obj = new ContentValues();
            ((ContentValues) (obj)).put("invitation_status", Integer.valueOf(i1));
            if (!TextUtils.isEmpty(((cey) (list1)).a))
            {
                apd apd1 = b;
                String s2 = String.valueOf("participant_row_id=");
                String s4 = String.valueOf("conversation_id");
                apd1.a("conversation_participants", ((ContentValues) (obj)), (new StringBuilder(String.valueOf(s2).length() + 7 + String.valueOf("(SELECT _id FROM conversation_participants_view WHERE gaia_id=? AND conversation_id=?)").length() + String.valueOf(s4).length())).append(s2).append("(SELECT _id FROM conversation_participants_view WHERE gaia_id=? AND conversation_id=?)").append(" AND ").append(s4).append("=?").toString(), new String[] {
                    ((cey) (list1)).a, s1, s1
                });
            } else
            if (!TextUtils.isEmpty(((cey) (list1)).b))
            {
                apd apd2 = b;
                String s3 = String.valueOf("participant_row_id=");
                String s5 = String.valueOf("conversation_id");
                apd2.a("conversation_participants", ((ContentValues) (obj)), (new StringBuilder(String.valueOf(s3).length() + 7 + String.valueOf("(SELECT _id FROM conversation_participants_view WHERE chat_id=? AND conversation_id=?)").length() + String.valueOf(s5).length())).append(s3).append("(SELECT _id FROM conversation_participants_view WHERE chat_id=? AND conversation_id=?)").append(" AND ").append(s5).append("=?").toString(), new String[] {
                    ((cey) (list1)).b, s1, s1
                });
            }
        } while (true);
        return;
        list;
        list1 = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void a(Map map)
    {
        Cursor cursor;
        cursor = b.a("participants", aow.a, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
_L1:
        amx amx1;
        do
        {
            if (!cursor.moveToNext())
            {
                break MISSING_BLOCK_LABEL_74;
            }
            amx1 = (amx)map.get(cursor.getString(0));
        } while (amx1 == null);
        amx1.b = cursor.getString(1);
          goto _L1
        map;
        cursor.close();
        throw map;
        cursor.close();
    }

    public void a(String as[])
    {
        Object obj;
        ArrayList arraylist;
        int i1;
        i1 = 0;
        obj = e();
        arraylist = new ArrayList();
        ((apd) (obj)).a();
        ContentValues contentvalues;
        int j1;
        contentvalues = new ContentValues();
        j1 = as.length;
_L2:
        String s1;
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = as[i1];
        contentvalues.clear();
        String s2 = aqc.d.a(s1);
        contentvalues.put("merge_key", s2);
        ((apd) (obj)).a("merge_keys", contentvalues, "conversation_id=?", new String[] {
            s1
        });
        arraylist.add(new Pair(s1, s2));
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        ((apd) (obj)).b();
        ((apd) (obj)).c();
        for (as = arraylist.iterator(); as.hasNext(); RealTimeChatService.b((String)((Pair) (obj)).first, (String)((Pair) (obj)).second))
        {
            obj = (Pair)as.next();
        }

        break MISSING_BLOCK_LABEL_177;
        as;
        ((apd) (obj)).c();
        throw as;
        any.a(d.h());
        return;
    }

    public boolean a(ceu ceu1, boolean flag)
    {
        if (ceu1.b != null) goto _L2; else goto _L1
_L1:
        ebw.g("Babel_db", "null participantId in insertOrUpdateParticipant");
_L4:
        return false;
_L2:
        dme dme1 = dme.a();
        a(dme1, ceu1);
        String s2;
        String s3;
        String s4;
        dme1.b();
        s2 = ceu1.b.a;
        s3 = ceu1.b.b;
        s4 = ceu1.f();
        if (TextUtils.isEmpty(s2) && TextUtils.isEmpty(s3) && TextUtils.isEmpty(s4) && ceu1.a != cfa.d)
        {
            ebw.g("Babel_db", "no gaiaId/chatId/phoneNumber in insertOrUpdateParticipant");
            return false;
        }
        break MISSING_BLOCK_LABEL_108;
        ceu1;
        dme1.b();
        throw ceu1;
        ContentValues contentvalues;
        int i1;
        int j1;
        contentvalues = new ContentValues();
        if (!TextUtils.isEmpty(s2))
        {
            contentvalues.put("gaia_id", s2);
        }
        if (!TextUtils.isEmpty(s3))
        {
            contentvalues.put("chat_id", s3);
        }
        if (!TextUtils.isEmpty(s4))
        {
            contentvalues.put("phone_id", s4);
            gbh.a(cfa.d, ceu1.a);
        }
        contentvalues.put("participant_type", Integer.valueOf(ceu1.a.ordinal()));
        if (ceu1.a == cfa.a)
        {
            String s1 = String.valueOf("Encountered participant with participantType UNKNOWN, ParticipantEntity: ");
            String s5 = String.valueOf(ebw.b(ceu1.toString()));
            if (s5.length() != 0)
            {
                s1 = s1.concat(s5);
            } else
            {
                s1 = new String(s1);
            }
            ebw.g("Babel", s1);
            gbh.a("ParticipantType UNKNOWN found");
        }
        if (!TextUtils.isEmpty(ceu1.f))
        {
            contentvalues.put("first_name", ceu1.f);
        }
        if (!TextUtils.isEmpty(ceu1.e))
        {
            contentvalues.put("full_name", ceu1.e);
        }
        if (!TextUtils.isEmpty(ceu1.g))
        {
            contentvalues.put("fallback_name", ceu1.g);
        }
        if (!TextUtils.isEmpty(ceu1.h))
        {
            contentvalues.put("profile_photo_url", ceu1.h);
        }
        contentvalues.put("in_users_domain", Boolean.valueOf(ceu1.y));
        if (ceu1.i != null)
        {
            if (g.a(ceu1.i, false))
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            contentvalues.put("blocked", Integer.valueOf(i1));
        }
        if (flag)
        {
            contentvalues.putNull("batch_gebi_tag");
        }
        j1 = a(s2, s3, s4, ((String) (null)), ((String) (null)), false);
        if (j1 >= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = (int)b.a("participants", contentvalues);
        i1 = j1;
        if (j1 >= 0)
        {
            break MISSING_BLOCK_LABEL_556;
        }
        ebw.g("Babel_db", "insert failed");
_L5:
        if (j1 >= 0)
        {
            return ((aqs)hgx.a(e, aqs)).a(d).a(Integer.toString(j1), ceu1, flag);
        }
        if (true) goto _L4; else goto _L3
_L3:
        contentvalues.remove("phone_id");
        i1 = j1;
        if (b.a("participants", contentvalues, "_id=?", new String[] {
    Integer.toString(j1)
}) <= 0)
        {
            ebw.g("Babel_db", "update failed");
            i1 = j1;
        }
        j1 = i1;
          goto _L5
    }

    public boolean a(cey cey1, String s1, String s2)
    {
        boolean flag = b(cey1, s1);
        a(s2, cey1, cfa.a, false);
        return flag;
    }

    public boolean a(String s1, long l1, long l2, int i1, cey cey1, 
            long l3, dqb dqb1, String s2, String s3)
    {
        return a(s1, l1, l2, i1, cey1, ((String) (null)), ((String) (null)), l3, dqb1, s2, s3, -1, 0);
    }

    public boolean a(String s1, long l1, long l2, int i1, String s2, 
            cey cey1, String s3, String s4, long l3, int j1, int k1)
    {
        if (i1 == 6)
        {
            if (g.b(s2))
            {
                i1 = 3;
            } else
            if ("hangouts/location".equals(s2))
            {
                i1 = 13;
            } else
            if (g.e(s2) || "application/vnd.wap.multipart.mixed".equals(s2))
            {
                i1 = 9;
            } else
            if ("hangouts/gv_voicemail".equals(s2))
            {
                i1 = 12;
            } else
            {
                i1 = 2;
            }
        }
        return a(s1, l1, l2, i1, cey1, s3, s4, l3, dqb.a, null, null, j1, k1);
    }

    public boolean a(String s1, String s2)
    {
        s2 = b.a("messages", aoz.a, "conversation_id=? AND message_id=?", new String[] {
            s1, s2
        }, null);
        boolean flag;
        if (!s2.moveToFirst() || dqc.values()[s2.getInt(3)] != dqc.d)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        flag = a(s1, s2.getLong(1), s2.getLong(2), 5, cey.b(s2.getString(4)), ((String) (null)), ((String) (null)), s2.getLong(0), dqb.values()[s2.getInt(5)], s2.getString(6), null, -1, 0);
        if (s2 != null)
        {
            s2.close();
        }
        return flag;
        if (s2 != null)
        {
            s2.close();
        }
        return false;
        s1;
        s2 = null;
_L2:
        if (s2 != null)
        {
            s2.close();
        }
        throw s1;
        s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public long aa(String s1)
    {
        return a("getSmsThreadId", s1, "sms_thread_id", -1L);
    }

    public boolean ab(String s1)
    {
        return a("getConversationIsTemporary", s1, "is_temporary", 0) == 1;
    }

    public String ac(String s1)
    {
        String s2;
        Cursor cursor;
        if (a)
        {
            s2 = String.valueOf(s1);
            String s3;
            long l1;
            long l2;
            if (s2.length() != 0)
            {
                s2 = "getStreamUrlForPhotoId, photoId =".concat(s2);
            } else
            {
                s2 = new String("getStreamUrlForPhotoId, photoId =");
            }
            ebw.b("Babel_db", s2);
        }
        cursor = b.a("messages", new String[] {
            "stream_url", "stream_expiration"
        }, "image_id=?", new String[] {
            s1
        }, null);
        l1 = System.currentTimeMillis();
        s2 = null;
_L4:
        if (!cursor.moveToNext()) goto _L2; else goto _L1
_L1:
        s3 = cursor.getString(0);
        l2 = cursor.getLong(1);
        s2 = s3;
        if (TextUtils.isEmpty(s3)) goto _L4; else goto _L3
_L3:
        s2 = s3;
        if (l1 >= l2) goto _L4; else goto _L5
_L5:
        a(s1, s3, l2);
        s1 = s3;
        if (cursor != null)
        {
            cursor.close();
            s1 = s3;
        }
_L7:
        return s1;
_L2:
        s1 = s2;
        if (cursor == null) goto _L7; else goto _L6
_L6:
        cursor.close();
        return s2;
        s1;
        cursor = null;
_L9:
        if (cursor != null)
        {
            cursor.close();
        }
        throw s1;
        s1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public String ad(String s1)
    {
        Object obj = null;
        if (a)
        {
            String s2 = String.valueOf(s1);
            if (s2.length() != 0)
            {
                s2 = "getConversationIdForPhotoId, photoId =".concat(s2);
            } else
            {
                s2 = new String("getConversationIdForPhotoId, photoId =");
            }
            ebw.b("Babel_db", s2);
        }
        s1 = b.a("messages", new String[] {
            "conversation_id"
        }, "image_id=?", new String[] {
            s1
        }, null);
        s2 = obj;
        if (s1.moveToNext())
        {
            s2 = s1.getString(0);
        }
        if (s1 != null)
        {
            s1.close();
        }
        return s2;
        Exception exception;
        exception;
        s1 = null;
_L2:
        if (s1 != null)
        {
            s1.close();
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void ae(String s1)
    {
        if (ebw.a("Babel_db", 3))
        {
            String s2 = String.valueOf("acceptConversationLocally conversationId: ");
            String s3 = String.valueOf(s1);
            if (s3.length() != 0)
            {
                s2 = s2.concat(s3);
            } else
            {
                s2 = new String(s2);
            }
            ebw.c("Babel_db", s2);
        }
        a();
        s(s1);
        f(s1, 1);
        a(s1, 30);
        b();
        c();
        return;
        s1;
        c();
        throw s1;
    }

    public void af(String s1)
    {
        ebw.c("Babel_db", "removeConversationTransaction");
        a();
        C(s1);
        b();
        c();
        return;
        s1;
        c();
        throw s1;
    }

    public Set ag(String s1)
    {
        Cursor cursor = b.a("merge_keys", aoj.a, "merge_key IN (SELECT merge_key FROM merge_keys WHERE conversation_id=?)", new String[] {
            s1
        }, null);
        HashSet hashset = new HashSet();
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        for (; cursor.moveToNext(); hashset.add(cursor.getString(0))) { }
        break MISSING_BLOCK_LABEL_77;
        s1;
        if (cursor != null)
        {
            cursor.close();
        }
        throw s1;
        boolean flag;
        if (!hashset.contains(s1) && hashset.size() != 0 && TextUtils.isEmpty(RealTimeChatService.a(s1)))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        gbh.a(flag);
        if (cursor != null)
        {
            cursor.close();
        }
        return hashset;
    }

    public List ah(String s1)
    {
        s1 = b.a("merge_keys", aoj.a, "merge_key IN (SELECT merge_key FROM merge_keys WHERE conversation_id=?)", new String[] {
            s1
        }, null);
        Object obj = new ArrayList();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        for (; s1.moveToNext(); ((List) (obj)).add(e(s1.getString(0)))) { }
        break MISSING_BLOCK_LABEL_81;
        obj;
        if (s1 != null)
        {
            s1.close();
        }
        throw obj;
        if (s1 != null)
        {
            s1.close();
        }
        return ((List) (obj));
    }

    public Set ai(String s1)
    {
        Set set = ag(s1);
        set.remove(s1);
        return set;
    }

    public cww aj(String s1)
    {
        Object obj = null;
        s1 = b.a("sticker_photos", j, "photo_id=?", new String[] {
            s1
        }, null);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        if (!s1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_106;
        }
        obj = new cww();
        obj.a = s1.getString(0);
        obj.b = s1.getString(1);
        obj.c = s1.getString(2);
        obj.d = s1.getInt(3);
        if (s1 != null)
        {
            s1.close();
        }
        return ((cww) (obj));
        if (s1 != null)
        {
            s1.close();
        }
        return null;
        s1;
_L2:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw s1;
        Exception exception;
        exception;
        obj = s1;
        s1 = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public long b(int i1)
    {
        long l2 = o(EsProvider.a(i1), -1L);
        long l1 = l2;
        if (l2 == -3L)
        {
            l1 = -2L;
        }
        return l1;
    }

    public long b(String s1, int i1)
    {
        return a(R(s1), i1);
    }

    public aos b(long l1)
    {
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(49)).append("getMessageInfo, messageRowId=").append(l1).toString());
        }
        List list = k("_id", String.valueOf(l1));
        if (list.size() == 0)
        {
            return null;
        } else
        {
            return (aos)list.get(0);
        }
    }

    public bhj b(String s1, dme dme1)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = dme1.c(s1);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = bhj.a(((fqo) (obj)));
_L4:
        return ((bhj) (obj));
_L2:
        Iterator iterator;
        boolean flag;
        boolean flag1;
        s1 = dme1.b(s1);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        iterator = s1.iterator();
        flag = false;
        flag1 = false;
        s1 = null;
_L5:
        String s2;
        boolean flag2;
        boolean flag3;
        do
        {
            do
            {
                flag3 = flag;
                flag2 = flag1;
                s2 = s1;
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_182;
                }
                obj = ((fqo)iterator.next()).e();
            } while (TextUtils.isEmpty(((CharSequence) (obj))) || TextUtils.equals(((CharSequence) (obj)), s1));
            if (a(cey.a(((String) (obj))), false, 1) != null)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (s1 == null)
            {
                flag1 = flag2;
                s1 = ((String) (obj));
            } else
            {
label0:
                {
                    if (flag1 || !flag2)
                    {
                        break label0;
                    }
                    flag = true;
                    flag1 = true;
                    s1 = ((String) (obj));
                }
            }
        } while (true);
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        if (flag2) goto _L4; else goto _L3
_L3:
        flag = true;
          goto _L5
        flag3 = false;
        flag2 = false;
        s2 = null;
        obj = obj1;
        if (s2 == null) goto _L4; else goto _L6
_L6:
        if (flag2)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        if (flag3) goto _L4; else goto _L7
_L7:
        return dme1.a(s2);
    }

    public String b(cey cey1)
    {
        String s2 = a(cey1);
        String s1 = s2;
        if (s2 == null)
        {
            s1 = c(cey1);
        }
        return s1;
    }

    public String b(String s1, List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i1;
        for (list = list.iterator(); list.hasNext(); stringbuilder.append(i1))
        {
            daf daf1 = (daf)list.next();
            i1 = a(s1, daf1.a, daf1.b, daf1.d, daf1.c, daf1.e);
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append('|');
            }
        }

        return stringbuilder.toString();
    }

    public String b(List list)
    {
        Cursor cursor;
        int i1 = 0;
        int j1 = list.size();
        StringBuilder stringbuilder = new StringBuilder();
        String as[] = new String[j1 + 1];
        j1 = list.size() - 1;
        while (j1 >= -1) 
        {
            cey cey1;
            if (j1 == -1)
            {
                cey1 = d.b();
            } else
            {
                cey1 = ((ceu)list.get(j1)).b;
            }
            if (i1 > 0)
            {
                stringbuilder.append(" OR ");
            }
            if (cey1 != null && !TextUtils.isEmpty(cey1.a))
            {
                stringbuilder.append("gaia_id=?");
                int k1 = i1 + 1;
                as[i1] = cey1.a;
                i1 = k1;
            }
            j1--;
        }
        cursor = a(stringbuilder.toString(), as, 1);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        String s1;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_244;
        }
        s1 = cursor.getString(0);
        if (!a) goto _L2; else goto _L1
_L1:
        list = String.valueOf(s1);
        if (list.length() == 0)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        list = "queryGroupConversationByGaia found conversation ".concat(list);
_L3:
        ebw.b("Babel_db", list);
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
        return s1;
        list = new String("queryGroupConversationByGaia found conversation ");
          goto _L3
        list;
        if (cursor != null)
        {
            cursor.close();
        }
        throw list;
        if (cursor != null)
        {
            cursor.close();
        }
        return null;
    }

    public void b()
    {
        b.b();
    }

    public void b(long l1, dqb dqb1, long l2)
    {
        if (a)
        {
            String s1 = String.valueOf(dqb1);
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 93)).append("setMmsNotificationStatus: messageRowId=").append(l1).append(", status=").append(s1).append(", ts=").append(l2).toString());
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("status", Integer.valueOf(dqb1.ordinal()));
        if (l2 > 0L)
        {
            contentvalues.put("sms_timestamp_sent", Long.valueOf(1000L * l2));
        }
        apd apd1 = b;
        dqb1 = String.valueOf("_id=");
        String s2 = String.valueOf(String.valueOf(l1));
        if (s2.length() != 0)
        {
            dqb1 = dqb1.concat(s2);
        } else
        {
            dqb1 = new String(dqb1);
        }
        apd1.a("messages", contentvalues, dqb1, null);
    }

    public void b(String s1, long l1)
    {
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 83)).append("setConversationSequenceNumber: conversationId=").append(s1).append(", sequenceNumber=").append(l1).toString());
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("sequence_number", Long.valueOf(l1));
        b.a("conversations", contentvalues, "conversation_id=?", new String[] {
            s1
        });
    }

    public void b(String s1, long l1, long l2)
    {
        if (a)
        {
            String s2 = String.valueOf("updateMessageScrollTime: conversationId=");
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s2).length() + 78 + String.valueOf(s1).length())).append(s2).append(s1).append(" scrollTime=").append(l1).append(" scrollToMessageTimestamp=").append(l2).toString());
        }
        a();
        aoy aoy1 = an(s1);
        if (aoy1 != null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        b();
        c();
        return;
        aoy aoy2 = a(aoy1, l1, l2);
        if (aoy2 == aoy1)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        ContentValues contentvalues = new ContentValues();
        if (aoy2.a != aoy1.a)
        {
            contentvalues.put("first_peak_scroll_time", Long.valueOf(aoy2.a));
        }
        if (aoy2.b != aoy1.b)
        {
            contentvalues.put("first_peak_scroll_to_message_timestamp", Long.valueOf(aoy2.b));
        }
        if (aoy2.c != aoy1.c)
        {
            contentvalues.put("second_peak_scroll_time", Long.valueOf(aoy2.c));
        }
        if (aoy2.d != aoy1.d)
        {
            contentvalues.put("second_peak_scroll_to_message_timestamp", Long.valueOf(aoy2.d));
        }
        if (contentvalues.size() > 0)
        {
            b.a("conversations", contentvalues, "conversation_id=?", new String[] {
                s1
            });
        }
        b();
        c();
        return;
        s1;
        c();
        throw s1;
    }

    public void b(String s1, String s2)
    {
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 46 + String.valueOf(s2).length())).append("updateConversationName, conversationId=").append(s1).append(", name=").append(s2).toString());
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("name", s2);
        b.a("conversations", contentvalues, "conversation_id=?", new String[] {
            s1
        });
    }

    public void b(String s1, String s2, String s3, String s4)
    {
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 66 + String.valueOf(s2).length())).append("updateConversationParticipantInfo, conversationId=").append(s1).append(", generatedName=").append(s2).toString());
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("generated_name", s2);
        contentvalues.put("packed_avatar_urls", s3);
        contentvalues.put("self_avatar_url", s4);
        b.a("conversations", contentvalues, "conversation_id=?", new String[] {
            s1
        });
    }

    public void b(String s1, boolean flag)
    {
        String s2;
        ContentValues contentvalues;
        if (flag)
        {
            s2 = "chat_ringtone_uri";
        } else
        {
            s2 = "hangout_ringtone_uri";
        }
        b.a();
        contentvalues = new ContentValues();
        contentvalues.put(s2, null);
        b.a("conversations", contentvalues, String.valueOf(s2).concat("=?"), new String[] {
            s1
        });
        b.b();
        b.c();
        return;
        s1;
        b.c();
        throw s1;
    }

    public void b(List list, int i1)
    {
        ebw.a("Babel_db", "updateSuggestedEntitiesList");
        b.a("suggested_contacts", "suggestion_type=?", new String[] {
            String.valueOf(i1)
        });
        ContentValues contentvalues = new ContentValues();
        list = list.iterator();
        int j1 = 0;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ceu ceu1 = (ceu)list.next();
            if (!TextUtils.isEmpty(ceu1.f) && !TextUtils.isEmpty(ceu1.e))
            {
                contentvalues.clear();
                contentvalues.put("chat_id", ceu1.b.b);
                contentvalues.put("gaia_id", ceu1.b.a);
                contentvalues.put("name", ceu1.e);
                contentvalues.put("first_name", ceu1.f);
                contentvalues.put("profile_photo_url", ceu1.h);
                contentvalues.put("packed_circle_ids", ceu1.r);
                contentvalues.put("sequence", Integer.valueOf(j1));
                contentvalues.put("suggestion_type", Integer.valueOf(i1));
                b.a("suggested_contacts", contentvalues);
                j1++;
            }
        } while (true);
        e.getContentResolver().notifyChange(EsProvider.i, null);
    }

    public boolean b(long l1, int i1)
    {
        if (a)
        {
            String s1 = String.valueOf(ebw.b(d.a()));
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 69)).append("deleteOldConversations: account=").append(s1).append(" cutOffTimestamp=").append(l1).toString());
        }
        String as[] = new String[2];
        as[0] = String.valueOf(l1);
        as[1] = String.valueOf(i1);
        int j1 = b.a("messages", x, as);
        if (j1 > 0)
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("continuation_event_timestamp", Integer.valueOf(0));
            contentvalues.putNull("continuation_token");
            contentvalues.put("has_oldest_message", Boolean.valueOf(false));
            b.a("conversations", contentvalues, "sort_timestamp<? AND status=? AND transport_type!=3", as);
            any.d(this);
        }
        if (j1 > 0 && a)
        {
            ebw.b("Babel_db", (new StringBuilder(102)).append("deleteOldConversations:").append(j1).append(" cutOffTimestamp:").append(l1).append(" conversationStatus:").append(i1).toString());
        }
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(38)).append("Deleted ").append(j1).append(" old conversations.").toString());
        }
        return j1 > 0;
    }

    public Pair c(long l1)
    {
        String s1;
        s1 = null;
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(58)).append("getConversationIdStatus, messageRowId=").append(l1).toString());
        }
        Object obj;
        apd apd1;
        String s2;
        apd1 = b;
        obj = String.valueOf("_id=");
        s2 = String.valueOf(String.valueOf(l1));
        if (s2.length() == 0) goto _L2; else goto _L1
_L1:
        obj = ((String) (obj)).concat(s2);
_L3:
        obj = apd1.a("messages", new String[] {
            "conversation_id", "status"
        }, ((String) (obj)), null, null);
        int i1;
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_186;
        }
        s1 = ((Cursor) (obj)).getString(0);
        i1 = ((Cursor) (obj)).getInt(1);
_L6:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return new Pair(s1, Integer.valueOf(i1));
_L2:
        obj = new String(((String) (obj)));
          goto _L3
        Exception exception;
        exception;
        obj = null;
_L5:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw exception;
        exception;
        if (true) goto _L5; else goto _L4
_L4:
        i1 = 0;
          goto _L6
    }

    public String c(String s1, List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i1;
        for (list = list.iterator(); list.hasNext(); stringbuilder.append(i1))
        {
            dae dae1 = (dae)list.next();
            i1 = a(s1, dae1.a.a, dae1.a.b, dae1.a.d, dae1.a.c, dae1.a.e);
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append('|');
            }
        }

        return stringbuilder.toString();
    }

    public List c(String s1, long l1)
    {
        Object obj = new ArrayList();
        s1 = b.a("messages_view", r, "conversation_id=? AND author_gaia_id=? AND timestamp>=?", new String[] {
            s1, d.b().a, String.valueOf(l1)
        }, "timestamp DESC");
        while (s1.moveToNext()) 
        {
            ((ArrayList) (obj)).add(d(s1));
        }
          goto _L1
        Exception exception;
        exception;
        obj = s1;
        s1 = exception;
_L3:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw s1;
_L1:
        if (s1 != null)
        {
            s1.close();
        }
        return ((List) (obj));
        s1;
        obj = null;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public void c()
    {
        if (b != null)
        {
            b.c();
        } else
        {
            String s1 = String.valueOf(ebw.b(d.a()));
            if (s1.length() != 0)
            {
                s1 = "endTransaction called on a database not fully setup. Account: ".concat(s1);
            } else
            {
                s1 = new String("endTransaction called on a database not fully setup. Account: ");
            }
            ebw.f("Babel_db", s1);
        }
        f = f - 1;
    }

    public void c(String s1, int i1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("view", Integer.valueOf(i1));
        if (b.a("conversations", contentvalues, "conversation_id=?", new String[] {
    s1
}) != 0)
        {
            any.d(this);
        }
    }

    public void c(String s1, String s2)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("chat_ringtone_uri", s2);
        b.a("conversations", contentvalues, "conversation_id=?", new String[] {
            s1
        });
    }

    public void c(String s1, String s2, String s3, String s4)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("gaia_id", s1);
        contentvalues.put("chat_id", s2);
        contentvalues.put("name", s3);
        contentvalues.put("profile_photo_url", s4);
        b.a("blocked_people", contentvalues);
        e.getContentResolver().notifyChange(EsProvider.k, null);
    }

    public void c(List list)
    {
        List list1;
        List list2;
        long l1;
        list1 = a(false);
        list2 = D();
        l1 = System.currentTimeMillis();
        b.a();
        Iterator iterator;
        b.a("sticker_photos", null, null);
        b.a("sticker_albums", null, null);
        iterator = list.iterator();
_L12:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        cwv cwv1 = (cwv)iterator.next();
        Object obj = null;
        Object obj1 = list1.iterator();
_L4:
        list = ((List) (obj));
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        list = (cwv)((Iterator) (obj1)).next();
        if (!((cwv) (list)).a.equals(cwv1.a)) goto _L4; else goto _L3
_L3:
        obj1 = new ContentValues();
        ((ContentValues) (obj1)).put("album_id", cwv1.a);
        ((ContentValues) (obj1)).put("title", cwv1.b);
        if (cwv1.c != null) goto _L6; else goto _L5
_L5:
        obj = null;
_L10:
        ((ContentValues) (obj1)).put("cover_photo_id", ((String) (obj)));
        if (list != null) goto _L8; else goto _L7
_L7:
        long l2;
        long l3;
        l2 = l1 - 1L;
        l3 = l1;
_L11:
        ((ContentValues) (obj1)).put("last_used", Long.valueOf(l3));
        b.a("sticker_albums", ((ContentValues) (obj1)));
        list = cwv1.e.iterator();
_L9:
        cww cww1;
        if (!list.hasNext())
        {
            break MISSING_BLOCK_LABEL_423;
        }
        obj = (cww)list.next();
        obj1 = new ContentValues();
        cww1 = a(list2, ((cww) (obj)).a);
        if (cww1 == null)
        {
            break MISSING_BLOCK_LABEL_318;
        }
        list2.remove(cww1);
        if (cww1.c != null)
        {
            ((ContentValues) (obj1)).put("file_name", cww1.c);
        }
        ((ContentValues) (obj1)).put("last_used", Long.valueOf(cww1.d));
        ((ContentValues) (obj1)).put("album_id", cwv1.a);
        ((ContentValues) (obj1)).put("photo_id", ((cww) (obj)).a);
        ((ContentValues) (obj1)).put("url", ((cww) (obj)).b);
        b.a("sticker_photos", ((ContentValues) (obj1)));
          goto _L9
        list;
        b.c();
        throw list;
_L6:
        obj = cwv1.c.a;
          goto _L10
_L8:
        l3 = ((cwv) (list)).d;
        l2 = l1;
          goto _L11
_L2:
        b.b();
        b.c();
        e(list2);
        return;
        l1 = l2;
          goto _L12
    }

    public List d(long l1)
    {
        Object obj1;
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(68)).append("queryConversationsSince, lastSuccessfulSyncTime=").append(l1).toString());
        }
        obj1 = new ArrayList();
        Object obj = b.a("messages_view", new String[] {
            "conversation_id", "message_id"
        }, "timestamp >? AND conversation_id NOT LIKE ?", new String[] {
            String.valueOf(l1), "client_generated:%"
        }, "conversation_id");
        while (((Cursor) (obj)).moveToNext()) 
        {
            ((List) (obj1)).add(new Pair(((Cursor) (obj)).getString(0), ((Cursor) (obj)).getString(1)));
        }
          goto _L1
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
_L3:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
_L1:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return ((List) (obj1));
        obj;
        obj1 = null;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public List d(String s1, int i1)
    {
        if (a)
        {
            String s2 = String.valueOf(ebw.b(d.a()));
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s2).length() + 46 + String.valueOf(s1).length())).append("getMessageTimestamps: account=").append(s2).append(" conversationId=").append(s1).toString());
        }
        s1 = b.a("messages", y, "conversation_id=?", new String[] {
            s1
        }, null, null, "timestamp DESC", String.valueOf(i1));
        Object obj;
        obj = new ArrayList();
        for (; s1.moveToNext(); ((List) (obj)).add(Long.valueOf(s1.getLong(0)))) { }
          goto _L1
        Exception exception;
        exception;
        obj = s1;
        s1 = exception;
_L3:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw s1;
_L1:
        if (s1 != null)
        {
            s1.close();
        }
        return ((List) (obj));
        s1;
        obj = null;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public void d()
    {
        if (f <= 1)
        {
            b.d();
            return;
        } else
        {
            ebw.e("Babel_db", "cannot yield from within a nested transaction", new Exception());
            return;
        }
    }

    public void d(String s1, String s2)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("hangout_ringtone_uri", s2);
        b.a("conversations", contentvalues, "conversation_id=?", new String[] {
            s1
        });
    }

    public boolean d(String s1, long l1)
    {
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 60)).append("deleteConversation:").append(s1).append(" upperBoundTimestamp:").append(l1).toString());
        }
        b.a("messages", "conversation_id=? AND timestamp<=?", new String[] {
            s1, String.valueOf(l1)
        });
        Cursor cursor = b.a("messages", new String[] {
            "_id"
        }, "conversation_id=?", new String[] {
            s1
        }, null);
        int i1 = cursor.getCount();
        boolean flag;
        if (i1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (cursor != null)
        {
            cursor.close();
        }
        if (flag)
        {
            C(s1);
            return true;
        } else
        {
            a(s1, ((byte []) (null)), l1);
            return false;
        }
        s1;
        cursor = null;
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
        throw s1;
        s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public int e(String s1, long l1)
    {
        if (a)
        {
            String s2 = String.valueOf(ebw.b(d.a()));
            int i1;
            if (s2.length() != 0)
            {
                s2 = "deletePlayedEventSuggestions for account: ".concat(s2);
            } else
            {
                s2 = new String("deletePlayedEventSuggestions for account: ");
            }
            ebw.b("Babel_db", s2);
        }
        a();
        i1 = b.a("event_suggestions", "conversation_id=? AND timestamp<=?", new String[] {
            s1, String.valueOf(l1)
        });
        b();
        c();
        return i1;
        s1;
        c();
        throw s1;
    }

    public aoh e(String s1)
    {
        aoh aoh1 = f(s1);
        if (aoh1 == null)
        {
            ebw.g("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 31)).append("Conversation id ").append(s1).append(" does not exist").toString());
            throw new NullPointerException("Conversation id does not exist");
        } else
        {
            return aoh1;
        }
    }

    public aos e(String s1, String s2)
    {
        Object obj = null;
        s1 = b.a("messages_view", r, "conversation_id=? AND message_id=?", new String[] {
            s1, s2
        }, null);
        s2 = obj;
        if (s1.moveToFirst())
        {
            s2 = d(s1);
        }
        if (s1 != null)
        {
            s1.close();
        }
        return s2;
        s2;
        s1 = null;
_L2:
        if (s1 != null)
        {
            s1.close();
        }
        throw s2;
        s2;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public apd e()
    {
        return b;
    }

    public void e(long l1)
    {
        Object obj1;
        ebw.a("Babel_db", "Rewinding");
        b.a("messages", "timestamp>? AND persisted = 1", new String[] {
            String.valueOf(l1)
        });
        obj1 = new ArrayList();
        Object obj = b.a("conversations", t, "self_watermark >? AND conversation_id NOT LIKE 'client_generated:%'", new String[] {
            String.valueOf(l1)
        }, null);
        while (((Cursor) (obj)).moveToNext()) 
        {
            ((ArrayList) (obj1)).add(((Cursor) (obj)).getString(0));
        }
          goto _L1
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
_L3:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
_L1:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        obj = new ContentValues();
        ((ContentValues) (obj)).put("self_watermark", Long.valueOf(l1));
        for (obj1 = ((ArrayList) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); any.e(this))
        {
            String s1 = (String)((Iterator) (obj1)).next();
            b.a("conversations", ((ContentValues) (obj)), "conversation_id=?", new String[] {
                s1
            });
        }

        g("last_successful_sync_time", l1);
        any.d(this);
        any.c(this);
        return;
        obj;
        obj1 = null;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public void e(String s1, int i1)
    {
        a();
        f(s1, i1);
        b();
        c();
        return;
        s1;
        c();
        throw s1;
    }

    public ani f()
    {
        return d;
    }

    public aoh f(String s1)
    {
        Cursor cursor;
        if (a)
        {
            String s2 = String.valueOf(s1);
            if (s2.length() != 0)
            {
                s2 = "getConversationInfo ".concat(s2);
            } else
            {
                s2 = new String("getConversationInfo ");
            }
            ebw.b("Babel_db", s2);
        }
        s2 = null;
        cursor = al(s1);
        s1 = s2;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        s1 = s2;
        if (cursor.moveToFirst())
        {
            s1 = a(cursor);
        }
        if (cursor != null)
        {
            cursor.close();
        }
        return s1;
        s1;
        if (cursor != null)
        {
            cursor.close();
        }
        throw s1;
    }

    public Long f(String s1, String s2)
    {
        Object obj = null;
        if (a)
        {
            String s3 = String.valueOf(s1);
            long l1;
            if (s3.length() != 0)
            {
                s3 = "getMessageTimeStamp, conversationId=".concat(s3);
            } else
            {
                s3 = new String("getMessageTimeStamp, conversationId=");
            }
            ebw.b("Babel_db", s3);
        }
        s1 = b.a("messages", new String[] {
            "timestamp"
        }, "conversation_id=? AND message_id=?", new String[] {
            s1, s2
        }, null);
        s2 = obj;
        if (!s1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_99;
        }
        l1 = s1.getLong(0);
        s2 = Long.valueOf(l1);
        if (s1 != null)
        {
            s1.close();
        }
        return s2;
        s2;
        s1 = null;
_L2:
        if (s1 != null)
        {
            s1.close();
        }
        throw s2;
        s2;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void f(long l1)
    {
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(42)).append("deleteMessages, rowId=").append(l1).toString());
        }
        Object obj = g.h(g(l1));
        if (obj != null && ((String) (obj)).startsWith("content://"))
        {
            e.getContentResolver().delete(Uri.parse(((String) (obj))), null, null);
        }
        apd apd1 = b;
        obj = String.valueOf("_id=");
        String s1 = String.valueOf(String.valueOf(l1));
        if (s1.length() != 0)
        {
            obj = ((String) (obj)).concat(s1);
        } else
        {
            obj = new String(((String) (obj)));
        }
        apd1.a("messages", ((String) (obj)), null);
        obj = new ContentValues();
        ((ContentValues) (obj)).putNull("latest_message_expiration_timestamp");
        ((ContentValues) (obj)).put("snippet_type", Integer.valueOf(7));
        ((ContentValues) (obj)).putNull("snippet_author_chat_id");
        ((ContentValues) (obj)).putNull("snippet_image_url");
        ((ContentValues) (obj)).putNull("snippet_text");
        ((ContentValues) (obj)).putNull("snippet_message_row_id");
        ((ContentValues) (obj)).putNull("snippet_status");
        ((ContentValues) (obj)).putNull("previous_latest_timestamp");
        ((ContentValues) (obj)).putNull("snippet_new_conversation_name");
        ((ContentValues) (obj)).putNull("snippet_participant_keys");
        ((ContentValues) (obj)).putNull("snippet_voicemail_duration");
        b.a("conversations", ((ContentValues) (obj)), "snippet_message_row_id=?", new String[] {
            String.valueOf(l1)
        });
    }

    public void f(String s1, long l1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("status", Integer.valueOf(dqb.f.ordinal()));
        b.a("messages", contentvalues, "conversation_id=? AND _id=?", new String[] {
            s1, Long.toString(l1)
        });
    }

    public int g(String s1)
    {
        return a("getConversationTransportType", s1, "transport_type", 0);
    }

    public Long g(String s1, String s2)
    {
        Object obj;
        obj = null;
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 46 + String.valueOf(s2).length())).append("queryMessageRowId, conversationId=").append(s1).append(", messageId=").append(s2).toString());
        }
        s2 = b.a("messages", new String[] {
            "_id"
        }, "conversation_id=? AND message_id=?", new String[] {
            s1, s2
        }, null);
        long l1;
        s2.moveToFirst();
        if (s2.isAfterLast())
        {
            break MISSING_BLOCK_LABEL_139;
        }
        l1 = s2.getLong(0);
        if (s2 != null)
        {
            s2.close();
        }
        return Long.valueOf(l1);
        if (s2 != null)
        {
            s2.close();
        }
        return null;
        s1;
        s2 = obj;
_L2:
        if (s2 != null)
        {
            s2.close();
        }
        throw s1;
        s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String g(long l1)
    {
        Object obj1;
        obj1 = null;
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(55)).append("getMessageExternalId, messageRowId=").append(l1).toString());
        }
        Object obj;
        apd apd1;
        String s1;
        apd1 = b;
        obj = String.valueOf("_id=");
        s1 = String.valueOf(String.valueOf(l1));
        if (s1.length() == 0) goto _L2; else goto _L1
_L1:
        obj = ((String) (obj)).concat(s1);
_L5:
        obj = apd1.a("messages", new String[] {
            "external_ids"
        }, ((String) (obj)), null, null);
        if (!((Cursor) (obj)).moveToFirst()) goto _L4; else goto _L3
_L3:
        obj1 = ((Cursor) (obj)).getString(0);
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return ((String) (obj1));
_L2:
        obj = new String(((String) (obj)));
          goto _L5
        obj;
_L7:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
_L4:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return null;
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void g(String s1, long l1)
    {
        ank.b(e, f().h(), s1, l1);
    }

    public int h(long l1)
    {
        if (a)
        {
            String s1 = String.valueOf(ebw.b(d.a()));
            int i1;
            if (s1.length() != 0)
            {
                s1 = "deleteExpiredMessages for account: ".concat(s1);
            } else
            {
                s1 = new String("deleteExpiredMessages for account: ");
            }
            ebw.b("Babel_db", s1);
        }
        a();
        i1 = b.a("messages", "expiration_timestamp<? AND transport_type!=3", new String[] {
            String.valueOf(l1)
        });
        b();
        c();
        return i1;
        Exception exception;
        exception;
        c();
        throw exception;
    }

    public long h(String s1)
    {
        return a("getContinuationEventTimestamp", s1, "continuation_event_timestamp", 0L);
    }

    public void h(String s1, long l1)
    {
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 68)).append("updateSortTimestamp, conversationId=").append(s1).append(", timestamp=").append(l1).toString());
        }
        a();
        int i1;
        i1 = i(s1, l1);
        b();
        c();
        if (i1 > 0)
        {
            any.d(this);
        }
        return;
        s1;
        c();
        throw s1;
    }

    public void h(String s1, String s2)
    {
        if (!TextUtils.isEmpty(s1))
        {
            s2 = "gaia_id=?";
            String as[] = new String[1];
            as[0] = s1;
            s1 = as;
        } else
        if (!TextUtils.isEmpty(s2))
        {
            String s3 = "chat_id=?";
            s1 = new String[1];
            s1[0] = s2;
            s2 = s3;
        } else
        {
            ebw.g("Babel_db", "removeBlockedPerson without a valid gaiaId or chatId");
            return;
        }
        b.a("blocked_people", s2, s1);
        e.getContentResolver().notifyChange(EsProvider.k, null);
    }

    public int i(long l1)
    {
        if (a)
        {
            String s1 = String.valueOf(ebw.b(d.a()));
            int i1;
            if (s1.length() != 0)
            {
                s1 = "deleteExpiredEventSuggestions for account: ".concat(s1);
            } else
            {
                s1 = new String("deleteExpiredEventSuggestions for account: ");
            }
            ebw.b("Babel_db", s1);
        }
        a();
        i1 = b.a("event_suggestions", "expiration_time_usec<=?", new String[] {
            String.valueOf(l1)
        });
        b();
        c();
        if (i1 > 0 && a)
        {
            ebw.b("Babel_db", (new StringBuilder(78)).append("deleteExpiredEventSuggestions:").append(i1).append(" cutoffTimestamp:").append(l1).toString());
        }
        return i1;
        Exception exception;
        exception;
        c();
        throw exception;
    }

    public int i(String s1, long l1)
    {
        if (l1 < R(s1))
        {
            if (a)
            {
                String s2 = String.valueOf("Skip updateSortTimestamp because new timestamp is smaller than current timestamp, conversationId=");
                ebw.b("Babel_db", (new StringBuilder(String.valueOf(s2).length() + 32 + String.valueOf(s1).length())).append(s2).append(s1).append(", timestamp=").append(l1).toString());
            }
            return 0;
        } else
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("sort_timestamp", Long.valueOf(l1));
            return b.a("conversations", contentvalues, "conversation_id=?", new String[] {
                s1
            });
        }
    }

    public ArrayList i()
    {
        Object obj1;
        ebw.a("Babel_db", "getConversationIds");
        obj1 = new ArrayList();
        Object obj = b.a("conversations", o, "transport_type!=3", null, null);
        while (((Cursor) (obj)).moveToNext()) 
        {
            ((ArrayList) (obj1)).add(((Cursor) (obj)).getString(0));
        }
          goto _L1
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
_L3:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
_L1:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return ((ArrayList) (obj1));
        obj;
        obj1 = null;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public void i(String s1)
    {
        if (a)
        {
            Object obj = String.valueOf(s1);
            if (((String) (obj)).length() != 0)
            {
                obj = "clearContinuationToken: conversationId=".concat(((String) (obj)));
            } else
            {
                obj = new String("clearContinuationToken: conversationId=");
            }
            ebw.b("Babel_db", ((String) (obj)));
        }
        obj = new ContentValues();
        ((ContentValues) (obj)).putNull("continuation_token");
        ((ContentValues) (obj)).put("continuation_event_timestamp", Integer.valueOf(0));
        ((ContentValues) (obj)).put("has_oldest_message", Integer.valueOf(0));
        b.a("conversations", ((ContentValues) (obj)), "conversation_id=?", new String[] {
            s1
        });
        any.e(this);
    }

    public void i(String s1, String s2)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("sms_service_center", s2);
        b.a("conversations", contentvalues, "conversation_id=?", new String[] {
            s1
        });
    }

    public int j(long l1)
    {
        if (a)
        {
            String s1 = String.valueOf(ebw.b(d.a()));
            int i1;
            if (s1.length() != 0)
            {
                s1 = "deleteEmptyConversations for account: ".concat(s1);
            } else
            {
                s1 = new String("deleteEmptyConversations for account: ");
            }
            ebw.b("Babel_db", s1);
        }
        a();
        i1 = b.a("conversations", "(has_oldest_message =1 OR has_persistent_events =0) AND sort_timestamp <? AND status != 1 AND NOT EXISTS (SELECT 1 FROM messages WHERE messages.conversation_id=conversations.conversation_id)", new String[] {
            String.valueOf(l1)
        });
        b();
        c();
        if (i1 > 0)
        {
            if (a)
            {
                ebw.b("Babel_db", (new StringBuilder(73)).append("deleteEmptyConversations:").append(i1).append(" cutoffTimestamp:").append(l1).toString());
            }
            any.d(this);
        }
        return i1;
        Exception exception;
        exception;
        c();
        throw exception;
    }

    public void j()
    {
        int i1 = b.a("conversations", "is_pending_leave<0", null);
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(35)).append("RemoveLeftConversations ").append(i1).toString());
        }
        if (i1 > 0)
        {
            any.d(this);
        }
    }

    public void j(String s1)
    {
        if (a)
        {
            String s2 = String.valueOf(s1);
            if (s2.length() != 0)
            {
                s2 = "clearConversation: conversationId=".concat(s2);
            } else
            {
                s2 = new String("clearConversation: conversationId=");
            }
            ebw.b("Babel_db", s2);
        }
        if (b.a("conversations", "conversation_id=?", new String[] {
    s1
}) > 0)
        {
            any.d(this);
        }
    }

    public void j(String s1, long l1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("sort_timestamp", Long.valueOf(l1));
        b.a("conversations", contentvalues, "conversation_id=?", new String[] {
            s1
        });
    }

    public boolean j(String s1, String s2)
    {
        b.a();
        int i1;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("file_name", s1);
        i1 = b.a("sticker_photos", contentvalues, "photo_id=?", new String[] {
            s2
        });
        b.b();
        b.c();
        return i1 == 1;
        s1;
        b.c();
        throw s1;
    }

    public int k(long l1)
    {
        if (a)
        {
            String s1 = String.valueOf(ebw.b(d.a()));
            int i1;
            if (s1.length() != 0)
            {
                s1 = "deleteExpiredInvitations for account:".concat(s1);
            } else
            {
                s1 = new String("deleteExpiredInvitations for account:");
            }
            ebw.b("Babel_db", s1);
        }
        a();
        i1 = b.a("conversations", "sort_timestamp <? AND status = 1 AND otr_status = 1", new String[] {
            String.valueOf(l1)
        });
        b();
        c();
        if (i1 > 0)
        {
            if (a)
            {
                ebw.b("Babel_db", (new StringBuilder(73)).append("deleteExpiredInvitations:").append(i1).append(" cutoffTimestamp:").append(l1).toString());
            }
            any.d(this);
        }
        return i1;
        Exception exception;
        exception;
        c();
        throw exception;
    }

    public int k(String s1, long l1)
    {
        if (a)
        {
            String s2 = String.valueOf(ebw.b(d.a()));
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s2).length() + 80 + String.valueOf(s1).length())).append("deleteOldMessages: account=").append(s2).append(" conversationId=").append(s1).append(" cutOffTimestamp=").append(l1).toString());
        }
        a(s1, ((byte []) (null)), l1);
        int i1 = b.a("messages", "conversation_id=? AND timestamp<? AND transport_type!=3", new String[] {
            s1, String.valueOf(l1)
        });
        any.d(this, s1);
        return i1;
    }

    public long k(String s1)
    {
        long l1 = a("getConversationSequenceNumber", s1, "sequence_number", 1L);
        if (l1 < 1L)
        {
            return 1L;
        } else
        {
            return l1;
        }
    }

    public List k()
    {
        ArrayList arraylist = new ArrayList();
        Cursor cursor = b.a("participants_view", q, null, null, null);
_L8:
        if (!cursor.moveToNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        String s1;
        String s2;
        obj = cursor.getString(0);
        s1 = cursor.getString(1);
        s2 = cursor.getString(2);
        if (!TextUtils.isEmpty(((CharSequence) (obj))) || !TextUtils.isEmpty(s1) || !TextUtils.isEmpty(s2)) goto _L4; else goto _L3
_L3:
        ebw.g("Babel_db", "RefreshParticipantsOperation: found a participant with no valid id");
        obj = null;
_L9:
        if (obj == null) goto _L6; else goto _L5
_L5:
        if (!((dac) (obj)).a()) goto _L6; else goto _L7
_L7:
        arraylist.add(obj);
          goto _L8
        obj;
_L10:
        if (cursor != null)
        {
            cursor.close();
        }
        throw obj;
_L4:
label0:
        {
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                break label0;
            }
            obj = dac.a(((String) (obj)));
        }
          goto _L9
label1:
        {
            if (TextUtils.isEmpty(s1))
            {
                break label1;
            }
            obj = g.a(new cey(((String) (obj)), s1));
        }
          goto _L9
        ebw.c("Babel_db", "RefreshParticipantsOperation: skip circle");
          goto _L8
_L6:
        ebw.g("Babel_db", "RefreshParticipantsOperation: participant has no gaia id");
          goto _L8
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
        return arraylist;
        obj;
        cursor = null;
          goto _L10
    }

    public int l(long l1)
    {
        String s1 = String.format(Locale.US, "(%s=%d) AND (%s<=?)", new Object[] {
            "transport_type", Integer.valueOf(3), "timestamp"
        });
        return b.a("messages", s1, new String[] {
            Long.toString(l1)
        });
    }

    public List l()
    {
        Object obj1;
        ebw.a("Babel_db", "getUnreadConversations");
        obj1 = new ArrayList();
        Object obj = b.a("conversations", t, "self_watermark < sort_timestamp AND conversation_id NOT LIKE 'client_generated:%'", null, null);
        while (((Cursor) (obj)).moveToNext()) 
        {
            ((List) (obj1)).add(new Pair(((Cursor) (obj)).getString(0), Long.valueOf(((Cursor) (obj)).getLong(1))));
        }
          goto _L1
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
_L3:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
_L1:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return ((List) (obj1));
        obj;
        obj1 = null;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public void l(String s1)
    {
        if (a)
        {
            Object obj = String.valueOf("expireLatestMessage. conversationId=");
            String s2 = String.valueOf(s1);
            long l1;
            if (s2.length() != 0)
            {
                obj = ((String) (obj)).concat(s2);
            } else
            {
                obj = new String(((String) (obj)));
            }
            ebw.b("Babel_db", ((String) (obj)));
        }
        l1 = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        a();
        obj = n(s1);
        if (((aoo) (obj)).b > 0L && ((aoo) (obj)).b <= l1)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        b();
        c();
        return;
        ContentValues contentvalues = new ContentValues();
        contentvalues.putNull("latest_message_expiration_timestamp");
        contentvalues.put("snippet_type", Integer.valueOf(7));
        contentvalues.putNull("snippet_author_chat_id");
        contentvalues.putNull("snippet_image_url");
        contentvalues.putNull("snippet_text");
        contentvalues.putNull("snippet_message_row_id");
        contentvalues.putNull("snippet_status");
        contentvalues.putNull("previous_latest_timestamp");
        contentvalues.putNull("snippet_new_conversation_name");
        contentvalues.putNull("snippet_participant_keys");
        contentvalues.putNull("snippet_voicemail_duration");
        b.a("conversations", contentvalues, "conversation_id=?", new String[] {
            s1
        });
        b();
        c();
        return;
        s1;
        c();
        throw s1;
    }

    public void l(String s1, long l1)
    {
        a(s1, l1, false);
    }

    public int m(long l1)
    {
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(42)).append("deleteMmsNotification ").append(l1).toString());
        }
        a();
        int i1;
        i1 = b.a("mms_notification_inds", "_id=?", new String[] {
            String.valueOf(l1)
        });
        b();
        c();
        return i1;
        Exception exception;
        exception;
        c();
        throw exception;
    }

    public long m(String s1)
    {
        return a("getLatestMessageTimestamp", s1, "latest_message_timestamp", 0L);
    }

    public void m()
    {
        ebw.a("Babel_db", "clearMessagesConversationsParticipants");
        b.a("messages", null, null);
        b.a("conversation_participants", null, null);
        b.a("conversations", null, null);
        any.d(this);
        any.c(this);
        any.b(this);
    }

    public void m(String s1, long l1)
    {
        a(s1, l1, true);
    }

    public aoo n(String s1)
    {
        if (a)
        {
            Object obj = String.valueOf(s1);
            if (((String) (obj)).length() != 0)
            {
                obj = "getLatestMessageInfo, conversationId=".concat(((String) (obj)));
            } else
            {
                obj = new String("getLatestMessageInfo, conversationId=");
            }
            ebw.b("Babel_db", ((String) (obj)));
        }
        obj = new aoo();
        s1 = b.a("conversations", p, "conversation_id=?", new String[] {
            String.valueOf(s1)
        }, null);
        if (s1.moveToFirst())
        {
            obj.a = s1.getLong(0);
            obj.b = s1.getLong(1);
            obj.c = s1.getInt(2);
            obj.e = s1.getString(3);
            obj.d = s1.getString(4);
            obj.f = s1.getString(5);
            obj.g = s1.getLong(6);
            obj.h = s1.getLong(7);
        }
        if (s1 != null)
        {
            s1.close();
        }
        return ((aoo) (obj));
        Exception exception;
        exception;
        s1 = null;
_L2:
        if (s1 != null)
        {
            s1.close();
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String n(long l1)
    {
        String s1;
        Cursor cursor;
        s1 = null;
        cursor = b.a("messages", B, "_id=?", new String[] {
            Long.toString(l1)
        }, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        s1 = cursor.getString(0);
        cursor.close();
        return s1;
        cursor.close();
        return null;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    public void n()
    {
        b.a("blocked_people", "gaia_id IS NOT NULL", null);
        e.getContentResolver().notifyChange(EsProvider.k, null);
    }

    public void n(String s1, long l1)
    {
        if (aa(s1) == -1L && l1 > 0L)
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("sms_thread_id", Long.valueOf(l1));
            b.a("conversations", contentvalues, "conversation_id=?", new String[] {
                s1
            });
        }
    }

    public String o(String s1)
    {
        Object obj;
        String s2 = null;
        if (a)
        {
            obj = String.valueOf(s1);
            if (((String) (obj)).length() != 0)
            {
                obj = "getConversationName, conversationId=".concat(((String) (obj)));
            } else
            {
                obj = new String("getConversationName, conversationId=");
            }
            ebw.b("Babel_db", ((String) (obj)));
        }
        obj = b.a("conversations", new String[] {
            "name", "generated_name"
        }, "conversation_id=?", new String[] {
            s1
        }, null);
        s1 = s2;
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        s2 = ((Cursor) (obj)).getString(0);
        s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s1 = ((Cursor) (obj)).getString(1);
        }
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return s1;
        s1;
        obj = null;
_L2:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw s1;
        s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void o()
    {
        b.a("dismissed_contacts", null, null);
        e.getContentResolver().notifyChange(EsProvider.l, null);
    }

    public void p()
    {
        ContentValues contentvalues;
        contentvalues = new ContentValues();
        contentvalues.put("status", Integer.valueOf(dqb.d.ordinal()));
        a();
        int i1;
        apd apd1 = b;
        String s1 = String.valueOf("status=");
        i1 = dqb.c.ordinal();
        i1 = apd1.a("messages", contentvalues, (new StringBuilder(String.valueOf(s1).length() + 11)).append(s1).append(i1).toString(), null);
        b();
        c();
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(47)).append("failAnySendingMessages patched ").append(i1).append(" rows").toString());
        }
        return;
        Exception exception;
        exception;
        c();
        throw exception;
    }

    public boolean p(String s1)
    {
        return a("getConversationHasMetadata", s1, "metadata_present", 0) == 1;
    }

    public int q(String s1)
    {
        return a("getConversationType", s1, "conversation_type", 0);
    }

    public List q()
    {
        Object obj;
        if (a)
        {
            ebw.b("Babel_db", "getSuggestedEntitiesList");
        }
        obj = new ArrayList();
        Cursor cursor = b.a("suggested_contacts", g, "suggestion_type=?", new String[] {
            "3"
        }, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        for (; cursor.moveToNext(); ((List) (obj)).add(g.a(new cey(cursor.getString(0), cursor.getString(1)), cursor.getString(2), cursor.getString(3), null, cursor.getString(4), cursor.getString(5)))) { }
          goto _L2
        obj;
_L4:
        if (cursor != null)
        {
            cursor.close();
        }
        throw obj;
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
        return ((List) (obj));
        obj;
        cursor = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void r()
    {
        for (int i1 = 1; i1 <= 4; i1++)
        {
            c(i1);
        }

    }

    public void r(String s1)
    {
        if (a)
        {
            String s2 = String.valueOf(s1);
            if (s2.length() != 0)
            {
                s2 = "setConversationHidden, conversationId=".concat(s2);
            } else
            {
                s2 = new String("setConversationHidden, conversationId=");
            }
            ebw.b("Babel_db", s2);
        }
        m(s1, 0xffffffff80000000L);
    }

    public long s()
    {
        return a(C());
    }

    public void s(String s1)
    {
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 65)).append("setConversationPendingAccept, conversationId=").append(s1).append(", status=2").toString());
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("status", Integer.valueOf(2));
        b.a("conversations", contentvalues, "conversation_id=?", new String[] {
            s1
        });
    }

    public int t(String s1)
    {
        return a("getConversationStatus", s1, "status", 0);
    }

    public void t()
    {
        if (a)
        {
            String s1 = String.valueOf(ebw.b(d.a()));
            if (s1.length() != 0)
            {
                s1 = "deleteAllConversations: account=".concat(s1);
            } else
            {
                s1 = new String("deleteAllConversations: account=");
            }
            ebw.b("Babel_db", s1);
        }
        b.a("conversations", null, null);
        any.d(this);
    }

    public int u()
    {
        String s2 = String.format(Locale.US, "(%s=%d) AND (%s=%d) AND %s", new Object[] {
            "transport_type", Integer.valueOf(3), "sms_type", Integer.valueOf(1), drk.a("attachment_content_type")
        });
        if (ebw.a("Babel_db", 3))
        {
            String s1 = String.valueOf(s2);
            if (s1.length() != 0)
            {
                s1 = "deleteSmsMediaMessags: selection = ".concat(s1);
            } else
            {
                s1 = new String("deleteSmsMediaMessags: selection = ");
            }
            ebw.c("Babel_db", s1);
        }
        return b.a("messages", s2, null);
    }

    public long u(String s1)
    {
        return a("getSelfWatermarkTimestamp", s1, "self_watermark", -1L);
    }

    public long v(String s1)
    {
        return a("getSeenChatMessageWatermarkTimestamp", s1, "chat_watermark", -1L);
    }

    public void v()
    {
        ebw.c("Babel_db", "removeSmsConversationsTransaction");
        a();
        b.a("conversations", "transport_type=3", null);
        b();
        c();
        return;
        Exception exception;
        exception;
        c();
        throw exception;
    }

    public int w(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return b.a("UPDATE conversations SET chat_watermark=sort_timestamp, has_chat_notifications=0 WHERE sort_timestamp>chat_watermark", null);
        } else
        {
            return b.a("UPDATE conversations SET chat_watermark=sort_timestamp, has_chat_notifications=0 WHERE sort_timestamp>chat_watermark AND conversation_id=?", s1);
        }
    }

    public void w()
    {
        a();
        if (!a) goto _L2; else goto _L1
_L1:
        String s1;
        s1 = String.valueOf(ebw.b(d.a()));
        if (s1.length() == 0)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        s1 = "deleteAllLowAffinityInvites: account=".concat(s1);
_L3:
        ebw.b("Babel_db", s1);
_L2:
        int i1 = b.a("conversations", "view=1 AND status=1 AND inviter_affinity=2", null);
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(39)).append("deleteAllLowAffinityInvites:").append(i1).toString());
        }
        any.d(this);
        c(4);
        b();
        c();
        return;
        s1 = new String("deleteAllLowAffinityInvites: account=");
          goto _L3
        Exception exception;
        exception;
        c();
        throw exception;
    }

    public int x(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return b.a("UPDATE conversations SET hangout_watermark=sort_timestamp, has_video_notifications=0 WHERE sort_timestamp>hangout_watermark", null);
        } else
        {
            return b.a("UPDATE conversations SET hangout_watermark=sort_timestamp, has_video_notifications=0 WHERE sort_timestamp>hangout_watermark AND conversation_id=?", s1);
        }
    }

    public void x()
    {
        a();
        if (!a) goto _L2; else goto _L1
_L1:
        String s1;
        s1 = String.valueOf(ebw.b(d.a()));
        if (s1.length() == 0)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        s1 = "deleteAllHighAffinityInvites: account=".concat(s1);
_L3:
        ebw.b("Babel_db", s1);
_L2:
        int i1 = b.a("conversations", "view=1 AND status=1 AND inviter_affinity=1", null);
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(40)).append("deleteAllHighAffinityInvites:").append(i1).toString());
        }
        any.d(this);
        c(3);
        b();
        c();
        return;
        s1 = new String("deleteAllHighAffinityInvites: account=");
          goto _L3
        Exception exception;
        exception;
        c();
        throw exception;
    }

    public long y(String s1)
    {
        return a("getLastOtrModificationTime", s1, "last_otr_modification_time", -1L);
    }

    public List y()
    {
        Object obj1 = new ArrayList();
        Object obj = b.a("sticker_photos", j, "last_used!=0", null, null, null, "last_used DESC", "32");
_L2:
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!((Cursor) (obj)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cww cww1 = new cww();
        cww1.a = ((Cursor) (obj)).getString(0);
        cww1.b = ((Cursor) (obj)).getString(1);
        cww1.c = ((Cursor) (obj)).getString(2);
        ((List) (obj1)).add(cww1);
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
_L4:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
_L1:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return ((List) (obj1));
        obj;
        obj1 = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final csk z(String s1)
    {
        Object obj;
        ArrayList arraylist;
        ContentValues contentvalues;
        String s2;
        String s3;
        if (a)
        {
            obj = String.valueOf(s1);
            if (((String) (obj)).length() != 0)
            {
                obj = "getUnobservedEvent, conversationId ".concat(((String) (obj)));
            } else
            {
                obj = new String("getUnobservedEvent, conversationId ");
            }
            ebw.b("Babel_db", ((String) (obj)));
        }
        arraylist = new ArrayList();
        obj = b.a("messages_view", new String[] {
            "_id", "message_id"
        }, "conversation_id=? AND last_seen_timestamp=?", new String[] {
            s1, "0"
        }, null);
        a();
        contentvalues = new ContentValues();
        contentvalues.put("last_seen_timestamp", Integer.valueOf(1));
_L5:
        if (!((Cursor) (obj)).moveToNext()) goto _L2; else goto _L1
_L1:
        s2 = ((Cursor) (obj)).getString(0);
        s3 = ((Cursor) (obj)).getString(1);
        if (!TextUtils.isEmpty(s3) && !TextUtils.isEmpty(s2)) goto _L4; else goto _L3
_L3:
        ebw.f("Babel_db", "getUnobservedEvent: found a message with no message id or row id.");
          goto _L5
        s1;
        c();
        throw s1;
        s1;
_L6:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw s1;
_L4:
        b.a("messages", contentvalues, "_id=?", new String[] {
            s2
        });
        arraylist.add(s3);
          goto _L5
_L2:
        b();
        c();
        s1 = new csk(s1, arraylist);
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return s1;
        s1;
        obj = null;
          goto _L6
    }

    static 
    {
        hik hik = ebw.d;
        u = String.format(Locale.US, "%s=? AND %s=?", new Object[] {
            "conversation_id", "participant_type"
        });
        x = String.format(Locale.US, "%s in (select %s from %s where %s)", new Object[] {
            "conversation_id", "conversation_id", "conversations", "sort_timestamp<? AND status=? AND transport_type!=3"
        });
    }
}
