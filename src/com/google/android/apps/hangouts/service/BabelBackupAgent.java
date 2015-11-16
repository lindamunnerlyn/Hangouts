// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.service;

import android.app.backup.BackupAgentHelper;
import android.app.backup.FullBackupDataOutput;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.pm.ApplicationInfo;
import android.os.ParcelFileDescriptor;
import eev;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class BabelBackupAgent extends BackupAgentHelper
{

    private static final String a[] = {
        "recentEmoji"
    };

    public BabelBackupAgent()
    {
    }

    private static boolean a(String s)
    {
        boolean flag1 = false;
        String as[] = a;
        int j = as.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!s.startsWith(as[i]))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public void onCreate()
    {
        eev.a("Babel", "BabelBackupAgent.onCreate");
        ArrayList arraylist = new ArrayList();
        arraylist.add(String.valueOf(getPackageName()).concat("_preferences"));
        Collections.addAll(arraylist, a);
        String as[] = (String[])arraylist.toArray(new String[arraylist.size()]);
        eev.a("Babel", "Adding shared pref helper.");
        addHelper("shared_prefs", new SharedPreferencesBackupHelper(this, as));
    }

    public void onFullBackup(FullBackupDataOutput fullbackupdataoutput)
    {
        eev.a("Babel", "BabelBackupAgent.onFullBackup");
        File afile[] = (new File((new File(getApplicationInfo().dataDir)).getAbsolutePath(), "shared_prefs")).listFiles();
        int j = afile.length;
        int i = 0;
        while (i < j) 
        {
            File file = afile[i];
            String s = file.getName();
            if (!a(s))
            {
                if (eev.a("Babel", 3))
                {
                    s = String.valueOf(s);
                    if (s.length() != 0)
                    {
                        s = "Skip backing up file: ".concat(s);
                    } else
                    {
                        s = new String("Skip backing up file: ");
                    }
                    eev.c("Babel", s);
                }
            } else
            {
                if (eev.a("Babel", 3))
                {
                    s = String.valueOf(s);
                    if (s.length() != 0)
                    {
                        s = "Backing up file: ".concat(s);
                    } else
                    {
                        s = new String("Backing up file: ");
                    }
                    eev.c("Babel", s);
                }
                fullBackupFile(file, fullbackupdataoutput);
            }
            i++;
        }
    }

    public void onRestoreFile(ParcelFileDescriptor parcelfiledescriptor, long l, File file, int i, long l1, 
            long l2)
    {
        String s;
label0:
        {
            eev.a("Babel", "BabelBackupAgent.onRestoreFile");
            if (i == 1)
            {
                s = file.getName();
                if (a(s))
                {
                    break label0;
                }
                if (eev.a("Babel", 3))
                {
                    parcelfiledescriptor = String.valueOf(s);
                    if (parcelfiledescriptor.length() != 0)
                    {
                        parcelfiledescriptor = "Skip restoring file: ".concat(parcelfiledescriptor);
                    } else
                    {
                        parcelfiledescriptor = new String("Skip restoring file: ");
                    }
                    eev.c("Babel", parcelfiledescriptor);
                }
            }
            return;
        }
        if (eev.a("Babel", 3))
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Restoring file: ".concat(s);
            } else
            {
                s = new String("Restoring file: ");
            }
            eev.c("Babel", s);
        }
        super.onRestoreFile(parcelfiledescriptor, l, file, i, l1, l2);
    }

}
