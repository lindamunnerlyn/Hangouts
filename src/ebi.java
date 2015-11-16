// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class ebi
{

    public static final Uri a;
    public static final Uri b;

    public static Uri a(int i, int j, String s, int k)
    {
        Object obj;
        Context context;
        obj = null;
        boolean flag2 = true;
        boolean flag3 = false;
        context = g.nS;
        String s1 = context.getString(j);
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            File file;
            Uri uri;
            boolean flag;
            if (android.os.Build.VERSION.SDK_INT < 21)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gbh.a(flag);
            file = a(a(), i, s);
            uri = a(context, i, s);
            if (uri == null)
            {
                if (file != null)
                {
                    gbh.a(s, ".ogg");
                    gbh.a(k, 1, 2);
                    gbh.b(file);
                    a(context, s1, file, s, k);
                    if (k == 2)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    s = new ContentValues();
                    s.put("_data", file.getAbsolutePath());
                    s.put("title", s1);
                    s.put("mime_type", "audio/ogg");
                    s.put("_size", Long.valueOf(file.length()));
                    s.put("artist", Integer.valueOf(l.p));
                    if (flag)
                    {
                        flag2 = false;
                    }
                    s.put("is_ringtone", Boolean.valueOf(flag2));
                    s.put("is_notification", Boolean.valueOf(flag));
                    s.put("is_alarm", Boolean.valueOf(flag));
                    s.put("is_music", Boolean.valueOf(false));
                    obj = android.provider.MediaStore.Audio.Media.getContentUriForPath(file.getAbsolutePath());
                    gbh.a(obj, android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
                    obj = context.getContentResolver().insert(((Uri) (obj)), s);
                }
                return ((Uri) (obj));
            } else
            {
                return uri;
            }
        }
        String s3;
        boolean flag1;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        gbh.a(flag1);
        if (a(context))
        {
            obj = a(context, i, s);
            if (obj != null)
            {
                a(context, ((Uri) (obj)).toString(), s1);
                a(context, s1, new File(a(), a(i, s)), s, k);
            }
        }
        obj = context.getExternalMediaDirs();
        if (obj == null || obj.length <= 0) goto _L2; else goto _L1
_L1:
        if (k != 1) goto _L4; else goto _L3
_L3:
        obj = String.valueOf(obj[0].toString());
        s1 = String.valueOf(File.separator);
        s3 = String.valueOf(context.getString(l.jQ));
        obj = (new StringBuilder(String.valueOf(obj).length() + 0 + String.valueOf(s1).length() + String.valueOf(s3).length())).append(((String) (obj))).append(s1).append(s3).toString();
_L6:
label0:
        {
            obj = a(((String) (obj)), i, s);
            gbh.a(s, ".ogg");
            if (k != 1)
            {
                flag1 = flag3;
                if (k != 2)
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        gbh.a(flag1);
        s = Uri.fromFile(((File) (obj)));
        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", s));
        return s;
_L4:
        if (k == 2)
        {
            obj = String.valueOf(obj[0].toString());
            String s2 = String.valueOf(File.separator);
            String s4 = String.valueOf(context.getString(l.ha));
            obj = (new StringBuilder(String.valueOf(obj).length() + 0 + String.valueOf(s2).length() + String.valueOf(s4).length())).append(((String) (obj))).append(s2).append(s4).toString();
            continue; /* Loop/switch isn't completed */
        }
_L2:
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static Uri a(Context context, int i, String s)
    {
        Object obj;
        if (a(context))
        {
            if (((File) (obj = new File(a(), a(i, s)))).exists())
            {
                context = android.provider.MediaStore.Audio.Media.getContentUriForPath(((File) (obj)).getAbsolutePath());
                gbh.a(context, android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
                s = g.nS.getContentResolver();
                String s1 = String.valueOf("_data=\"");
                obj = String.valueOf(((File) (obj)).getAbsolutePath());
                s1 = (new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(obj).length())).append(s1).append(((String) (obj))).append("\"").toString();
                s = s.query(context, new String[] {
                    "_id"
                }, s1, null, null);
                if (s != null)
                {
                    if (s.getCount() == 0)
                    {
                        s.close();
                        return null;
                    } else
                    {
                        s.moveToFirst();
                        i = s.getInt(0);
                        s.close();
                        return Uri.withAppendedPath(context, Integer.toString(i));
                    }
                }
            }
        }
        return null;
    }

    public static transient Uri a(Uri uri, String as[])
    {
        MediaPlayer mediaplayer;
        Context context;
        context = g.nS;
        mediaplayer = new MediaPlayer();
        int j = as.length;
        int i = 0;
_L8:
        if (i >= j) goto _L2; else goto _L1
_L1:
        String s;
        s = as[i];
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        boolean flag = s.isEmpty();
        if (flag)
        {
            mediaplayer.release();
            return null;
        }
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj1 = RingtoneManager.getRingtone(context, Uri.parse(s));
        Object obj = s;
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        String s1;
        obj1 = ((Ringtone) (obj1)).getTitle(context);
        obj = context.getResources().getString(l.aj);
        s1 = context.getResources().getString(l.dJ);
        if (!((String) (obj)).equals(obj1)) goto _L6; else goto _L5
_L5:
        obj = ebr.b(g.ih);
_L4:
        obj = Uri.parse(((String) (obj)));
        if (!((Uri) (obj)).equals(uri))
        {
            mediaplayer.reset();
            mediaplayer.setDataSource(context, ((Uri) (obj)));
        }
        mediaplayer.release();
        return ((Uri) (obj));
_L6:
        obj = s;
        if (s1.equals(obj1))
        {
            obj = ebr.b(g.ig);
        }
        if (true) goto _L4; else goto _L7
_L7:
        Exception exception;
        exception;
        i++;
          goto _L8
_L2:
        mediaplayer.release();
        return uri;
        uri;
        mediaplayer.release();
        throw uri;
    }

    private static File a(int i, String s, String s1)
    {
        Object obj = g.nS.getResources().openRawResource(i);
        File file;
        try
        {
            byte abyte0[] = new byte[((InputStream) (obj)).available()];
            ((InputStream) (obj)).read(abyte0);
            ((InputStream) (obj)).close();
            obj = String.valueOf(File.separator);
            obj = new FileOutputStream((new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(obj).length() + String.valueOf(s1).length())).append(s).append(((String) (obj))).append(s1).toString());
            ((FileOutputStream) (obj)).write(abyte0);
            ((FileOutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ebw.e("Babel", "Could not create a file for the ringtone", s);
            return null;
        }
        file = new File(s, s1);
        if (!file.exists())
        {
            ebw.g("Babel", String.format(Locale.US, "Could not create ringtone file at %s/%s ", new Object[] {
                s, s1
            }));
            return null;
        } else
        {
            return file;
        }
    }

    private static File a(String s, int i, String s1)
    {
        s1 = a(i, s1);
        File file = new File(s);
        file.mkdirs();
        if (file.exists())
        {
            break MISSING_BLOCK_LABEL_83;
        }
        s = String.valueOf(s);
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        s = "Could not create the directory ".concat(s);
_L1:
        ebw.g("Babel", s);
        return null;
        try
        {
            s = new String("Could not create the directory ");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ebw.e("Babel", "Could not register the ringtone", s);
            return null;
        }
          goto _L1
        s = a(i, s, s1);
        return s;
    }

    private static String a()
    {
        String s = String.valueOf(Environment.getExternalStorageDirectory().toString());
        String s1 = String.valueOf(File.separator);
        String s2 = String.valueOf(g.nS.getString(l.jQ));
        return (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(s2).toString();
    }

    private static String a(int i, String s)
    {
        String s1 = String.valueOf(g.nS.getResources().getResourceEntryName(i));
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            return s1.concat(s);
        } else
        {
            return new String(s1);
        }
    }

    public static String a(Context context, Uri uri)
    {
        Resources resources = context.getResources();
        if (a.equals(uri))
        {
            return resources.getString(l.aj);
        }
        if (b.equals(uri))
        {
            return resources.getString(l.dJ);
        }
        Ringtone ringtone = null;
        if (uri != null)
        {
            ringtone = RingtoneManager.getRingtone(context, uri);
        }
        if (ringtone == null)
        {
            return resources.getString(l.ka);
        } else
        {
            return ringtone.getTitle(context);
        }
    }

    private static void a(Context context, String s, File file, String s1, int i)
    {
        gbh.a(s1, ".ogg");
        gbh.a(i, 1, 2);
        gbh.b(file);
        s1 = android.provider.MediaStore.Audio.Media.getContentUriForPath(file.getAbsolutePath());
        gbh.a(s1, android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
        context = context.getContentResolver();
        String s2 = String.valueOf("_data=\"");
        file = String.valueOf(file.getAbsolutePath());
        context.delete(s1, (new StringBuilder(String.valueOf(s2).length() + 1 + String.valueOf(file).length())).append(s2).append(file).append("\"").toString(), null);
        file = String.valueOf("title=\"");
        context.delete(s1, (new StringBuilder(String.valueOf(file).length() + 1 + String.valueOf(s).length())).append(file).append(s).append("\"").toString(), null);
    }

    private static void a(Context context, String s, String s1)
    {
        String s2 = context.getString(l.aj);
        String s3 = context.getString(l.dJ);
        ArrayList arraylist = new ArrayList();
        boolean flag;
        if (s2.equals(s1))
        {
            arraylist.add("sms_notification_sound_key");
            arraylist.add("gv_sms_sound_key");
            arraylist.add("gv_voicemail_sound_key");
            arraylist.add("chat_notification_sound_key");
            flag = true;
        } else
        if (s3.equals(s1))
        {
            arraylist.add("hangout_sound_key");
            flag = false;
        } else
        {
            flag = true;
        }
        if (!arraylist.isEmpty())
        {
            s1 = (gms)hgx.a(context, gms);
            int ai[] = dbf.d();
            int j = ai.length;
            int i = 0;
            while (i < j) 
            {
                int k = ai[i];
                gmu gmu1 = s1.a(k);
                Iterator iterator = arraylist.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    String s4 = (String)iterator.next();
                    if (s.equals(s1.a(k).b(s4)))
                    {
                        s1.b(k).h(s4).d();
                    }
                } while (true);
                if (gmu1.a())
                {
                    try
                    {
                        (new aoe(context, k)).b(s, flag);
                    }
                    catch (apc apc1)
                    {
                        ebw.f("Babel", "Don't need to clean db for logged out user");
                    }
                }
                i++;
            }
        }
    }

    private static boolean a(Context context)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add("android.permission.READ_EXTERNAL_STORAGE");
        arraylist.add("android.permission.WRITE_EXTERNAL_STORAGE");
        return ((chz)hgx.a(context, chz)).a(arraylist);
    }

    static 
    {
        a = ebr.c(g.ih);
        b = ebr.c(g.ig);
    }
}
