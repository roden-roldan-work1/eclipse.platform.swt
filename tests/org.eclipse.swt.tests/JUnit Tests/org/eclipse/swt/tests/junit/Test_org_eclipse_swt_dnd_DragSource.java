package org.eclipse.swt.tests.junit;

/*
 * (c) Copyright IBM Corp. 2000, 2002. All rights reserved.
 * This file is made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 */

import org.eclipse.swt.dnd.*;
import junit.framework.*;
import junit.textui.*;

/**
 * Automated Test Suite for class org.eclipse.swt.dnd.DragSource
 *
 * @see org.eclipse.swt.dnd.DragSource
 */
public class Test_org_eclipse_swt_dnd_DragSource extends Test_org_eclipse_swt_widgets_Widget {

public Test_org_eclipse_swt_dnd_DragSource(String name) {
	super(name);
}

public static void main(String[] args) {
	TestRunner.run(suite());
}

protected void setUp() {
	super.setUp();
}

protected void tearDown() {
	super.tearDown();
}

public void test_ConstructorLorg_eclipse_swt_widgets_ControlI() {
	warnUnimpl("Test test_ConstructorLorg_eclipse_swt_widgets_ControlI not written");
}

public void test_addDragListenerLorg_eclipse_swt_dnd_DragSourceListener() {
	warnUnimpl("Test test_addDragListenerLorg_eclipse_swt_dnd_DragSourceListener not written");
}

public void test_getControl() {
	warnUnimpl("Test test_getControl not written");
}

public void test_getDisplay() {
	warnUnimpl("Test test_getDisplay not written");
}

public void test_getTransfer() {
	warnUnimpl("Test test_getTransfer not written");
}

public void test_removeDragListenerLorg_eclipse_swt_dnd_DragSourceListener() {
	warnUnimpl("Test test_removeDragListenerLorg_eclipse_swt_dnd_DragSourceListener not written");
}

public void test_setTransfer$Lorg_eclipse_swt_dnd_Transfer() {
	warnUnimpl("Test test_setTransfer$Lorg_eclipse_swt_dnd_Transfer not written");
}

public void test_checkSubclass() {
	warnUnimpl("Test test_checkSubclass not written");
}

public static Test suite() {
	TestSuite suite = new TestSuite();
	java.util.Vector methodNames = methodNames();
	java.util.Enumeration e = methodNames.elements();
	while (e.hasMoreElements()) {
		suite.addTest(new Test_org_eclipse_swt_dnd_DragSource((String)e.nextElement()));
	}
	return suite;
}
public static java.util.Vector methodNames() {
	java.util.Vector methodNames = new java.util.Vector();
	methodNames.addElement("test_ConstructorLorg_eclipse_swt_widgets_ControlI");
	methodNames.addElement("test_addDragListenerLorg_eclipse_swt_dnd_DragSourceListener");
	methodNames.addElement("test_getControl");
	methodNames.addElement("test_getDisplay");
	methodNames.addElement("test_getTransfer");
	methodNames.addElement("test_removeDragListenerLorg_eclipse_swt_dnd_DragSourceListener");
	methodNames.addElement("test_setTransfer$Lorg_eclipse_swt_dnd_Transfer");
	methodNames.addElement("test_checkSubclass");
	methodNames.addAll(Test_org_eclipse_swt_widgets_Widget.methodNames()); // add superclass method names
	return methodNames;
}
protected void runTest() throws Throwable {
	if (getName().equals("test_ConstructorLorg_eclipse_swt_widgets_ControlI")) test_ConstructorLorg_eclipse_swt_widgets_ControlI();
	else if (getName().equals("test_addDragListenerLorg_eclipse_swt_dnd_DragSourceListener")) test_addDragListenerLorg_eclipse_swt_dnd_DragSourceListener();
	else if (getName().equals("test_getControl")) test_getControl();
	else if (getName().equals("test_getDisplay")) test_getDisplay();
	else if (getName().equals("test_getTransfer")) test_getTransfer();
	else if (getName().equals("test_removeDragListenerLorg_eclipse_swt_dnd_DragSourceListener")) test_removeDragListenerLorg_eclipse_swt_dnd_DragSourceListener();
	else if (getName().equals("test_setTransfer$Lorg_eclipse_swt_dnd_Transfer")) test_setTransfer$Lorg_eclipse_swt_dnd_Transfer();
	else if (getName().equals("test_checkSubclass")) test_checkSubclass();
	else super.runTest();
}
}
