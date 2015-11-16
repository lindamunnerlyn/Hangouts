// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.apps.hangouts.content.EsProvider;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class apa extends SQLiteOpenHelper
{

    private static final boolean b = false;
    private static final String c[] = {
        "name"
    };
    private static final Map d = new gz();
    private static String h[] = {
        "_id"
    };
    private static String i[] = {
        "circle_id"
    };
    public final Context a;
    private boolean e;
    private final int f;
    private final String g;

    private apa(Context context, int j)
    {
        String s = String.valueOf("babel");
        String s1 = String.valueOf(".db");
        super(context, (new StringBuilder(String.valueOf(s).length() + 11 + String.valueOf(s1).length())).append(s).append(j).append(s1).toString(), null, 1060);
        a = context;
        f = j;
        s = String.valueOf("babel");
        s1 = String.valueOf(".db");
        g = (new StringBuilder(String.valueOf(s).length() + 11 + String.valueOf(s1).length())).append(s).append(j).append(s1).toString();
        context = context.getApplicationInfo().dataDir;
        j = g.a((Integer)Class.forName("android.os.FileUtils").getMethod("setPermissions", new Class[] {
            java/lang/String, Integer.TYPE, Integer.TYPE, Integer.TYPE
        }).invoke(null, new Object[] {
            context, Integer.valueOf(457), Integer.valueOf(-1), Integer.valueOf(-1)
        }), 0);
        if (j != 0)
        {
            try
            {
                throw new IOException((new StringBuilder(59)).append("FileUtils.setPermissions failed with error code ").append(j).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        break MISSING_BLOCK_LABEL_298;
        context;
        context = String.valueOf(context);
        throw new IOException((new StringBuilder(String.valueOf(context).length() + 27)).append("Failed to set permissions: ").append(context).toString());
    }

    private static int a(SQLiteDatabase sqlitedatabase, String s, String s1, String s2, String s3, String s4)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        Object obj = sqlitedatabase.query("participants", h, "gaia_id=?", new String[] {
            s
        }, null, null, null);
_L4:
        int j;
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_198;
        }
        j = ((Cursor) (obj)).getInt(0);
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return j;
_L2:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        obj = sqlitedatabase.query("participants", h, "chat_id=?", new String[] {
            s1
        }, null, null, null);
        continue; /* Loop/switch isn't completed */
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        obj = sqlitedatabase.query("participants", h, "phone_id=?", new String[] {
            s2
        }, null, null, null);
        continue; /* Loop/switch isn't completed */
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        obj = sqlitedatabase.query("participants", h, "circle_id=?", new String[] {
            s3
        }, null, null, null);
        continue; /* Loop/switch isn't completed */
        if (s4 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = sqlitedatabase.query("participants", h, "( chat_id=? AND fallback_name=? )", new String[] {
            s4, s4
        }, null, null, null);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        obj = new ContentValues();
        if (s1 != null)
        {
            ((ContentValues) (obj)).put("chat_id", s1);
        }
        if (s != null)
        {
            ((ContentValues) (obj)).put("gaia_id", s);
        }
        if (s2 != null)
        {
            ((ContentValues) (obj)).put("phone_id", s2);
        }
        if (s3 != null)
        {
            ((ContentValues) (obj)).put("circle_id", s3);
        }
        if (s4 != null)
        {
            ((ContentValues) (obj)).put("fallback_name", s4);
            if (s1 == null && s == null && s2 == null && s3 == null)
            {
                ((ContentValues) (obj)).put("chat_id", s4);
            }
        }
        if (s == null)
        {
            ((ContentValues) (obj)).put("batch_gebi_tag", "blocked");
        }
        return (int)sqlitedatabase.insert("participants", null, ((ContentValues) (obj)));
        sqlitedatabase;
        obj = null;
_L6:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw sqlitedatabase;
        sqlitedatabase;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static apa a(Context context, int j)
    {
        apa apa1;
        Map map;
        g.x();
        apa apa2;
        gmu gmu1;
        try
        {
            gmu1 = ((gms)hgx.a(context, gms)).a(j);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new apc(context);
        }
        map = d;
        map;
        JVM INSTR monitorenter ;
        apa2 = (apa)d.get(Integer.valueOf(j));
        apa1 = apa2;
        if (apa2 != null)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        if (!gmu1.d("sms_only") && !gmu1.a())
        {
            context = String.valueOf(ebw.b(gmu1.b("account_name")));
            ebw.g("Babel", (new StringBuilder(String.valueOf(context).length() + 22)).append("Account ").append(context).append(" not logged in").toString());
            throw new apc();
        }
        break MISSING_BLOCK_LABEL_151;
        context;
        map;
        JVM INSTR monitorexit ;
        throw context;
        apa1 = new apa(context, j);
        d.put(Integer.valueOf(j), apa1);
        map;
        JVM INSTR monitorexit ;
        return apa1;
    }

    private static cey a(Context context, SQLiteDatabase sqlitedatabase)
    {
        String s = sqlitedatabase.getPath();
        int j = s.lastIndexOf(File.separator);
        if (j >= 0)
        {
            sqlitedatabase = s.substring(j + 1);
        } else
        {
            sqlitedatabase = s;
        }
        try
        {
            context = ank.a(context, Integer.parseInt(sqlitedatabase.substring(5, sqlitedatabase.length() - 3)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = String.valueOf(s);
            if (context.length() != 0)
            {
                context = "unable to parse database file name to determine index: ".concat(context);
            } else
            {
                context = new String("unable to parse database file name to determine index: ");
            }
            Log.wtf("Babel", context);
            return null;
        }
        return context;
    }

    private static String a(SQLiteDatabase sqlitedatabase, cey cey1, Map map)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        obj = null;
        obj2 = map.get("participant_ids");
        obj3 = map.get("participants");
        obj1 = map.get("1on1_participant_first_name");
        map = obj;
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        map = obj;
        if (obj3 == null) goto _L2; else goto _L3
_L3:
        map = obj;
        if (!(obj2 instanceof List)) goto _L2; else goto _L4
_L4:
        map = obj;
        if (!(obj3 instanceof eay)) goto _L2; else goto _L5
_L5:
        map = new StringBuilder();
        obj2 = (List)obj2;
        obj3 = (eay)obj3;
        Iterator iterator = ((List) (obj2)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj4 = iterator.next();
            if (obj4 instanceof cey)
            {
                obj4 = (cey)obj4;
                Object obj5 = ((eay) (obj3)).get(obj4);
                if (obj5 != null && (obj5 instanceof String))
                {
                    int j = a(sqlitedatabase, ((cey) (obj4)).a, ((cey) (obj4)).b, null, null, (String)obj5);
                    if (j >= 0)
                    {
                        if (map.length() > 0)
                        {
                            map.append('|');
                        }
                        map.append(j);
                    }
                }
            }
        } while (true);
        if (cey1 == null || obj1 == null || !(obj1 instanceof String) || ((List) (obj2)).size() != 1) goto _L7; else goto _L6
_L6:
        obj2 = ((List) (obj2)).get(0);
        if (!(obj2 instanceof cey) || !cey1.a((cey)obj2)) goto _L7; else goto _L8
_L8:
        int k = a(sqlitedatabase, null, null, null, null, (String)obj1);
        if (k < 0) goto _L7; else goto _L9
_L9:
        sqlitedatabase = new StringBuilder();
        sqlitedatabase.append(k);
_L11:
        map = obj;
        if (sqlitedatabase.length() > 0)
        {
            map = sqlitedatabase.toString();
        }
_L2:
        return map;
_L7:
        sqlitedatabase = map;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private static String a(SQLiteDatabase sqlitedatabase, Map map, boolean flag)
    {
        Iterator iterator = null;
        Object obj = map.get("participant_ids");
        if (flag && obj != null && (obj instanceof List))
        {
            map = new StringBuilder();
            iterator = ((List)obj).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj1 = iterator.next();
                Object obj2;
                int j;
                if (obj1 != null && (obj1 instanceof daf))
                {
                    obj1 = (daf)obj1;
                    j = a(sqlitedatabase, ((daf) (obj1)).a, ((daf) (obj1)).b, ((daf) (obj1)).d, ((daf) (obj1)).c, ((daf) (obj1)).e);
                } else
                {
                    j = -1;
                }
                if (j >= 0)
                {
                    if (map.length() > 0)
                    {
                        map.append('|');
                    }
                    map.append(j);
                }
            } while (true);
            if (map.length() > 0)
            {
                sqlitedatabase = map.toString();
            } else
            {
                sqlitedatabase = null;
            }
            map = sqlitedatabase;
        } else
        {
            obj2 = map.get("participants");
            map = iterator;
            if (obj2 != null)
            {
                map = iterator;
                if (obj2 instanceof List)
                {
                    obj1 = new StringBuilder();
                    map = ((List)obj2).iterator();
                    do
                    {
                        if (!map.hasNext())
                        {
                            break;
                        }
                        obj2 = map.next();
                        if (obj2 instanceof String)
                        {
                            j = a(sqlitedatabase, null, null, null, null, (String)obj2);
                        } else
                        if (obj2 instanceof cey)
                        {
                            obj2 = (cey)obj2;
                            j = a(sqlitedatabase, ((cey) (obj2)).a, ((cey) (obj2)).b, null, null, null);
                        } else
                        {
                            j = -1;
                        }
                        if (j >= 0)
                        {
                            if (((StringBuilder) (obj1)).length() > 0)
                            {
                                ((StringBuilder) (obj1)).append('|');
                            }
                            ((StringBuilder) (obj1)).append(j);
                        }
                    } while (true);
                    map = iterator;
                    if (((StringBuilder) (obj1)).length() > 0)
                    {
                        return ((StringBuilder) (obj1)).toString();
                    }
                }
            }
        }
        return map;
    }

    private static String a(Map map)
    {
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
            objectoutputstream.writeObject(map);
            objectoutputstream.close();
            map = Base64.encodeToString(bytearrayoutputstream.toByteArray(), 0);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            ebw.e("Babel", "got exception serializing strings array", map);
            return null;
        }
        return map;
    }

    private static Map a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_62;
        }
        s = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(s.getBytes(), 0)));
        s = (Map)s.readObject();
        return s;
        s;
        ebw.e("Babel", "error decoding", s);
        return null;
        s;
        ebw.e("Babel", "decode object failure", s);
        return null;
    }

    private static void a(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor;
        cursor = sqlitedatabase.query("conversations", new String[] {
            "conversation_id", "generated_name"
        }, null, null, null, null, null);
        break MISSING_BLOCK_LABEL_29;
        sqlitedatabase;
        if (cursor != null)
        {
            cursor.close();
        }
        throw sqlitedatabase;
        do
        {
            if (!cursor.moveToNext())
            {
                break;
            }
            String s = cursor.getString(1);
            if (s.matches("^\\+?[0-9]+$"))
            {
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("generated_name", ebz.p(s));
                sqlitedatabase.update("conversations", contentvalues, "conversation_id=?", new String[] {
                    cursor.getString(0)
                });
            }
        } while (true);
        if (cursor != null)
        {
            cursor.close();
        }
        return;
    }

    private static void a(SQLiteDatabase sqlitedatabase, String s, String s1)
    {
        sqlitedatabase.execSQL("PRAGMA foreign_keys=OFF;");
        sqlitedatabase.execSQL("alter table conversations rename to temp");
        sqlitedatabase.execSQL(s1);
        s1 = String.valueOf("insert into conversations(");
        sqlitedatabase.execSQL((new StringBuilder(String.valueOf(s1).length() + 20 + String.valueOf(s).length() + String.valueOf(s).length())).append(s1).append(s).append(") select ").append(s).append(" from temp;").toString());
        sqlitedatabase.execSQL("drop table temp");
        sqlitedatabase.execSQL("PRAGMA foreign_keys=ON;");
    }

    private static void a(SQLiteDatabase sqlitedatabase, String as[], String s, String s1, String s2)
    {
        ContentValues contentvalues;
        String as1[];
        contentvalues = new ContentValues();
        as1 = new String[1];
        s1 = sqlitedatabase.query(s, as, s1, null, null, null, null);
_L4:
        if (!s1.moveToNext()) goto _L2; else goto _L1
_L1:
        Object obj = a(s1.getString(1));
        if (obj == null) goto _L4; else goto _L3
_L3:
        Integer integer = (Integer)((Map) (obj)).get("type");
        if (integer == null) goto _L4; else goto _L5
_L5:
        ((Map) (obj)).put("type", Integer.valueOf(g.a(integer, 0) + 1));
        obj = a(((Map) (obj)));
        contentvalues.put(as[1], ((String) (obj)));
        as1[0] = s1.getString(0);
        sqlitedatabase.update(s, contentvalues, s2, as1);
          goto _L4
        sqlitedatabase;
_L7:
        if (s1 != null)
        {
            s1.close();
        }
        throw sqlitedatabase;
_L2:
        if (s1 != null)
        {
            s1.close();
        }
        return;
        sqlitedatabase;
        s1 = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static void b(Context context, int j)
    {
        Object obj = (gms)hgx.a(context, gms);
        String s;
        boolean flag;
        if (!((gms) (obj)).c(j) || !((gms) (obj)).a(j).a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.b(flag);
        obj = String.valueOf("babel");
        s = String.valueOf(".db");
        flag = context.deleteDatabase((new StringBuilder(String.valueOf(obj).length() + 11 + String.valueOf(s).length())).append(((String) (obj))).append(j).append(s).toString());
        ebw.e("Babel", (new StringBuilder(30)).append("deleted: ").append(flag).append(" for ").append(j).toString());
        synchronized (d)
        {
            d.remove(Integer.valueOf(j));
        }
        return;
        exception;
        context;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void b(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor;
        HashSet hashset;
        HashSet hashset1;
        gmw gmw1;
        hashset = new HashSet();
        hashset.add("dnd_expiration");
        hashset.add(EsProvider.a(3));
        hashset.add(EsProvider.a(2));
        hashset.add(EsProvider.a(1));
        hashset.add(EsProvider.a(5));
        hashset.add(EsProvider.a(4));
        hashset.add("last_invite_seen_timestamp");
        hashset.add("last_suggested_contacts_time");
        hashset.add("sms_last_full_sync_time_millis");
        hashset.add("refresh_participants_time");
        hashset.add("last_warm_sync_localtime");
        hashset.add("second_peak_scroll_time");
        hashset.add("second_peak_scroll_to_conversation_timestamp");
        hashset.add("sms_last_sync_time_millis");
        hashset.add("last_successful_sync_time");
        hashset1 = new HashSet();
        hashset1.add("hash_pinned");
        hashset1.add("hash_favorites");
        hashset1.add("hash_people_you_hangout_with");
        hashset1.add("hash_other_people_on_hangout");
        hashset1.add("hash_dismissed_contacts");
        cursor = sqlitedatabase.query("realtimechat_metadata", new String[] {
            "key", "value"
        }, null, null, null, null, null);
        gmw1 = ((gms)hgx.a(a, gms)).b(f);
_L1:
        String s;
        String s1;
        do
        {
            if (!cursor.moveToNext())
            {
                break MISSING_BLOCK_LABEL_426;
            }
            s = cursor.getString(0);
            s1 = cursor.getString(1);
            if (!hashset.contains(s))
            {
                break MISSING_BLOCK_LABEL_358;
            }
            gmw1.c(s, Long.parseLong(s1));
        } while (true);
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
label0:
        {
            if (!hashset1.contains(s))
            {
                break label0;
            }
            gmw1.c(s, s1);
        }
          goto _L1
        s = String.valueOf(s);
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_412;
        }
        s = "Dropping metadata key ".concat(s);
_L2:
        ebw.f("Babel", s);
          goto _L1
        s = new String("Dropping metadata key ");
          goto _L2
        gmw1.d();
        cursor.close();
        sqlitedatabase.execSQL("drop table if exists realtimechat_metadata;");
        return;
    }

    private void c(SQLiteDatabase sqlitedatabase)
    {
        Object obj2 = a(a, sqlitedatabase);
        Object obj1;
        ContentValues contentvalues;
        String as1[];
        contentvalues = new ContentValues();
        as1 = new String[1];
        String s = String.valueOf("( type != ");
        int j = dqc.b.ordinal();
        obj1 = String.valueOf("type");
        int l = dqc.c.ordinal();
        s = (new StringBuilder(String.valueOf(s).length() + 33 + String.valueOf(obj1).length())).append(s).append(j).append(" AND ").append(((String) (obj1))).append(" != ").append(l).append(" )").toString();
        obj1 = sqlitedatabase.query("messages", new String[] {
            "_id", "type", "text"
        }, s, null, null, null, null);
_L6:
        if (!((Cursor) (obj1)).moveToNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        Map map;
        obj = dqc.values()[((Cursor) (obj1)).getInt(1)];
        contentvalues.clear();
        map = a(((Cursor) (obj1)).getString(2));
        if (map == null) goto _L4; else goto _L3
_L3:
        if (map.size() != 0) goto _L5; else goto _L4
_L4:
        if (obj == dqc.e)
        {
            contentvalues.put("type", Integer.valueOf(dqc.m.ordinal()));
            Log.wtf("Babel", "No system message parameters for a membership change event");
        }
_L7:
        if (contentvalues.size() > 0)
        {
            contentvalues.putNull("text");
            as1[0] = ((Cursor) (obj1)).getString(0);
            if (sqlitedatabase.update("messages", contentvalues, "_id=?", as1) != 1)
            {
                sqlitedatabase.update("messages", contentvalues, "_id=?", as1);
            }
        }
          goto _L6
        sqlitedatabase;
_L35:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw sqlitedatabase;
_L5:
        apb.a[((dqc) (obj)).ordinal()];
        JVM INSTR tableswitch 1 8: default 841
    //                   1 372
    //                   2 409
    //                   3 829
    //                   4 829
    //                   5 829
    //                   6 240
    //                   7 240
    //                   8 509;
           goto _L7 _L8 _L9 _L10 _L10 _L10 _L7 _L7 _L11
_L8:
        obj = map.get("new_name");
        if (obj == null) goto _L7; else goto _L12
_L12:
        if (!(obj instanceof String)) goto _L7; else goto _L13
_L13:
        contentvalues.put("new_conversation_name", (String)obj);
          goto _L7
_L9:
        Object obj3;
        obj = dqc.m;
        obj3 = map.get("type");
        if (obj3 == null) goto _L15; else goto _L14
_L14:
        if (!(obj3 instanceof Integer)) goto _L15; else goto _L16
_L16:
        int k = g.a((Integer)obj3, 0);
        if (k != 2) goto _L18; else goto _L17
_L17:
        obj = dqc.l;
          goto _L19
_L37:
        contentvalues.put("type", Integer.valueOf(((dqc) (obj)).ordinal()));
_L36:
        boolean flag;
        obj = a(sqlitedatabase, map, flag);
        if (obj == null) goto _L7; else goto _L20
_L20:
        contentvalues.put("participant_keys", ((String) (obj)));
          goto _L7
_L18:
        obj = dqc.m;
          goto _L19
_L11:
        obj = a(sqlitedatabase, ((cey) (obj2)), map);
        if (obj == null) goto _L7; else goto _L21
_L21:
        contentvalues.put("participant_keys", ((String) (obj)));
          goto _L7
_L2:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        obj1 = null;
        obj = obj1;
        obj2 = new ContentValues();
        obj = obj1;
        String as[] = new String[1];
        obj = obj1;
        obj1 = sqlitedatabase.rawQuery("SELECT conversations._id, conversations.snippet_type, messages.author_chat_id, messages.author_gaia_id, messages.new_conversation_name, messages.participant_keys FROM conversations LEFT JOIN messages ON ( conversations.snippet_message_row_id = messages._id ) WHERE ( conversations.snippet_type = 4 OR conversations.snippet_type = 5 )", null);
_L32:
        obj = obj1;
        if (!((Cursor) (obj1)).moveToNext()) goto _L23; else goto _L22
_L22:
        obj = obj1;
        k = ((Cursor) (obj1)).getInt(1);
        obj = obj1;
        ((ContentValues) (obj2)).clear();
        k;
        JVM INSTR tableswitch 4 5: default 862
    //                   4 781
    //                   5 750;
           goto _L24 _L25 _L26
_L24:
        obj = obj1;
        String s1 = ((Cursor) (obj1)).getString(2);
        if (s1 == null) goto _L28; else goto _L27
_L27:
        obj = obj1;
        ((ContentValues) (obj2)).put("snippet_author_chat_id", s1);
_L28:
        obj = obj1;
        s1 = ((Cursor) (obj1)).getString(3);
        if (s1 == null) goto _L30; else goto _L29
_L29:
        obj = obj1;
        ((ContentValues) (obj2)).put("snippet_author_gaia_id", s1);
_L30:
        obj = obj1;
        if (((ContentValues) (obj2)).size() <= 0) goto _L32; else goto _L31
_L31:
        obj = obj1;
        ((ContentValues) (obj2)).putNull("snippet_text");
        obj = obj1;
        as[0] = ((Cursor) (obj1)).getString(0);
        obj = obj1;
        sqlitedatabase.update("conversations", ((ContentValues) (obj2)), "_id=?", as);
          goto _L32
        sqlitedatabase;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw sqlitedatabase;
_L26:
        obj = obj1;
        s1 = ((Cursor) (obj1)).getString(4);
        if (s1 == null) goto _L24; else goto _L33
_L33:
        obj = obj1;
        ((ContentValues) (obj2)).put("snippet_new_conversation_name", s1);
          goto _L24
_L25:
        obj = obj1;
        s1 = ((Cursor) (obj1)).getString(5);
        if (s1 == null) goto _L24; else goto _L34
_L34:
        obj = obj1;
        ((ContentValues) (obj2)).put("snippet_participant_keys", s1);
          goto _L24
_L23:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return;
        sqlitedatabase;
        obj1 = null;
          goto _L35
_L10:
        flag = false;
          goto _L36
_L15:
        flag = false;
          goto _L37
_L19:
        if (k == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L37
    }

    private static void d(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor = sqlitedatabase.query("messages", new String[] {
            "conversation_id", "participant_keys"
        }, "participant_keys IS NOT NULL", null, null, null, null);
_L4:
        if (!cursor.moveToNext()) goto _L2; else goto _L1
_L1:
        String s1;
        Object obj1;
        s1 = cursor.getString(0);
        String s = cursor.getString(1);
        obj1 = new android.text.TextUtils.SimpleStringSplitter('|');
        ((android.text.TextUtils.SimpleStringSplitter) (obj1)).setString(s);
        obj1 = ((android.text.TextUtils.SimpleStringSplitter) (obj1)).iterator();
_L11:
        if (!((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        String s2 = (String)((Iterator) (obj1)).next();
        Object obj = sqlitedatabase.query("participants", i, "_id=?", new String[] {
            s2
        }, null, null, null);
        if (!((Cursor) (obj)).moveToFirst()) goto _L6; else goto _L5
_L5:
        String s3 = ((Cursor) (obj)).getString(0);
        if (s3 == null) goto _L6; else goto _L7
_L7:
        boolean flag = true;
_L19:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        ((Cursor) (obj)).close();
        obj = sqlitedatabase.query("conversation_participants", new String[] {
            "_id"
        }, "participant_row_id=? AND conversation_id=?", new String[] {
            s2, s1
        }, null, null, null);
        boolean flag1 = ((Cursor) (obj)).moveToFirst();
        int j;
        if (flag1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (obj == null) goto _L9; else goto _L8
_L8:
        ((Cursor) (obj)).close();
_L9:
        if (j != 0) goto _L11; else goto _L10
_L10:
        obj = sqlitedatabase.query("conversation_participants", new String[] {
            "MAX(sequence)"
        }, "conversation_id=?", new String[] {
            s1
        }, null, null, null);
        if (!((Cursor) (obj)).moveToFirst()) goto _L13; else goto _L12
_L12:
        j = ((Cursor) (obj)).getInt(0);
_L18:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_290;
        }
        ((Cursor) (obj)).close();
        obj = new ContentValues();
        ((ContentValues) (obj)).put("conversation_id", s1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_327;
        }
        ((ContentValues) (obj)).put("participant_type", Integer.valueOf(cfa.c.ordinal()));
        ((ContentValues) (obj)).put("participant_row_id", s2);
        ((ContentValues) (obj)).put("sequence", Integer.valueOf(j + 1));
        ((ContentValues) (obj)).put("active", Integer.valueOf(0));
        sqlitedatabase.insert("conversation_participants", null, ((ContentValues) (obj)));
          goto _L11
        sqlitedatabase;
        obj = cursor;
_L14:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw sqlitedatabase;
        sqlitedatabase;
        obj = null;
_L17:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_402;
        }
        ((Cursor) (obj)).close();
        throw sqlitedatabase;
_L16:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_414;
        }
        ((Cursor) (obj)).close();
        throw sqlitedatabase;
_L15:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_426;
        }
        ((Cursor) (obj)).close();
        throw sqlitedatabase;
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
        return;
        sqlitedatabase;
        obj = null;
          goto _L14
        sqlitedatabase;
          goto _L15
        sqlitedatabase;
          goto _L16
        sqlitedatabase;
          goto _L17
_L13:
        j = 0;
          goto _L18
_L6:
        flag = false;
          goto _L19
        sqlitedatabase;
        obj = null;
          goto _L16
        sqlitedatabase;
        obj = null;
          goto _L15
    }

    static boolean d()
    {
        return b;
    }

    private void e(SQLiteDatabase sqlitedatabase)
    {
        String as[] = EsProvider.c();
        int j = 0;
_L2:
        String s;
        if (j >= 7)
        {
            break; /* Loop/switch isn't completed */
        }
        s = as[j];
        sqlitedatabase.execSQL((new StringBuilder(String.valueOf(s).length() + 21)).append("drop view if exists ").append(s).append(";").toString());
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        as = bzx.d();
        j = 0;
_L4:
        if (j > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        s = as[0];
        sqlitedatabase.execSQL((new StringBuilder(String.valueOf(s).length() + 21)).append("drop view if exists ").append(s).append(";").toString());
        j++;
        if (true) goto _L4; else goto _L3
_L3:
        as = EsProvider.d();
        j = 0;
_L6:
        if (j >= 7)
        {
            break; /* Loop/switch isn't completed */
        }
        sqlitedatabase.execSQL(as[j]);
        j++;
        if (true) goto _L6; else goto _L5
_L5:
        as = bzx.c();
        j = 0;
_L8:
        if (j > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        sqlitedatabase.execSQL(as[0]);
        j++;
        if (true) goto _L8; else goto _L7
_L7:
        boolean flag = true;
_L10:
        if (!flag)
        {
            f(sqlitedatabase);
        }
        return;
        Throwable throwable;
        throwable;
        ebw.e("Babel", "couldn't rebuild views -- will rebuild whole db", throwable);
        flag = false;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void f(SQLiteDatabase sqlitedatabase)
    {
        int j;
        boolean flag;
        j = 0;
        flag = true;
_L4:
        Cursor cursor;
        int k;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        k = j + 1;
        if (j >= 5)
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = sqlitedatabase.query("sqlite_master", c, "type='table'", null, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        flag = false;
_L1:
        String s2;
        boolean flag1;
        do
        {
            do
            {
                if (!cursor.moveToNext())
                {
                    break MISSING_BLOCK_LABEL_217;
                }
                s2 = cursor.getString(0);
            } while (s2.startsWith("android_"));
            flag1 = s2.startsWith("sqlite_");
        } while (flag1);
        String s;
        s = String.valueOf("DROP TABLE IF EXISTS ");
        String s3 = String.valueOf(s2);
        if (s3.length() == 0)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        s = s.concat(s3);
_L2:
        sqlitedatabase.execSQL(s);
        flag = true;
          goto _L1
        s = new String(s);
          goto _L2
        SQLException sqlexception;
        sqlexception;
        String s1 = String.valueOf(sqlexception);
        ebw.c("Babel", (new StringBuilder(String.valueOf(s2).length() + 22 + String.valueOf(s1).length())).append("unable to drop table ").append(s2).append(" ").append(s1).toString());
          goto _L1
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
        cursor.close();
        j = k;
        continue; /* Loop/switch isn't completed */
        j = k;
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        g(sqlitedatabase);
        h(sqlitedatabase);
        onCreate(sqlitedatabase);
        return;
    }

    private static void g(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor = sqlitedatabase.query("sqlite_master", c, "type='view'", null, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToNext()) goto _L4; else goto _L3
_L3:
        String s = cursor.getString(0);
        Object obj;
        String s1;
        obj = String.valueOf("DROP VIEW IF EXISTS ");
        s1 = String.valueOf(s);
        if (s1.length() == 0) goto _L6; else goto _L5
_L5:
        obj = ((String) (obj)).concat(s1);
_L7:
        sqlitedatabase.execSQL(((String) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        if (ebw.a("Babel", 3))
        {
            obj = String.valueOf(obj);
            ebw.c("Babel", (new StringBuilder(String.valueOf(s).length() + 21 + String.valueOf(obj).length())).append("unable to drop view ").append(s).append(" ").append(((String) (obj))).toString());
        }
        continue; /* Loop/switch isn't completed */
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
_L6:
        obj = new String(((String) (obj)));
        if (true) goto _L7; else goto _L4
_L4:
        cursor.close();
_L2:
        return;
        if (true) goto _L1; else goto _L8
_L8:
    }

    private static void h(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor = sqlitedatabase.query("sqlite_master", c, "type='index'", null, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToNext()) goto _L4; else goto _L3
_L3:
        String s = cursor.getString(0);
        Object obj;
        String s1;
        obj = String.valueOf("DROP INDEX IF EXISTS ");
        s1 = String.valueOf(s);
        if (s1.length() == 0) goto _L6; else goto _L5
_L5:
        obj = ((String) (obj)).concat(s1);
_L7:
        sqlitedatabase.execSQL(((String) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        if (ebw.a("Babel", 3))
        {
            obj = String.valueOf(obj);
            ebw.c("Babel", (new StringBuilder(String.valueOf(s).length() + 22 + String.valueOf(obj).length())).append("unable to drop index ").append(s).append(" ").append(((String) (obj))).toString());
        }
        continue; /* Loop/switch isn't completed */
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
_L6:
        obj = new String(((String) (obj)));
        if (true) goto _L7; else goto _L4
_L4:
        cursor.close();
_L2:
        return;
        if (true) goto _L1; else goto _L8
_L8:
    }

    public apd a()
    {
        this;
        JVM INSTR monitorenter ;
        apd apd1 = apd.a(a, getReadableDatabase());
        this;
        JVM INSTR monitorexit ;
        return apd1;
        Exception exception;
        exception;
        throw exception;
    }

    public apd b()
    {
        this;
        JVM INSTR monitorenter ;
        apd apd1 = apd.a(a, getWritableDatabase());
        this;
        JVM INSTR monitorexit ;
        return apd1;
        Exception exception;
        exception;
        throw exception;
    }

    public void c()
    {
        if (b)
        {
            ebw.b("Babel", "[EsDatabaseHelper] createNewDatabase");
        }
        e = false;
    }

    public SQLiteDatabase getReadableDatabase()
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new SQLiteException("Database deleted");
        }
        break MISSING_BLOCK_LABEL_25;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        SQLiteDatabase sqlitedatabase = super.getReadableDatabase();
_L1:
        this;
        JVM INSTR monitorexit ;
        return sqlitedatabase;
        sqlitedatabase;
label0:
        {
            String s = String.valueOf(sqlitedatabase);
            ebw.f("Babel", (new StringBuilder(String.valueOf(s).length() + 56)).append("[EsDatabaseHelper] getWritableDatabase threw exception: ").append(s).toString());
            if (!(sqlitedatabase instanceof SQLiteCantOpenDatabaseException))
            {
                break label0;
            }
            a.deleteDatabase(g);
            sqlitedatabase = super.getReadableDatabase();
        }
          goto _L1
        throw sqlitedatabase;
    }

    public SQLiteDatabase getWritableDatabase()
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new SQLiteException("Database deleted");
        }
        break MISSING_BLOCK_LABEL_25;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        SQLiteDatabase sqlitedatabase = super.getWritableDatabase();
_L1:
        this;
        JVM INSTR monitorexit ;
        return sqlitedatabase;
        sqlitedatabase;
label0:
        {
            String s = String.valueOf(sqlitedatabase);
            ebw.f("Babel", (new StringBuilder(String.valueOf(s).length() + 56)).append("[EsDatabaseHelper] getWritableDatabase threw exception: ").append(s).toString());
            if (!(sqlitedatabase instanceof SQLiteCantOpenDatabaseException))
            {
                break label0;
            }
            a.deleteDatabase(g);
            sqlitedatabase = super.getWritableDatabase();
        }
          goto _L1
        throw sqlitedatabase;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        boolean flag = false;
        String as[] = EsProvider.a();
        for (int j = 0; j < 16; j++)
        {
            sqlitedatabase.execSQL(as[j]);
        }

        as = bzx.b();
        for (int k = 0; k < 2; k++)
        {
            sqlitedatabase.execSQL(as[k]);
        }

        as = EsProvider.b();
        for (int l = 0; l < 17; l++)
        {
            sqlitedatabase.execSQL(as[l]);
        }

        as = EsProvider.d();
        for (int i1 = 0; i1 < 7; i1++)
        {
            sqlitedatabase.execSQL(as[i1]);
        }

        as = bzx.c();
        for (int j1 = 0; j1 <= 0; j1++)
        {
            sqlitedatabase.execSQL(as[0]);
        }

        as = EsProvider.e();
        for (int k1 = ((flag) ? 1 : 0); k1 < 2; k1++)
        {
            sqlitedatabase.execSQL(as[k1]);
        }

    }

    public void onDowngrade(SQLiteDatabase sqlitedatabase, int j, int k)
    {
        ebw.g("Babel", (new StringBuilder(43)).append("Downgrading from:").append(j).append(" to:").append(k).toString());
        f(sqlitedatabase);
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            sqlitedatabase = (ActivityManager)a.getSystemService("activity");
            ebw.g("Babel", "Clearing app data, service will be restarted!");
            sqlitedatabase.clearApplicationUserData();
        }
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        if (!sqlitedatabase.isReadOnly())
        {
            sqlitedatabase.execSQL("PRAGMA foreign_keys=ON;");
        }
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int j, int k)
    {
        boolean flag1;
        flag1 = true;
        if (ebw.a("Babel", 3))
        {
            ebw.c("Babel", (new StringBuilder(45)).append("Upgrade database: ").append(j).append(" --> ").append(k).toString());
        }
        char c1 = '\362';
        if ("hammerhead".equals(Build.HARDWARE))
        {
            c1 = '\352';
        }
        if (j > 138 && j < c1 || j > 219 && j < 225 || j > 402 && j < 430)
        {
            ebw.f("Babel", (new StringBuilder(50)).append("upgrade from ").append(j).append(" not supported; recreating").toString());
            f(sqlitedatabase);
            return;
        }
        j;
        JVM INSTR lookupswitch 132: default 1220
    //                   138: 1342
    //                   200: 1516
    //                   203: 1516
    //                   204: 1523
    //                   205: 1523
    //                   206: 1530
    //                   207: 1530
    //                   208: 1537
    //                   209: 1537
    //                   210: 1558
    //                   211: 1579
    //                   212: 1607
    //                   213: 1607
    //                   214: 1607
    //                   215: 1607
    //                   216: 1614
    //                   217: 1621
    //                   218: 1628
    //                   220: 1635
    //                   222: 1635
    //                   223: 1642
    //                   224: 1677
    //                   225: 1677
    //                   227: 1691
    //                   228: 1698
    //                   229: 1705
    //                   230: 1705
    //                   232: 1705
    //                   233: 1705
    //                   234: 1705
    //                   235: 1719
    //                   236: 1719
    //                   237: 1775
    //                   238: 1775
    //                   239: 1782
    //                   240: 1789
    //                   241: 1789
    //                   242: 1789
    //                   271: 1810
    //                   400: 1838
    //                   401: 1838
    //                   402: 1845
    //                   403: 1929
    //                   404: 1943
    //                   405: 1950
    //                   406: 1950
    //                   407: 2006
    //                   408: 2006
    //                   409: 2046
    //                   410: 2046
    //                   411: 2046
    //                   412: 2046
    //                   413: 2088
    //                   414: 2102
    //                   415: 2119
    //                   416: 2119
    //                   417: 2119
    //                   418: 2123
    //                   419: 2137
    //                   420: 2137
    //                   422: 2151
    //                   423: 2151
    //                   424: 2151
    //                   425: 2151
    //                   426: 2172
    //                   427: 2172
    //                   428: 2172
    //                   429: 2172
    //                   430: 2179
    //                   431: 2179
    //                   432: 2179
    //                   433: 2179
    //                   434: 2179
    //                   435: 2179
    //                   436: 2189
    //                   437: 2189
    //                   438: 2196
    //                   439: 2250
    //                   440: 2250
    //                   450: 2250
    //                   460: 2250
    //                   470: 2250
    //                   480: 2250
    //                   490: 2250
    //                   500: 2292
    //                   510: 2292
    //                   520: 2299
    //                   530: 2320
    //                   540: 2327
    //                   541: 2362
    //                   550: 2376
    //                   560: 2376
    //                   570: 2390
    //                   580: 2397
    //                   590: 2411
    //                   600: 2453
    //                   610: 2453
    //                   620: 2460
    //                   630: 2488
    //                   640: 2488
    //                   650: 2488
    //                   770: 2488
    //                   780: 2539
    //                   790: 2543
    //                   800: 2550
    //                   810: 2564
    //                   820: 2578
    //                   830: 2585
    //                   840: 2592
    //                   850: 2599
    //                   860: 2613
    //                   870: 2620
    //                   880: 2620
    //                   890: 2627
    //                   900: 2644
    //                   910: 2658
    //                   920: 2658
    //                   930: 2828
    //                   940: 2835
    //                   950: 2842
    //                   960: 2842
    //                   970: 2847
    //                   980: 2854
    //                   990: 2875
    //                   1000: 2875
    //                   1010: 2875
    //                   1020: 2875
    //                   1030: 2921
    //                   1040: 2928
    //                   1050: 2949
    //                   1060: 2949
    //                   2147483647: 2949;
           goto _L1 _L2 _L3 _L3 _L4 _L4 _L5 _L5 _L6 _L6 _L7 _L8 _L9 _L9 _L9 _L9 _L10 _L11 _L12 _L13 _L13 _L14 _L15 _L15 _L16 _L17 _L18 _L18 _L18 _L18 _L18 _L19 _L19 _L20 _L20 _L21 _L22 _L22 _L22 _L23 _L24 _L24 _L25 _L26 _L27 _L28 _L28 _L29 _L29 _L30 _L30 _L30 _L30 _L31 _L32 _L33 _L33 _L33 _L34 _L35 _L35 _L36 _L36 _L36 _L36 _L37 _L37 _L37 _L37 _L38 _L38 _L38 _L38 _L38 _L38 _L39 _L39 _L40 _L41 _L41 _L41 _L41 _L41 _L41 _L41 _L42 _L42 _L43 _L44 _L45 _L46 _L47 _L47 _L48 _L49 _L50 _L51 _L51 _L52 _L53 _L53 _L53 _L53 _L54 _L55 _L56 _L57 _L58 _L59 _L60 _L61 _L62 _L63 _L63 _L64 _L65 _L66 _L66 _L67 _L68 _L69 _L69 _L70 _L71 _L72 _L72 _L72 _L72 _L73 _L74 _L75 _L75 _L75
_L1:
        Object obj;
        try
        {
            if (((ecs)hgx.a(a, ecs)).a())
            {
                throw new IllegalStateException((new StringBuilder(52)).append("Must support upgrade from ").append(j).append(" to ").append(k).toString());
            }
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            String s;
            int l;
            boolean flag;
            if (((ecs)hgx.a(a, ecs)).a())
            {
                throw new RuntimeException((new StringBuilder(49)).append("Unable to upgrade from ").append(j).append(" to ").append(k).toString(), ((Throwable) (obj)));
            }
            s = String.valueOf(((Throwable) (obj)).getMessage());
            ebw.e("Babel", (new StringBuilder(String.valueOf(s).length() + 46)).append("Upgrade database: ").append(j).append(" --> ").append(k).append(" ").append(s).toString(), ((Throwable) (obj)));
            flag = false;
        }
          goto _L76
_L2:
        sqlitedatabase.execSQL("PRAGMA foreign_keys=OFF;");
        sqlitedatabase.execSQL("ALTER TABLE messages ADD COLUMN attachment_content_type TEXT");
        sqlitedatabase.execSQL("alter table participants rename to temp");
        sqlitedatabase.execSQL(EsProvider.b);
        sqlitedatabase.execSQL("insert into participants(_id, participant_type, gaia_id, chat_id, circle_id, first_name, full_name, fallback_name, profile_photo_url, batch_gebi_tag, blocked) select _id, participant_type, gaia_id, chat_id, circle_id, first_name, full_name, fallback_name, profile_photo_url, batch_gebi_tag, blocked from temp;");
        sqlitedatabase.execSQL("drop table temp");
        sqlitedatabase.execSQL("CREATE INDEX index_participants_chat_id ON participants(chat_id)");
        sqlitedatabase.execSQL("PRAGMA foreign_keys=ON;");
        sqlitedatabase.execSQL("update conversations set otr_status = otr_status + 1;");
        obj = String.valueOf("type=");
        l = dqc.e.ordinal();
        obj = (new StringBuilder(String.valueOf(obj).length() + 11)).append(((String) (obj))).append(l).toString();
        a(sqlitedatabase, new String[] {
            "_id", "text"
        }, "messages", ((String) (obj)), "_id=?");
        a(sqlitedatabase, new String[] {
            "_id", "snippet_text"
        }, "conversations", "snippet_type=4", "_id=?");
        sqlitedatabase.execSQL("update conversations set conversation_type = conversation_type - 1;");
_L3:
        sqlitedatabase.execSQL("alter table messages add column transport_type INT NOT NULL DEFAULT(1);");
_L4:
        sqlitedatabase.execSQL("alter table conversations add column draft_subject TEXT;");
_L5:
        sqlitedatabase.execSQL("alter table messages add column external_ids TEXT;");
_L6:
        sqlitedatabase.execSQL("alter table messages add column sms_timestamp_sent INT DEFAULT(0);");
        sqlitedatabase.execSQL("alter table messages add column sms_priority INT DEFAULT(0);");
        sqlitedatabase.execSQL("alter table messages add column sms_message_size INT DEFAULT(0);");
_L7:
        sqlitedatabase.execSQL("alter table messages add column mms_subject TEXT;");
        sqlitedatabase.execSQL("alter table messages add column sms_raw_sender TEXT;");
        sqlitedatabase.execSQL("alter table messages add column sms_raw_recipients TEXT;");
_L8:
        sqlitedatabase.execSQL("alter table conversations add column draft_attachment_url TEXT;");
        sqlitedatabase.execSQL("alter table conversations add column draft_photo_rotation INT;");
        sqlitedatabase.execSQL("alter table conversations add column draft_picasa_id TEXT;");
        sqlitedatabase.execSQL("alter table conversations add column draft_content_type TEXT;");
_L9:
        sqlitedatabase.execSQL("alter table conversations add column transport_type INT DEFAULT(1);");
_L10:
        sqlitedatabase.execSQL("alter table messages add column persisted INT DEFAULT(1);");
_L11:
        sqlitedatabase.execSQL("alter table conversations add column sms_service_center TEXT;");
_L12:
        sqlitedatabase.execSQL("alter table messages add column sms_message_status INT DEFAULT(-1);");
_L13:
        sqlitedatabase.execSQL("alter table conversations add column is_temporary INT DEFAULT(0);");
_L14:
        sqlitedatabase.execSQL("alter table messages add column location_name TEXT;");
        sqlitedatabase.execSQL("alter table messages add column latitude DOUBLE;");
        sqlitedatabase.execSQL("alter table messages add column longitude DOUBLE;");
        sqlitedatabase.execSQL("alter table messages add column static_map_url TEXT;");
        sqlitedatabase.execSQL("alter table messages add column target_map_url TEXT;");
_L15:
        sqlitedatabase.execSQL("alter table messages add column sms_type INT DEFAULT(-1);");
        sqlitedatabase.execSQL("UPDATE messages SET sms_type=(CASE WHEN external_ids LIKE 'content://sms/%' THEN 0 WHEN external_ids LIKE 'content://mms/%' THEN 1 ELSE 2 END) WHERE transport_type=1");
_L16:
        sqlitedatabase.execSQL("alter table conversations add column sms_thread_id INT DEFAULT(-1);");
_L17:
        sqlitedatabase.execSQL("alter table messages add column video_stream_url TEXT;");
_L18:
        sqlitedatabase.execSQL("CREATE INDEX index_messages_conversation_id_timestamp ON messages(conversation_id, timestamp)");
        sqlitedatabase.execSQL("CREATE INDEX index_conversation_participants_sequence ON conversation_participants(sequence)");
_L19:
        sqlitedatabase.execSQL("PRAGMA foreign_keys=OFF;");
        sqlitedatabase.execSQL("alter table messages rename to temp");
        sqlitedatabase.execSQL("CREATE TABLE messages (_id INTEGER PRIMARY KEY, message_id TEXT, message_type INT, conversation_id TEXT, author_chat_id TEXT, author_gaia_id TEXT, text TEXT, timestamp INT, status INT, type INT, local_url TEXT, remote_url TEXT, attachment_content_type TEXT, width_pixels INT, height_pixels INT, stream_id TEXT, image_id TEXT, album_id TEXT, location_name TEXT, latitude DOUBLE, longitude DOUBLE, static_map_url TEXT, target_map_url TEXT, notification_level INT, expiration_timestamp INT, notified_for_failure INT DEFAULT(0), hidden_by INT, alert_status INT DEfAULT(0), off_the_record INT DEFAULT(0), transport_type INT NOT NULL DEFAULT(1), external_ids TEXT, sms_timestamp_sent INT DEFAULT(0), sms_priority INT DEFAULT(0), sms_message_size INT DEFAULT(0), mms_subject TEXT, sms_raw_sender TEXT, sms_raw_recipients TEXT, persisted INT DEFAULT(1), sms_message_status INT DEFAULT(-1), sms_type INT DEFAULT(-1), video_stream_url TEXT, FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE,UNIQUE (conversation_id,message_id) ON CONFLICT REPLACE);");
        sqlitedatabase.execSQL("insert into messages(_id, message_id, message_type, conversation_id, author_chat_id, author_gaia_id, text, timestamp, status, type, local_url, remote_url, attachment_content_type, width_pixels, height_pixels, stream_id, image_id, album_id, location_name, latitude, longitude, static_map_url, target_map_url, notification_level, expiration_timestamp, notified_for_failure, hidden_by, alert_status, off_the_record, transport_type, external_ids, sms_timestamp_sent, sms_priority, sms_message_size, mms_subject, sms_raw_sender, sms_raw_recipients, persisted, sms_message_status, sms_type, video_stream_url) select _id, message_id, message_type, conversation_id, author_chat_id, author_gaia_id, text, timestamp, status, type, local_url, remote_url, attachment_content_type, width_pixels, height_pixels, stream_id, image_id, album_id, location_name, latitude, longitude, static_map_url, target_map_url, notification_level, expiration_timestamp, notified_for_failure, hidden_by, alert_status, off_the_record, transport_type, external_ids, sms_timestamp_sent, sms_priority, sms_message_size, mms_subject, sms_raw_sender, sms_raw_recipients, persisted, sms_message_status, sms_type, video_stream_url from temp;");
        sqlitedatabase.execSQL("drop table temp");
        sqlitedatabase.execSQL("CREATE INDEX index_messages_conversation_id_alert_status ON messages(conversation_id, alert_status)");
        sqlitedatabase.execSQL("CREATE INDEX index_messages_conversation_id_timestamp ON messages(conversation_id, timestamp)");
        sqlitedatabase.execSQL("PRAGMA foreign_keys=ON;");
_L20:
        sqlitedatabase.execSQL("CREATE TABLE mms_notification_inds (_id INTEGER PRIMARY KEY, content_location TEXT, transaction_id TEXT, from_address TEXT, message_size INT DEFAULT(0), expiry INT);");
_L21:
        sqlitedatabase.execSQL("update messages set attachment_content_type = 'image/*' where attachment_content_type isnull and (remote_url notnull or local_url notnull)");
_L22:
        sqlitedatabase.execSQL("CREATE TABLE multipart_attachments (_id INTEGER PRIMARY KEY, message_id TEXT, conversation_id TEXT, url TEXT, content_type TEXT, width INT, height INT, FOREIGN KEY (message_id, conversation_id) REFERENCES messages(message_id, conversation_id) ON DELETE CASCADE ON UPDATE CASCADE);");
        sqlitedatabase.execSQL("CREATE INDEX index_multipart_attachments_conversation_id_message_id ON multipart_attachments(conversation_id, message_id)");
        sqlitedatabase.execSQL("DROP TABLE account_status;");
_L23:
        sqlitedatabase.execSQL("alter table messages add column attachment_name TEXT;");
        sqlitedatabase.execSQL("alter table messages add column attachment_target_url TEXT;");
        sqlitedatabase.execSQL("UPDATE messages SET attachment_name = location_name, attachment_content_type = 'hangouts/location', attachment_target_url = target_map_url, remote_url = static_map_url WHERE location_name IS NOT NULL OR static_map_url IS NOT NULL OR target_map_url IS NOT NULL");
        sqlitedatabase.execSQL("UPDATE messages SET location_name= NULL, target_map_url = NULL, static_map_url = NULL");
_L24:
        sqlitedatabase.execSQL("alter table messages add column image_rotation INT DEFAULT(0);");
_L25:
        sqlitedatabase.execSQL("UPDATE messages SET transport_type=(CASE WHEN transport_type=1 THEN 0 WHEN transport_type=2 THEN 1 WHEN transport_type=4 THEN 3 ELSE 0 END)");
        sqlitedatabase.execSQL("UPDATE conversations SET transport_type=(CASE WHEN transport_type=1 THEN 0 WHEN transport_type=2 THEN 1 WHEN transport_type=4 THEN 3 ELSE 0 END)");
        sqlitedatabase.execSQL("PRAGMA foreign_keys=OFF;");
        sqlitedatabase.execSQL("alter table conversations rename to temp");
        sqlitedatabase.execSQL("CREATE TABLE conversations (_id INTEGER PRIMARY KEY, conversation_id TEXT, conversation_type INT, latest_message_timestamp INT DEFAULT(0), latest_message_expiration_timestamp INT, metadata_present INT,notification_level INT, name TEXT, generated_name TEXT, snippet_type INT, snippet_text TEXT, snippet_image_url TEXT, snippet_author_gaia_id TEXT, snippet_author_chat_id TEXT, snippet_message_row_id INT, snippet_status INT, status INT, view INT, inviter_gaia_id TEXT, inviter_chat_id TEXT, inviter_affinity INT, is_pending_leave INT, account_id INT, is_otr INT, packed_avatar_urls TEXT, self_avatar_url TEXT, self_watermark INT DEFAULT(0), chat_watermark INT DEFAULT(0), hangout_watermark INT DEFAULT(0), is_draft INT, sequence_number INT, call_media_type INT, has_joined_hangout INT, last_hangout_event_time INT, draft TEXT, draft_subject TEXT, draft_attachment_url TEXT, draft_photo_rotation INT, draft_picasa_id TEXT, draft_content_type TEXT, otr_status INT, otr_toggle INT, last_otr_modification_time INT, continuation_token BLOB, continuation_event_timestamp INT, has_oldest_message INT DEFAULT(0), sort_timestamp INT, first_peak_scroll_time INT, first_peak_scroll_to_message_timestamp INT, second_peak_scroll_time INT, second_peak_scroll_to_message_timestamp INT, conversation_hash BLOB, disposition INT DEFAULT(0), has_persistent_events INT DEFAULT(-1), transport_type INT DEFAULT(1), sms_service_center TEXT, is_temporary INT DEFAULT (0), sms_thread_id INT DEFAULT (-1), UNIQUE (conversation_id ));");
        sqlitedatabase.execSQL("insert into conversations(_id, conversation_id, conversation_type, latest_message_timestamp, latest_message_expiration_timestamp, metadata_present, notification_level, name, generated_name, snippet_type, snippet_text, snippet_image_url, snippet_author_gaia_id, snippet_author_chat_id, snippet_message_row_id, snippet_status, status, view, inviter_gaia_id, inviter_chat_id, inviter_affinity, is_pending_leave, account_id, is_otr, packed_avatar_urls, self_avatar_url, self_watermark, chat_watermark, hangout_watermark, is_draft, sequence_number, has_joined_hangout, last_hangout_event_time, draft, draft_subject, draft_attachment_url, draft_photo_rotation, draft_picasa_id, draft_content_type, otr_status, otr_toggle, last_otr_modification_time, continuation_token, continuation_event_timestamp, has_oldest_message, sort_timestamp, first_peak_scroll_time, first_peak_scroll_to_message_timestamp, second_peak_scroll_time, second_peak_scroll_to_message_timestamp, conversation_hash, disposition, has_persistent_events, transport_type, sms_service_center, is_temporary, sms_thread_id) select _id, conversation_id, conversation_type, latest_message_timestamp, latest_message_expiration_timestamp, metadata_present, notification_level, name, generated_name, snippet_type, snippet_text, snippet_image_url, snippet_author_gaia_id, snippet_author_chat_id, snippet_message_row_id, snippet_status, status, view, inviter_gaia_id, inviter_chat_id, inviter_affinity, is_pending_leave, account_id, is_otr, packed_avatar_urls, self_avatar_url, self_watermark, chat_watermark, hangout_watermark, is_draft, sequence_number, has_joined_hangout, last_hangout_event_time, draft, draft_subject, draft_attachment_url, draft_photo_rotation, draft_picasa_id, draft_content_type, otr_status, otr_toggle, last_otr_modification_time, continuation_token, continuation_event_timestamp, has_oldest_message, sort_timestamp, first_peak_scroll_time, first_peak_scroll_to_message_timestamp, second_peak_scroll_time, second_peak_scroll_to_message_timestamp, conversation_hash, disposition, has_persistent_events, transport_type, sms_service_center, is_temporary, sms_thread_id from temp;");
        sqlitedatabase.execSQL("drop table temp");
        sqlitedatabase.execSQL("alter table messages rename to temp");
        sqlitedatabase.execSQL("CREATE TABLE messages (_id INTEGER PRIMARY KEY, message_id TEXT, message_type INT, conversation_id TEXT, author_chat_id TEXT, author_gaia_id TEXT, text TEXT, timestamp INT, status INT, type INT, local_url TEXT, remote_url TEXT, attachment_content_type TEXT, width_pixels INT, height_pixels INT, stream_id TEXT, image_id TEXT, album_id TEXT, location_name TEXT, latitude DOUBLE, longitude DOUBLE, static_map_url TEXT, target_map_url TEXT, notification_level INT, expiration_timestamp INT, notified_for_failure INT DEFAULT(0), alert_status INT DEfAULT(0), off_the_record INT DEFAULT(0), transport_type INT NOT NULL DEFAULT(1), external_ids TEXT, sms_timestamp_sent INT DEFAULT(0), sms_priority INT DEFAULT(0), sms_message_size INT DEFAULT(0), mms_subject TEXT, sms_raw_sender TEXT, sms_raw_recipients TEXT, persisted INT DEFAULT(1), sms_message_status INT DEFAULT(-1), sms_type INT DEFAULT(-1), video_stream_url TEXT, attachment_target_url TEXT, attachment_name TEXT, image_rotation INT DEFAULT (0), FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE,UNIQUE (conversation_id,message_id) ON CONFLICT REPLACE);");
        sqlitedatabase.execSQL("insert into messages(_id, message_id, message_type, conversation_id, author_chat_id, author_gaia_id, text, timestamp, status, type, width_pixels, height_pixels, local_url, stream_id, image_id, album_id, image_rotation, attachment_content_type, remote_url, attachment_name, attachment_target_url, location_name, static_map_url, target_map_url, latitude, longitude, notification_level, expiration_timestamp, notified_for_failure, alert_status, off_the_record, transport_type, external_ids, sms_timestamp_sent, sms_priority, sms_message_size, mms_subject, sms_raw_sender, sms_raw_recipients, persisted, sms_message_status, sms_type, video_stream_url) select _id, message_id, message_type, conversation_id, author_chat_id, author_gaia_id, text, timestamp, status, type, width_pixels, height_pixels, local_url, stream_id, image_id, album_id, image_rotation, attachment_content_type, remote_url, attachment_name, attachment_target_url, location_name, static_map_url, target_map_url, latitude, longitude, notification_level, expiration_timestamp, notified_for_failure, alert_status, off_the_record, transport_type, external_ids, sms_timestamp_sent, sms_priority, sms_message_size, mms_subject, sms_raw_sender, sms_raw_recipients, persisted, sms_message_status, sms_type, video_stream_url from temp;");
        sqlitedatabase.execSQL("drop table temp");
        sqlitedatabase.execSQL("PRAGMA foreign_keys=ON;");
_L26:
        sqlitedatabase.execSQL("CREATE TABLE event_suggestions (_id INTEGER PRIMARY KEY, conversation_id TEXT, suggestion_id TEXT, timestamp INT, expiration_time_usec INT, type INT, gem_asset_url STRING, gem_horizontal_alignment INT, FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE, UNIQUE (conversation_id,suggestion_id) ON CONFLICT REPLACE);");
        sqlitedatabase.execSQL("CREATE INDEX index_event_suggestions_conversation_id_expiration_time_timestamp  ON event_suggestions(conversation_id, expiration_time_usec, timestamp)");
_L27:
        sqlitedatabase.execSQL("CREATE INDEX index_participants_blocked ON participants(blocked)");
_L28:
        sqlitedatabase.execSQL("PRAGMA foreign_keys=OFF;");
        sqlitedatabase.execSQL("alter table participants rename to temp");
        sqlitedatabase.execSQL(EsProvider.b);
        sqlitedatabase.execSQL("insert into participants(_id, participant_type, gaia_id, chat_id, circle_id, phone_id, first_name, full_name, fallback_name, profile_photo_url, batch_gebi_tag, blocked) select _id, participant_type, gaia_id, chat_id, circle_id, phone_id, first_name, full_name, fallback_name, profile_photo_url, batch_gebi_tag, blocked from temp;");
        sqlitedatabase.execSQL("drop table temp");
        sqlitedatabase.execSQL("CREATE INDEX index_participants_chat_id ON participants(chat_id)");
        sqlitedatabase.execSQL("CREATE INDEX index_participants_blocked ON participants(blocked)");
        sqlitedatabase.execSQL("PRAGMA foreign_keys=ON;");
_L29:
        sqlitedatabase.execSQL("alter table messages add column new_conversation_name TEXT;");
        sqlitedatabase.execSQL("alter table messages add column participant_keys TEXT;");
        sqlitedatabase.execSQL("alter table conversations add column previous_latest_timestamp INT;");
        sqlitedatabase.execSQL("alter table conversations add column snippet_new_conversation_name TEXT;");
        sqlitedatabase.execSQL("alter table conversations add column snippet_participant_keys TEXT;");
        c(sqlitedatabase);
_L30:
        sqlitedatabase.execSQL("PRAGMA foreign_keys=OFF;");
        sqlitedatabase.execSQL("alter table messages rename to temp");
        sqlitedatabase.execSQL("CREATE TABLE messages (_id INTEGER PRIMARY KEY, message_id TEXT, message_type INT, conversation_id TEXT, author_chat_id TEXT, author_gaia_id TEXT, text TEXT, timestamp INT, status INT, type INT, local_url TEXT, remote_url TEXT, attachment_content_type TEXT, width_pixels INT, height_pixels INT, stream_id TEXT, image_id TEXT, album_id TEXT, latitude DOUBLE, longitude DOUBLE, notification_level INT, expiration_timestamp INT, notified_for_failure INT DEFAULT(0), alert_status INT DEfAULT(0), off_the_record INT DEFAULT(0), transport_type INT NOT NULL DEFAULT(1), external_ids TEXT, sms_timestamp_sent INT DEFAULT(0), sms_priority INT DEFAULT(0), sms_message_size INT DEFAULT(0), mms_subject TEXT, sms_raw_sender TEXT, sms_raw_recipients TEXT, persisted INT DEFAULT(1), sms_message_status INT DEFAULT(-1), sms_type INT DEFAULT(-1), video_stream_url TEXT, attachment_target_url TEXT, attachment_name TEXT, image_rotation INT DEFAULT (0), new_conversation_name TEXT, participant_keys TEXT, FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE,UNIQUE (conversation_id,message_id) ON CONFLICT REPLACE);");
        sqlitedatabase.execSQL("insert into messages(_id, message_id, message_type, conversation_id, author_chat_id, author_gaia_id, text, timestamp, status, type, local_url, remote_url, attachment_content_type, width_pixels, height_pixels, stream_id, image_id, album_id, latitude, longitude, notification_level, expiration_timestamp, notified_for_failure, alert_status, off_the_record, transport_type, external_ids, sms_timestamp_sent, sms_priority, sms_message_size, mms_subject, sms_raw_sender, sms_raw_recipients, persisted, sms_message_status, sms_type, video_stream_url, attachment_target_url, attachment_name, image_rotation, new_conversation_name, participant_keys) select _id, message_id, message_type, conversation_id, author_chat_id, author_gaia_id, text, timestamp, status, type, local_url, remote_url, attachment_content_type, width_pixels, height_pixels, stream_id, image_id, album_id, latitude, longitude, notification_level, expiration_timestamp, notified_for_failure, alert_status, off_the_record, transport_type, external_ids, sms_timestamp_sent, sms_priority, sms_message_size, mms_subject, sms_raw_sender, sms_raw_recipients, persisted, sms_message_status, sms_type, video_stream_url, attachment_target_url, attachment_name, image_rotation, new_conversation_name, participant_keys from temp;");
        sqlitedatabase.execSQL("drop table temp");
        sqlitedatabase.execSQL("PRAGMA foreign_keys=ON;");
_L31:
        sqlitedatabase.execSQL("alter table messages add column transport_phone TEXT;");
        sqlitedatabase.execSQL("alter table conversations add column default_transport_phone TEXT;");
_L32:
        a(sqlitedatabase, "_id, conversation_id, conversation_type, latest_message_timestamp, latest_message_expiration_timestamp, metadata_present,notification_level, name, generated_name, snippet_type, snippet_text, snippet_image_url, snippet_author_gaia_id, snippet_author_chat_id, snippet_message_row_id, snippet_status, snippet_new_conversation_name, snippet_participant_keys, previous_latest_timestamp, status, view, inviter_gaia_id, inviter_chat_id, inviter_affinity, is_pending_leave, account_id, is_otr, packed_avatar_urls, self_avatar_url, self_watermark, chat_watermark, hangout_watermark, is_draft, sequence_number, call_media_type, has_joined_hangout, last_hangout_event_time, draft, draft_subject, draft_attachment_url, draft_photo_rotation, draft_picasa_id, draft_content_type, otr_status, otr_toggle, last_otr_modification_time, continuation_token, continuation_event_timestamp, has_oldest_message, sort_timestamp, first_peak_scroll_time, first_peak_scroll_to_message_timestamp, second_peak_scroll_time, second_peak_scroll_to_message_timestamp, conversation_hash, disposition, has_persistent_events, transport_type, default_transport_phone, sms_service_center, is_temporary, sms_thread_id", "CREATE TABLE conversations (_id INTEGER PRIMARY KEY, conversation_id TEXT, conversation_type INT, latest_message_timestamp INT DEFAULT(0), latest_message_expiration_timestamp INT, metadata_present INT,notification_level INT, name TEXT, generated_name TEXT, snippet_type INT, snippet_text TEXT, snippet_image_url TEXT, snippet_author_gaia_id TEXT, snippet_author_chat_id TEXT, snippet_message_row_id INT, snippet_status INT, snippet_new_conversation_name TEXT, snippet_participant_keys TEXT, previous_latest_timestamp INT, status INT, view INT, inviter_gaia_id TEXT, inviter_chat_id TEXT, inviter_affinity INT, is_pending_leave INT, account_id INT, is_otr INT, packed_avatar_urls TEXT, self_avatar_url TEXT, self_watermark INT DEFAULT(0), chat_watermark INT DEFAULT(0), hangout_watermark INT DEFAULT(0), is_draft INT, sequence_number INT, call_media_type INT DEFAULT(0), has_joined_hangout INT, last_hangout_event_time INT, draft TEXT, draft_subject TEXT, draft_attachment_url TEXT, draft_photo_rotation INT, draft_picasa_id TEXT, draft_content_type TEXT, otr_status INT, otr_toggle INT, last_otr_modification_time INT, continuation_token BLOB, continuation_event_timestamp INT, has_oldest_message INT DEFAULT(0), sort_timestamp INT, first_peak_scroll_time INT, first_peak_scroll_to_message_timestamp INT, second_peak_scroll_time INT, second_peak_scroll_to_message_timestamp INT, conversation_hash BLOB, disposition INT DEFAULT(0), has_persistent_events INT DEFAULT(-1), transport_type INT DEFAULT(1), default_transport_phone TEXT, sms_service_center TEXT, is_temporary INT DEFAULT (0), sms_thread_id INT DEFAULT (-1), UNIQUE (conversation_id ));");
        sqlitedatabase.execSQL("update conversations set call_media_type =  ( select case when conversations.call_media_type is null then 0 else conversations.call_media_type end );");
_L33:
        d(sqlitedatabase);
_L34:
        sqlitedatabase.execSQL("CREATE TABLE transport_events (_id INTEGER PRIMARY KEY, upload_key TEXT, message_row_id INT, request_trace_id INT, event_id TEXT, notified INT, was_newest INT, past_watermark INT, dnd INT, in_focused_conversation INT, active_client_state INT, notification_level INT, local_timestamp INT);");
        sqlitedatabase.execSQL("CREATE INDEX index_transport_events_upload_key ON transport_events(upload_key)");
_L35:
        sqlitedatabase.execSQL("alter table messages add column forwarded_mms_url TEXT;");
        sqlitedatabase.execSQL("alter table messages add column forwarded_mms_count INT DEFAULT(0);");
_L36:
        sqlitedatabase.execSQL("alter table messages add column attachment_description TEXT;");
        sqlitedatabase.execSQL("alter table messages add column attachment_target_url_description TEXT;");
        sqlitedatabase.execSQL("alter table messages add column attachment_target_url_name TEXT;");
_L37:
        sqlitedatabase.execSQL("CREATE TABLE merge_keys (_id INTEGER PRIMARY KEY, conversation_id TEXT, merge_key TEXT, UNIQUE (conversation_id) ON CONFLICT REPLACE, FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE  );");
_L38:
        a(sqlitedatabase, "_id, conversation_id, conversation_type, latest_message_timestamp, latest_message_expiration_timestamp, metadata_present,notification_level, name, generated_name, snippet_type, snippet_text, snippet_image_url, snippet_author_gaia_id, snippet_author_chat_id, snippet_message_row_id, snippet_status, snippet_new_conversation_name, snippet_participant_keys, previous_latest_timestamp, status, view, inviter_gaia_id, inviter_chat_id, inviter_affinity, is_pending_leave, account_id, is_otr, packed_avatar_urls, self_avatar_url, self_watermark, chat_watermark, hangout_watermark, is_draft, sequence_number, has_joined_hangout, last_hangout_event_time, draft, draft_subject, draft_attachment_url, draft_photo_rotation, draft_picasa_id, draft_content_type, otr_status, otr_toggle, last_otr_modification_time, continuation_token, continuation_event_timestamp, has_oldest_message, sort_timestamp, first_peak_scroll_time, first_peak_scroll_to_message_timestamp, second_peak_scroll_time, second_peak_scroll_to_message_timestamp, conversation_hash, disposition, has_persistent_events, transport_type, default_transport_phone, sms_service_center, is_temporary, sms_thread_id", "CREATE TABLE conversations (_id INTEGER PRIMARY KEY, conversation_id TEXT, conversation_type INT, latest_message_timestamp INT DEFAULT(0), latest_message_expiration_timestamp INT, metadata_present INT,notification_level INT, name TEXT, generated_name TEXT, snippet_type INT, snippet_text TEXT, snippet_image_url TEXT, snippet_author_gaia_id TEXT, snippet_author_chat_id TEXT, snippet_message_row_id INT, snippet_selector INT, snippet_status INT, snippet_new_conversation_name TEXT, snippet_participant_keys TEXT, previous_latest_timestamp INT, status INT, view INT, inviter_gaia_id TEXT, inviter_chat_id TEXT, inviter_affinity INT, is_pending_leave INT, account_id INT, is_otr INT, packed_avatar_urls TEXT, self_avatar_url TEXT, self_watermark INT DEFAULT(0), chat_watermark INT DEFAULT(0), hangout_watermark INT DEFAULT(0), is_draft INT, sequence_number INT, call_media_type INT DEFAULT(0), has_joined_hangout INT, last_hangout_event_time INT, draft TEXT, draft_subject TEXT, draft_attachment_url TEXT, draft_photo_rotation INT, draft_picasa_id TEXT, draft_content_type TEXT, otr_status INT, otr_toggle INT, last_otr_modification_time INT, continuation_token BLOB, continuation_event_timestamp INT, has_oldest_message INT DEFAULT(0), sort_timestamp INT, first_peak_scroll_time INT, first_peak_scroll_to_message_timestamp INT, second_peak_scroll_time INT, second_peak_scroll_to_message_timestamp INT, conversation_hash BLOB, disposition INT DEFAULT(0), has_persistent_events INT DEFAULT(-1), transport_type INT DEFAULT(1), default_transport_phone TEXT, sms_service_center TEXT, is_temporary INT DEFAULT (0), sms_thread_id INT DEFAULT (-1), UNIQUE (conversation_id ));");
_L39:
        sqlitedatabase.execSQL(EsProvider.e);
_L40:
        sqlitedatabase.execSQL(String.format(Locale.US, "INSERT INTO %s (%s, %s) SELECT %s, 'CONV:'||%s FROM %s;", new Object[] {
            "merge_keys", "conversation_id", "merge_key", "conversation_id", "conversation_id", "conversations"
        }));
_L41:
        sqlitedatabase.execSQL("alter table conversations add column has_chat_notifications INT DEFAULT(0);");
        sqlitedatabase.execSQL("alter table conversations add column has_video_notifications INT DEFAULT(0);");
        sqlitedatabase.execSQL("update conversations SET has_chat_notifications= ( CASE WHEN latest_message_timestamp>chat_watermark THEN 1 ELSE 0 END);");
        sqlitedatabase.execSQL("update conversations SET has_video_notifications= ( CASE WHEN latest_message_timestamp>hangout_watermark THEN 1 ELSE 0 END);");
        sqlitedatabase.execSQL("CREATE INDEX index_conversations_chat_notifications ON conversations(has_chat_notifications)");
        sqlitedatabase.execSQL("CREATE INDEX index_conversations_video_notifications ON conversations(has_video_notifications)");
_L42:
        sqlitedatabase.execSQL("alter table event_suggestions add column event_id TEXT;");
_L43:
        sqlitedatabase.execSQL("alter table transport_events add column client_generated_id INT;");
        sqlitedatabase.execSQL("alter table transport_events add column event_type INT;");
        sqlitedatabase.execSQL("alter table transport_events add column chat_action INT;");
_L44:
        sqlitedatabase.execSQL("UPDATE conversations SET has_oldest_message=0 WHERE continuation_event_timestamp=0;");
_L45:
        sqlitedatabase.execSQL("DROP INDEX IF EXISTS index_merge_keys_merge_key");
        sqlitedatabase.execSQL("DROP INDEX IF EXISTS index_merge_keys_merge_key_NEW");
        sqlitedatabase.execSQL("DROP INDEX IF EXISTS index_merge_keys_merge_conversation_id");
        sqlitedatabase.execSQL("CREATE INDEX index_merge_keys_merge_key_NEW ON merge_keys(merge_key)");
        sqlitedatabase.execSQL("CREATE INDEX index_merge_keys_merge_conversation_id ON merge_keys(conversation_id); ");
_L46:
        sqlitedatabase.execSQL("alter table conversations add column snippet_sms_type INT;");
        sqlitedatabase.execSQL("UPDATE conversations SET snippet_sms_type = ( SELECT messages.sms_type FROM messages WHERE conversations.snippet_message_row_id = messages._id)");
_L47:
        sqlitedatabase.execSQL("CREATE TABLE dismissed_contacts (_id INTEGER PRIMARY KEY, chat_id TEXT, gaia_id TEXT, name TEXT, profile_photo_url TEXT);");
        sqlitedatabase.execSQL("CREATE INDEX index_dismissed_contacts_gaia_id ON dismissed_contacts(gaia_id)");
_L48:
        sqlitedatabase.execSQL("alter table messages add column sending_error INT DEFAULT(0);");
_L49:
        sqlitedatabase.execSQL("alter table conversations add column chat_ringtone_uri TEXT;");
        sqlitedatabase.execSQL("alter table conversations add column hangout_ringtone_uri TEXT;");
_L50:
        sqlitedatabase.execSQL("PRAGMA foreign_keys=OFF;");
        sqlitedatabase.execSQL("alter table messages rename to temp");
        sqlitedatabase.execSQL("CREATE TABLE messages (_id INTEGER PRIMARY KEY, message_id TEXT, message_type INT, conversation_id TEXT, author_chat_id TEXT, author_gaia_id TEXT, text TEXT, timestamp INT, status INT, type INT, local_url TEXT, remote_url TEXT, attachment_content_type TEXT, width_pixels INT, height_pixels INT, stream_id TEXT, image_id TEXT, album_id TEXT, latitude DOUBLE, longitude DOUBLE, notification_level INT, expiration_timestamp INT, notified_for_failure INT DEFAULT(0), alert_status INT DEfAULT(0), off_the_record INT DEFAULT(0), transport_type INT NOT NULL DEFAULT(1), transport_phone TEXT, external_ids TEXT, sms_timestamp_sent INT DEFAULT(0), sms_priority INT DEFAULT(0), sms_message_size INT DEFAULT(0), mms_subject TEXT, sms_raw_sender TEXT, sms_raw_recipients TEXT, persisted INT DEFAULT(1), sms_message_status INT DEFAULT(-1), sms_type INT DEFAULT(-1), stream_url TEXT, attachment_target_url TEXT, attachment_name TEXT, image_rotation INT DEFAULT (0), new_conversation_name TEXT, participant_keys TEXT, forwarded_mms_url TEXT, forwarded_mms_count INT DEFAULT(0), attachment_description TEXT, attachment_target_url_description TEXT, attachment_target_url_name TEXT, sending_error INT DEFAULT(0), stream_expiration INT, voicemail_length INT DEFAULT (0), call_media_type INT DEFAULT (0), FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE,UNIQUE (conversation_id,message_id) ON CONFLICT REPLACE);");
        sqlitedatabase.execSQL("insert into messages(_id, message_id, message_type, conversation_id, author_chat_id, author_gaia_id, text, timestamp, status, type, local_url, remote_url, attachment_content_type, width_pixels, height_pixels, stream_id, image_id, album_id, latitude, longitude, notification_level, expiration_timestamp, notified_for_failure, alert_status, off_the_record, transport_type, transport_phone, external_ids, sms_timestamp_sent, sms_priority, sms_message_size, mms_subject, sms_raw_sender, sms_raw_recipients, persisted, sms_message_status, sms_type, attachment_target_url, attachment_name, image_rotation, new_conversation_name, participant_keys, forwarded_mms_url, forwarded_mms_count, attachment_description, attachment_target_url_description, attachment_target_url_name, sending_error) select _id, message_id, message_type, conversation_id, author_chat_id, author_gaia_id, text, timestamp, status, type, local_url, remote_url, attachment_content_type, width_pixels, height_pixels, stream_id, image_id, album_id, latitude, longitude, notification_level, expiration_timestamp, notified_for_failure, alert_status, off_the_record, transport_type, transport_phone, external_ids, sms_timestamp_sent, sms_priority, sms_message_size, mms_subject, sms_raw_sender, sms_raw_recipients, persisted, sms_message_status, sms_type, attachment_target_url, attachment_name, image_rotation, new_conversation_name, participant_keys, forwarded_mms_url, forwarded_mms_count, attachment_description, attachment_target_url_description, attachment_target_url_name, sending_error from temp;");
        sqlitedatabase.execSQL("drop table temp");
        sqlitedatabase.execSQL("PRAGMA foreign_keys=ON;");
_L51:
        sqlitedatabase.execSQL("alter table conversations add column wearable_watermark INT DEFAULT(0)");
_L52:
        sqlitedatabase.execSQL("CREATE TABLE recent_calls (_id INTEGER PRIMARY KEY, normalized_number TEXT NOT NULL, phone_number TEXT, contact_id TEXT, call_timestamp INT, call_type INT, contact_type INT);");
        sqlitedatabase.execSQL("CREATE INDEX index_recent_calls_sequence ON recent_calls(call_timestamp)");
        sqlitedatabase.execSQL("alter table messages add column call_media_type INT DEFAULT(0);");
        sqlitedatabase.execSQL("alter table conversations add column snippet_voicemail_duration INT DEFAULT(0);");
_L53:
        obj = new ContentValues();
        ((ContentValues) (obj)).put("phone_id", null);
        sqlitedatabase.update("participants", ((ContentValues) (obj)), "participant_type = ? and phone_id = ?", new String[] {
            String.valueOf(cfa.d.ordinal()), ""
        });
_L54:
        a(sqlitedatabase);
_L55:
        sqlitedatabase.execSQL("alter table transport_events add column event_reason INT;");
_L56:
        sqlitedatabase.execSQL("CREATE TABLE sticker_albums (album_id TEXT NOT NULL, title TEXT, cover_photo_id TEXT, PRIMARY KEY (album_id));");
        sqlitedatabase.execSQL("CREATE TABLE sticker_photos (photo_id TEXT NOT NULL, album_id TEXT NOT NULL, url TEXT NOT NULL, file_name TEXT, PRIMARY KEY (photo_id), FOREIGN KEY (album_id) REFERENCES sticker_albums(album_id) ON DELETE CASCADE)");
_L57:
        sqlitedatabase.execSQL("alter table recent_calls add column call_rate TEXT;");
        sqlitedatabase.execSQL("alter table recent_calls add column is_free_call BOOLEAN;");
_L58:
        sqlitedatabase.execSQL("update transport_events set notified=3 where notified=4");
_L59:
        sqlitedatabase.execSQL("CREATE TABLE presence (_id INTEGER PRIMARY KEY, gaia_id TEXT NOT NULL, reachable INT DEFAULT(0), reachable_time INT DEFAULT(0), available INT DEFAULT(0), available_time INT DEFAULT(0), status_message TEXT, status_message_time INT DEFAULT(0), call_type INT DEFAULT(0), call_type_time INT DEFAULT(0), device_status INT DEFAULT(0), device_status_time INT DEFAULT(0), last_seen INT DEFAULT(0), last_seen_time INT DEFAULT(0), UNIQUE (gaia_id) ON CONFLICT REPLACE);");
_L60:
        sqlitedatabase.execSQL("alter table messages add column address TEXT;");
_L61:
        sqlitedatabase.execSQL("drop table if exists transport_events;");
        sqlitedatabase.execSQL("drop index if exists index_transport_events_upload_key;");
_L62:
        sqlitedatabase.execSQL("alter table messages add column delete_after_read_timetamp INT;");
_L63:
        sqlitedatabase.execSQL("alter table event_suggestions add column matched_message_substring TEXT;");
_L64:
        sqlitedatabase.execSQL("update conversations set chat_watermark = wearable_watermark WHERE wearable_watermark > chat_watermark");
        a(sqlitedatabase, "_id,conversation_id,conversation_type,latest_message_timestamp,latest_message_expiration_timestamp,metadata_present,notification_level,name,generated_name,snippet_type,snippet_text,snippet_image_url,snippet_author_gaia_id,snippet_author_chat_id,snippet_message_row_id,snippet_selector,snippet_status,snippet_new_conversation_name,snippet_participant_keys,snippet_sms_type,previous_latest_timestamp,status,view,inviter_gaia_id,inviter_chat_id,inviter_affinity,is_pending_leave,account_id,is_otr,packed_avatar_urls,self_avatar_url,self_watermark,chat_watermark,hangout_watermark,is_draft,sequence_number,call_media_type,has_joined_hangout,has_chat_notifications,has_video_notifications,last_hangout_event_time,draft,draft_subject,draft_attachment_url,draft_photo_rotation,draft_picasa_id,draft_content_type,otr_status,otr_toggle,last_otr_modification_time,continuation_token,continuation_event_timestamp,has_oldest_message,sort_timestamp,first_peak_scroll_time,first_peak_scroll_to_message_timestamp,second_peak_scroll_time,second_peak_scroll_to_message_timestamp,conversation_hash,disposition,has_persistent_events,transport_type,default_transport_phone,sms_service_center,is_temporary,sms_thread_id,chat_ringtone_uri,hangout_ringtone_uri,snippet_voicemail_duration", "CREATE TABLE conversations (_id INTEGER PRIMARY KEY, conversation_id TEXT, conversation_type INT, latest_message_timestamp INT DEFAULT(0), latest_message_expiration_timestamp INT, metadata_present INT,notification_level INT, name TEXT, generated_name TEXT, snippet_type INT, snippet_text TEXT, snippet_image_url TEXT, snippet_author_gaia_id TEXT, snippet_author_chat_id TEXT, snippet_message_row_id INT, snippet_selector INT, snippet_status INT, snippet_new_conversation_name TEXT, snippet_participant_keys TEXT, snippet_sms_type TEXT, previous_latest_timestamp INT, status INT, view INT, inviter_gaia_id TEXT, inviter_chat_id TEXT, inviter_affinity INT, is_pending_leave INT, account_id INT, is_otr INT, packed_avatar_urls TEXT, self_avatar_url TEXT, self_watermark INT DEFAULT(0), chat_watermark INT DEFAULT(0), hangout_watermark INT DEFAULT(0), is_draft INT, sequence_number INT, call_media_type INT DEFAULT(0), has_joined_hangout INT, has_chat_notifications DEFAULT(0),has_video_notifications DEFAULT(0),last_hangout_event_time INT, draft TEXT, draft_subject TEXT, draft_attachment_url TEXT, draft_photo_rotation INT, draft_picasa_id TEXT, draft_content_type TEXT, otr_status INT, otr_toggle INT, last_otr_modification_time INT, continuation_token BLOB, continuation_event_timestamp INT, has_oldest_message INT DEFAULT(0), sort_timestamp INT, first_peak_scroll_time INT, first_peak_scroll_to_message_timestamp INT, second_peak_scroll_time INT, second_peak_scroll_to_message_timestamp INT, conversation_hash BLOB, disposition INT DEFAULT(0), has_persistent_events INT DEFAULT(-1), transport_type INT DEFAULT(1), default_transport_phone TEXT, sms_service_center TEXT, is_temporary INT DEFAULT (0), sms_thread_id INT DEFAULT (-1), chat_ringtone_uri TEXT, hangout_ringtone_uri TEXT, snippet_voicemail_duration INT DEFAULT (0), UNIQUE (conversation_id ));");
_L65:
        sqlitedatabase.execSQL("alter table sticker_photos add column last_used INT DEFAULT(0);");
        sqlitedatabase.execSQL("alter table sticker_albums add column last_used INT DEFAULT(0);");
_L66:
        obj = String.valueOf("update messages set status = ");
        l = dqb.a.ordinal();
        s = String.valueOf("status");
        sqlitedatabase.execSQL((new StringBuilder(String.valueOf(obj).length() + 23 + String.valueOf(s).length())).append(((String) (obj))).append(l).append(" WHERE ").append(s).append(" = -1").toString());
        obj = String.valueOf("update conversations set snippet_status = ");
        l = dqb.a.ordinal();
        s = String.valueOf("snippet_status");
        sqlitedatabase.execSQL((new StringBuilder(String.valueOf(obj).length() + 23 + String.valueOf(s).length())).append(((String) (obj))).append(l).append(" WHERE ").append(s).append(" = -1").toString());
_L67:
        sqlitedatabase.execSQL("alter table conversation_participants add column invitation_status INT DEFAULT(0);");
_L68:
        sqlitedatabase.execSQL("alter table messages add column last_seen_timestamp INT DEFAULT(0);");
_L69:
        b(sqlitedatabase);
_L70:
        sqlitedatabase.execSQL("alter table participants add column in_users_domain BOOLEAN;");
_L71:
        sqlitedatabase.execSQL("drop index if exists index_dismissed_contacts_gaia_id");
        sqlitedatabase.execSQL("CREATE INDEX index_dismissed_contacts_gaia_id ON dismissed_contacts(gaia_id)");
        sqlitedatabase.execSQL("CREATE INDEX index_conversation_participants_view_conversation_id ON conversation_participants(conversation_id)");
_L72:
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS merged_contact_details");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS merged_contacts");
        obj = bzx.a();
        l = 0;
_L77:
        if (l >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        sqlitedatabase.execSQL(obj[l]);
        l++;
        if (true) goto _L77; else goto _L73
_L73:
        sqlitedatabase.execSQL("CREATE INDEX index_merged_contact_details_parent_key ON merged_contact_details(merged_contact_id)");
_L74:
        sqlitedatabase.execSQL("alter table merged_contacts add column is_frequent INT DEFAULT (0);");
        sqlitedatabase.execSQL("alter table merged_contacts add column is_favorite INT DEFAULT (0);");
        sqlitedatabase.execSQL("alter table merged_contact_details add column lookup_data_display TEXT;");
_L75:
        e(sqlitedatabase);
        aoe.a(new aoe(a, new apd(a, sqlitedatabase), f), null);
        flag = flag1;
_L79:
        if (flag)
        {
            ebw.e("Babel", (new StringBuilder(52)).append("db upgrade from ").append(j).append(" to ").append(k).append(" succeeded").toString());
            return;
        }
        break; /* Loop/switch isn't completed */
        ebw.f("Babel", (new StringBuilder(52)).append("db upgrade not supported: ").append(j).append(" -> ").append(k).toString());
        flag = false;
        continue; /* Loop/switch isn't completed */
_L76:
        if (true) goto _L79; else goto _L78
_L78:
        if (((ecs)hgx.a(a, ecs)).a())
        {
            throw new RuntimeException((new StringBuilder(49)).append("Unable to upgrade from ").append(j).append(" to ").append(k).toString());
        } else
        {
            ebw.f("Babel", (new StringBuilder(57)).append("db upgrade failed; recreating: ").append(j).append(" -> ").append(k).toString());
            f(sqlitedatabase);
            return;
        }
    }

    public String toString()
    {
        int j = f;
        String s = g;
        return (new StringBuilder(String.valueOf(s).length() + 25)).append("index: ").append(j).append(" name: ").append(s).toString();
    }

    static 
    {
        hik hik = ebw.d;
    }
}
