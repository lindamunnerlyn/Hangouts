// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.Time;
import android.view.ContextMenu;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import aoa;
import aoc;
import aow;
import apv;
import clw;
import clx;
import cly;
import clz;
import cmb;
import cmc;
import cme;
import cmf;
import cmg;
import cmh;
import cmi;
import cmj;
import cmk;
import cml;
import cmm;
import cmn;
import cmo;
import cmp;
import cmq;
import cmr;
import cms;
import cmt;
import cvv;
import cxr;
import dcn;
import eev;
import g;
import gqu;
import gqz;
import grd;
import grn;
import h;
import hlp;
import hly;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class DebugActivity extends hly
{

    private static final String n[] = {
        "url:hangouts_conserver", "url:hangouts_conserver_upload", "url:hangouts_rs"
    };
    private final gqu c;
    private TextView d;
    private ListView e;
    private aow f;
    private ListView g;
    private RecordingService h;
    private ArrayAdapter i;
    private aoa j;
    private boolean k;
    private gqz l;
    private ServiceConnection m;

    public DebugActivity()
    {
        c = (new grn(this, b)).a(a);
    }

    public static android.widget.AdapterView.OnItemClickListener a(DebugActivity debugactivity, Cursor cursor)
    {
        return new cme(debugactivity, cursor);
    }

    public static ArrayAdapter a(DebugActivity debugactivity, ArrayAdapter arrayadapter)
    {
        debugactivity.i = arrayadapter;
        return arrayadapter;
    }

    private BaseAdapter a(Cursor cursor)
    {
        ArrayList arraylist = new ArrayList();
        if (cursor.moveToPosition(0))
        {
            List list = Arrays.asList((Object[])cursor.getColumnNames().clone());
            Collections.sort(list);
            for (Iterator iterator = list.iterator(); iterator.hasNext();)
            {
                String s = (String)iterator.next();
                try
                {
                    arraylist.add(cursor.getString(cursor.getColumnIndex(s)));
                }
                catch (Exception exception)
                {
                    String s1 = String.valueOf(exception.getMessage());
                    if (s1.length() != 0)
                    {
                        s1 = "???: ".concat(s1);
                    } else
                    {
                        s1 = new String("???: ");
                    }
                    arraylist.add(s1);
                }
            }

            cursor = list;
        } else
        {
            cursor = new ArrayList();
        }
        return a(((List) (cursor)), ((List) (arraylist)));
    }

    private BaseAdapter a(Cursor cursor, int ai[])
    {
        return new cly(this, cursor, ai);
    }

    public static BaseAdapter a(DebugActivity debugactivity, Cursor cursor, int ai[])
    {
        return debugactivity.a(cursor, ai);
    }

    public static BaseAdapter a(DebugActivity debugactivity, List list, List list1)
    {
        return debugactivity.a(list, list1);
    }

    private BaseAdapter a(List list, List list1)
    {
        return new clx(this, list, list1);
    }

    public static aow a(DebugActivity debugactivity, aow aow1)
    {
        debugactivity.f = aow1;
        return aow1;
    }

    public static RecordingService a(DebugActivity debugactivity, RecordingService recordingservice)
    {
        debugactivity.h = recordingservice;
        return recordingservice;
    }

    public static String a(aoa aoa1, String s)
    {
        apv apv1 = (new aow(g.nU, aoa1.h())).e();
        aoa1 = new StringBuilder();
        Cursor cursor = apv1.a("conversations", null, "conversation_id=?", new String[] {
            s
        }, "sort_timestamp DESC");
        a(((StringBuilder) (aoa1)), cursor, "CONVERSATIONS", "conversation_id");
        cursor.close();
        cursor = apv1.a("conversation_participants_view", null, "conversation_id=?", new String[] {
            s
        }, null);
        aoa1.append("PARTICIPANTS\n");
        a(((StringBuilder) (aoa1)), cursor, "PARTICIPANTS", "_id");
        cursor.close();
        s = apv1.a("messages", null, "conversation_id=?", new String[] {
            s
        }, "timestamp ASC");
        a(((StringBuilder) (aoa1)), ((Cursor) (s)), "MESSAGES", "message_id");
        s.close();
        return aoa1.toString();
    }

    public static String a(String s, Object obj)
    {
        return b(s, obj);
    }

    private void a()
    {
        Cursor cursor = f.e().a("conversations", null, null, null, "sort_timestamp DESC");
        BaseAdapter baseadapter = a(cursor, new int[] {
            cursor.getColumnIndex("generated_name"), cursor.getColumnIndex("conversation_id")
        });
        e.setAdapter(baseadapter);
        e.setOnItemClickListener(new cmg(this, cursor));
    }

    public static void a(Context context)
    {
        (new Thread(new cmr(context))).start();
    }

    private void a(View view, Cursor cursor, Runnable runnable)
    {
        Display display = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        view = new PopupWindow(view, point.x, point.y - 25);
        view.setFocusable(true);
        view.setBackgroundDrawable(new ColorDrawable(-1));
        view.setOnDismissListener(new cmm(this, cursor, runnable));
        view.showAtLocation(getWindow().getDecorView(), 0, 0, 0);
    }

    public static void a(DebugActivity debugactivity)
    {
        debugactivity.a();
        debugactivity.registerForContextMenu(debugactivity.e);
        debugactivity.getContentResolver();
        String as[] = new String[3];
        as[0] = g.a(debugactivity, n[0], null);
        as[1] = g.a(debugactivity, n[1], null);
        as[2] = g.a(debugactivity, n[2], null);
        Object obj1 = debugactivity.d;
        Object obj = as[0];
        boolean flag;
        if (obj != null)
        {
            for (; ((String) (obj)).endsWith("/"); obj = ((String) (obj)).substring(0, ((String) (obj)).length() - 1)) { }
            TextView textview;
            if (((String) (obj)).endsWith("daily"))
            {
                obj = "DAILY";
            } else
            if (((String) (obj)).endsWith("staging"))
            {
                obj = "STAGING";
            } else
            {
                obj = "PROD";
            }
        } else
        {
            obj = "UNKNOWN";
        }
        ((TextView) (obj1)).setText(((CharSequence) (obj)));
        debugactivity.d.setOnClickListener(new cmj(debugactivity, as));
        debugactivity.d.setOnLongClickListener(new cmn(debugactivity, as));
        textview = (TextView)debugactivity.findViewById(h.dg);
        obj = (TextView)debugactivity.findViewById(h.fw);
        obj1 = new cmo(debugactivity, textview, ((TextView) (obj)));
        ((TextView) (obj)).setText("REALTIMECHATSERVICE");
        ((TextView) (obj)).setOnClickListener(((android.view.View.OnClickListener) (obj1)));
        obj = String.valueOf(debugactivity.f.e().e().getPath());
        if (((String) (obj)).length() != 0)
        {
            obj = "CONVERSATIONS - DB: ".concat(((String) (obj)));
        } else
        {
            obj = new String("CONVERSATIONS - DB: ");
        }
        textview.setText(((CharSequence) (obj)));
        textview.setOnClickListener(((android.view.View.OnClickListener) (obj1)));
        obj = (CheckBox)debugactivity.findViewById(h.ao);
        ((CheckBox) (obj)).setText("RECORD AFTER EXIT");
        if (aoc.a(debugactivity.getApplicationContext(), debugactivity.j.h(), "DEBUG_RTCS", 0L) > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((CheckBox) (obj)).setChecked(flag);
        ((CheckBox) (obj)).setOnCheckedChangeListener(new cmp(debugactivity));
        debugactivity.startService(c(debugactivity));
    }

    public static void a(DebugActivity debugactivity, View view, Cursor cursor, Runnable runnable)
    {
        debugactivity.a(view, cursor, runnable);
    }

    public static void a(DebugActivity debugactivity, String s, String s1)
    {
        Cursor cursor = debugactivity.f.e().a(s1, null, "conversation_id=?", new String[] {
            s
        }, "sort_timestamp DESC");
        View view = debugactivity.getLayoutInflater().inflate(g.fK, null);
        Button button = (Button)view.findViewById(h.fy);
        Button button1 = (Button)view.findViewById(h.fA);
        Button button2 = (Button)view.findViewById(h.fz);
        if ("conversations_view".equals(s1))
        {
            button.setText("switch to conversation view");
            button.setVisibility(0);
            button.setOnClickListener(new cmb(debugactivity, s));
        }
        button1.setText("show participants");
        button1.setVisibility(0);
        button1.setOnClickListener(new cmc(debugactivity, s, button2, button1, button));
        button2.setText("show messages");
        button2.setVisibility(0);
        button2.setOnClickListener(new clz(debugactivity, s, button2, button1, button));
        ((ListView)view.findViewById(0x102000a)).setAdapter(debugactivity.a(cursor));
        debugactivity.a(view, cursor, ((Runnable) (null)));
    }

    private static void a(StringBuilder stringbuilder, Cursor cursor, String s, String s1)
    {
        stringbuilder.append(s);
        stringbuilder.append("; count == ");
        stringbuilder.append(cursor.getCount());
        stringbuilder.append("\n\n");
        if (cursor.moveToFirst())
        {
            s = (String[])cursor.getColumnNames().clone();
            Arrays.sort(s);
            int l1 = s.length;
            int j1 = 0;
            int i1 = 0;
            for (; j1 < l1; j1++)
            {
                i1 = Math.max(i1, s[j1].length());
            }

            do
            {
                stringbuilder.append(">>>>>>>>>> ");
                stringbuilder.append(s1);
                stringbuilder.append("    ");
                stringbuilder.append(cursor.getString(cursor.getColumnIndex(s1)));
                stringbuilder.append("\n\n");
                int k2 = s.length;
                int k1 = 0;
                while (k1 < k2) 
                {
                    String s2 = s[k1];
                    for (int i2 = 0; i2 <= 0; i2++)
                    {
                        stringbuilder.append("    ");
                    }

                    stringbuilder.append(s2);
                    for (int j2 = (i1 - s2.length()) + 1; j2 >= 0; j2--)
                    {
                        stringbuilder.append(' ');
                    }

                    try
                    {
                        stringbuilder.append(cursor.getString(cursor.getColumnIndex(s2)));
                    }
                    catch (Exception exception)
                    {
                        stringbuilder.append("???");
                    }
                    stringbuilder.append('\n');
                    k1++;
                }
                stringbuilder.append("\n\n");
            } while (cursor.moveToNext());
        }
    }

    public static boolean a(DebugActivity debugactivity, String s)
    {
        ((ClipboardManager)debugactivity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", s));
        Toast.makeText(debugactivity, "Copied to clipboard", 0).show();
        return true;
    }

    public static boolean a(DebugActivity debugactivity, boolean flag)
    {
        debugactivity.k = flag;
        return flag;
    }

    public static Intent b(Context context)
    {
        return c(context);
    }

    public static android.widget.AdapterView.OnItemClickListener b(DebugActivity debugactivity, Cursor cursor)
    {
        return new cmf(debugactivity, cursor);
    }

    private ArrayAdapter b()
    {
        return new cms(this, this, g.gz, h.gz);
    }

    public static aoa b(DebugActivity debugactivity)
    {
        return debugactivity.j;
    }

    private static String b(String s, Object obj)
    {
        if (obj == null)
        {
            return "NULL";
        }
        if ((obj instanceof cvv) || (obj instanceof cxr))
        {
            return obj.getClass().getSimpleName();
        }
        obj = obj.toString();
        s = s.toLowerCase(Locale.US);
        if (s.contains("timestamp") || s.contains("watermark"))
        {
            Object obj1;
            try
            {
                long l1 = Long.parseLong(((String) (obj))) / 1000L;
                obj1 = new Time();
                ((Time) (obj1)).set(l1);
                obj1 = ((Time) (obj1)).format("%c");
            }
            catch (Exception exception)
            {
                eev.c("Babel", String.valueOf(s).concat(" is not a Long"));
                return ((String) (obj));
            }
            return ((String) (obj1));
        }
        if (!"sms_type".equals(s)) goto _L2; else goto _L1
_L1:
        s = null;
        Integer.parseInt(((String) (obj)));
        JVM INSTR tableswitch -1 2: default 160
    //                   -1 208
    //                   0 215
    //                   1 222
    //                   2 229;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        return (new StringBuilder(String.valueOf(obj).length() + 3 + String.valueOf(s).length())).append(((String) (obj))).append(" (").append(s).append(")").toString();
_L4:
        s = "UNKNOWN";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "SMS";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "MMS";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "MMS Notif Ind";
        if (true) goto _L3; else goto _L2
_L2:
        return ((String) (obj));
    }

    private static Intent c(Context context)
    {
        return new Intent(context, com/google/android/apps/hangouts/phone/DebugActivity$RecordingService);
    }

    public static BaseAdapter c(DebugActivity debugactivity, Cursor cursor)
    {
        return debugactivity.a(cursor);
    }

    public static ListView c(DebugActivity debugactivity)
    {
        return debugactivity.e;
    }

    public static ListView d(DebugActivity debugactivity)
    {
        return debugactivity.g;
    }

    public static android.widget.AdapterView.OnItemClickListener e(DebugActivity debugactivity)
    {
        return new cmk(debugactivity);
    }

    public static android.widget.AdapterView.OnItemLongClickListener f(DebugActivity debugactivity)
    {
        return new cml(debugactivity);
    }

    public static ArrayAdapter g(DebugActivity debugactivity)
    {
        return debugactivity.b();
    }

    public static ArrayAdapter h(DebugActivity debugactivity)
    {
        return debugactivity.i;
    }

    public static RecordingService i(DebugActivity debugactivity)
    {
        return debugactivity.h;
    }

    public static aow j(DebugActivity debugactivity)
    {
        return debugactivity.f;
    }

    public static android.widget.AdapterView.OnItemClickListener k(DebugActivity debugactivity)
    {
        return new cmh(debugactivity);
    }

    public static android.widget.AdapterView.OnItemLongClickListener l(DebugActivity debugactivity)
    {
        return new cmi(debugactivity);
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        Object obj;
        obj = (android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo();
        obj = (Cursor)e.getAdapter().getItem(((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position);
        obj = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("conversation_id"));
        menuitem.getItemId();
        JVM INSTR tableswitch 1 3: default 76
    //                   1 85
    //                   2 119
    //                   3 153;
           goto _L1 _L2 _L3 _L4
_L1:
        e.invalidateViews();
        return true;
_L2:
        i = b();
        h.a(i, ((String) (obj)));
        g.setAdapter(i);
        continue; /* Loop/switch isn't completed */
_L3:
        i = b();
        h.a(i, null);
        g.setAdapter(i);
        continue; /* Loop/switch isn't completed */
_L4:
        f.j(((String) (obj)));
        a();
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.fC);
        j = dcn.e(c.a());
        d = (TextView)findViewById(h.aE);
        e = (ListView)findViewById(0x102000a);
        g = (ListView)findViewById(h.fj);
        l = (gqz)a.a(gqz);
        l.b(j.h()).c("preserve_response_data", true).d();
        (new clw(this)).a(new Void[0]);
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        if (view.equals(e))
        {
            contextmenu.add(0, 1, 0, "FOCUS");
            contextmenu.add(0, 2, 0, "CLEAR FOCUS");
            contextmenu.add(0, 3, 0, "REMOVE CONVERSATION");
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 1, 0, "Clear History");
        return true;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        l.b(j.h()).c("preserve_response_data", k).d();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 1: // '\001'
            i.clear();
            break;
        }
        RecordingService.a(h).clear();
        i.notifyDataSetChanged();
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        return true;
    }

    public void onResume()
    {
        super.onResume();
        String s = getIntent().getStringExtra("conversation_id");
        if (s != null)
        {
            getIntent().removeExtra("conversation_id");
            (new Handler()).postDelayed(new cmq(this, s), 100L);
        }
    }

    public void onStart()
    {
        super.onStart();
        Intent intent = new Intent(this, com/google/android/apps/hangouts/phone/DebugActivity$RecordingService);
        if (m == null)
        {
            m = new cmt(this);
        }
        bindService(intent, m, 1);
    }

    public void onStop()
    {
        super.onStop();
        if (m != null)
        {
            unbindService(m);
            m = null;
        }
        if (!((CheckBox)findViewById(h.ao)).isChecked())
        {
            stopService(c(this));
        }
    }


    private class RecordingService extends Service
    {

        private static final SimpleDateFormat e = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        private final Handler a = new Handler();
        private final IBinder b = new cmx(this);
        private ArrayAdapter c;
        private final ArrayList d = new ArrayList();
        private String f;

        public static SimpleDateFormat a()
        {
            return e;
        }

        public static ArrayList a(RecordingService recordingservice)
        {
            return recordingservice.d;
        }

        public static String b(RecordingService recordingservice)
        {
            return recordingservice.f;
        }

        public static ArrayAdapter c(RecordingService recordingservice)
        {
            return recordingservice.c;
        }

        public static Handler d(RecordingService recordingservice)
        {
            return recordingservice.a;
        }

        public void a(ArrayAdapter arrayadapter, String s)
        {
            c = arrayadapter;
            f = s;
            c.clear();
            arrayadapter = d.iterator();
            do
            {
                if (!arrayadapter.hasNext())
                {
                    break;
                }
                s = (Intent)arrayadapter.next();
                if (f == null || TextUtils.equals(s.getStringExtra("conversation_id"), f))
                {
                    c.add(s);
                }
            } while (true);
            c.notifyDataSetChanged();
        }

        public IBinder onBind(Intent intent)
        {
            return b;
        }

        public void onCreate()
        {
            RealTimeChatService.a(new cmv(this));
        }

        public void onDestroy()
        {
        }

        public void onStart(Intent intent, int i1)
        {
        }

        public int onStartCommand(Intent intent, int i1, int j1)
        {
            return 1;
        }


        public RecordingService()
        {
        }
    }

}
