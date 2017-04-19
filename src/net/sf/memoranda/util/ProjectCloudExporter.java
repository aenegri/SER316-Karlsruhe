package net.sf.memoranda.util;

import net.sf.memoranda.Project;

import java.io.File;

/**
 * Created by Andrew on 4/19/2017.
 */
public class ProjectCloudExporter {

    public static File exportProject(Project project) {
        File temp = new File("temp");
        ProjectPackager.pack(project, temp);
        File zip = new File("temp.zip");

        return zip;
    }
}
